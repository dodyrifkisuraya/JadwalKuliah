package com.dorizu.jadwalkuliah.domain.usecase

import com.dorizu.jadwalkuliah.data.ResultState
import com.dorizu.jadwalkuliah.domain.model.*
import com.dorizu.jadwalkuliah.domain.repository.IScheduleRepository
import io.reactivex.Flowable
import javax.inject.Inject

class ScheduleUseCase @Inject constructor(private val repository: IScheduleRepository): IScheduleUseCase {
    override fun insertStudent(student: Student) = repository.insertStudent(student)

    override fun insertLecture(lecturer: Lecture) = repository.insertLecture(lecturer)

    override fun insertCollageClass(collageClass: CollageClass) = repository.insertCollageClass(collageClass)

    override fun insertCourse(course: Course) = repository.insertCourse(course)

    override fun insertSchedule(schedule: Schedule) = repository.insertSchedule(schedule)

    override fun getAllStudent(): Flowable<ResultState<List<Student>>> = repository.getAllStudent()

    override fun getALlLecture(): Flowable<ResultState<List<Lecture>>> = repository.getALlLecture()

    override fun getALlClass(): Flowable<ResultState<List<CollageClass>>> = repository.getALlClass()

    override fun getAllCourse(): Flowable<ResultState<List<Course>>> = repository.getAllCourse()

    override fun getAllSchedule(): Flowable<ResultState<List<Schedule>>> = repository.getAllSchedule()

    override fun getScheduleByClassStudentKey(classKey: String): Flowable<ResultState<List<Schedule>>> = repository.getScheduleByClassStudentKey(classKey)
}