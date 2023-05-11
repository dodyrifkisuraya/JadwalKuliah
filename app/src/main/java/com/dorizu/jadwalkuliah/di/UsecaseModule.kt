package com.dorizu.jadwalkuliah.di

import com.dorizu.jadwalkuliah.domain.usecase.IScheduleUseCase
import com.dorizu.jadwalkuliah.domain.usecase.ScheduleUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class UsecaseModule {

    @Binds
    @Singleton
    abstract fun provideScheduleUsecase(scheduleUseCase: ScheduleUseCase): IScheduleUseCase
}