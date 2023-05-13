package com.dorizu.jadwalkuliah.data

import io.reactivex.BackpressureStrategy
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import io.reactivex.subjects.PublishSubject

abstract class BuilderFlowableModelDomain<ResultType, RequestType> {
    private val result = PublishSubject.create<ResultState<ResultType>>()
    private val mCompositeDisposable = CompositeDisposable()

    init {
        fetch()
    }

    protected abstract fun createCall(): Flowable<RequestType>

    protected abstract fun mapResponseToDomain(data: RequestType): ResultType

    private fun fetch(){
        val client = createCall()

        val response = client
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .take(1)
            .doOnComplete {
                mCompositeDisposable.dispose()
            }
            .subscribe { res->
                result.onNext(ResultState.Loading())
                result.onNext(
                    ResultState.Success(
                        mapResponseToDomain(res)
                    )
                )
            }
        mCompositeDisposable.add(response)
    }

    fun asFlowable(): Flowable<ResultState<ResultType>> = result.toFlowable(BackpressureStrategy.BUFFER)
}