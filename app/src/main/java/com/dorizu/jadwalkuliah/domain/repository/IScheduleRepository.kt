package com.dorizu.jadwalkuliah.domain.repository

import com.dorizu.jadwalkuliah.data.ResultState
import com.dorizu.jadwalkuliah.domain.model.*
import io.reactivex.Flowable

interface IScheduleRepository {
    fun insertStudent(student: Student)

    fun insertLecture(lecturer: Lecture)

    fun insertCollageClass(collageClass: CollageClass)

    fun insertCourse(course: Course)

    fun insertSchedule(schedule: Schedule)

    fun getAllStudent(): Flowable<ResultState<List<Student>>>

    fun getALlLecture(): Flowable<ResultState<List<Lecture>>>

    fun getALlClass(): Flowable<ResultState<List<CollageClass>>>

    fun getAllCourse(): Flowable<ResultState<List<Course>>>

    fun getAllSchedule(): Flowable<ResultState<List<Schedule>>>

    fun getScheduleByClassStudentKey(classKey: String): Flowable<ResultState<List<Schedule>>>
}