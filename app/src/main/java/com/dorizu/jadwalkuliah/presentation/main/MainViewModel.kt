package com.dorizu.jadwalkuliah.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.dorizu.jadwalkuliah.domain.model.Schedule
import com.dorizu.jadwalkuliah.domain.usecase.IScheduleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val useCase: IScheduleUseCase) : ViewModel() {

    private val _listSchedule = MutableLiveData<List<Schedule>>()
    val listSchedule: LiveData<List<Schedule>> get() = _listSchedule

    fun insertSchedule(schedule: Schedule) {

    }
}