package com.dorizu.jadwalkuliah.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dorizu.jadwalkuliah.data.ResultState
import com.dorizu.jadwalkuliah.domain.model.Schedule
import com.dorizu.jadwalkuliah.domain.usecase.IScheduleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val useCase: IScheduleUseCase) : ViewModel() {

    init {
        useCase.insertSchedule(Schedule("1", "R03-GKU", "BPA", "PBW", "08:00", "10:00"))
        useCase.insertSchedule(Schedule("2", "R07-GKU", "IZM", "IMA", "13:00", "16:00"))
    }

    private val _listSchedule = MutableLiveData<ResultState<List<Schedule>>>()
    val listSchedule: LiveData<ResultState<List<Schedule>>> get() = _listSchedule

    fun getSchedule(){
        val disposable = useCase.getAllSchedule()
            .subscribe{res ->
                _listSchedule.value = res
            }
        mCompositeDisposable.add(disposable)
    }

    companion object{
        private val mCompositeDisposable = CompositeDisposable()
    }
}