package com.dorizu.jadwalkuliah.di

import com.dorizu.jadwalkuliah.data.ScheduleRepository
import com.dorizu.jadwalkuliah.domain.repository.IScheduleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module(includes = [DatabaseModule::class])
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRepository(scheduleRepository: ScheduleRepository): IScheduleRepository
}