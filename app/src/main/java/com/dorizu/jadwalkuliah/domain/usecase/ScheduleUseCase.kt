package com.dorizu.jadwalkuliah.domain.usecase

import com.dorizu.jadwalkuliah.domain.model.*
import com.dorizu.jadwalkuliah.domain.repository.IScheduleRepository
import javax.inject.Inject

class ScheduleUseCase @Inject constructor(private val repository: IScheduleRepository): IScheduleUseCase {
    override suspend fun insertStudent(student: Student) = repository.insertStudent(student)

    override suspend fun insertLecture(lecturer: Lecture) = repository.insertLecture(lecturer)

    override suspend fun insertCollageClass(collageClass: CollageClass) = repository.insertCollageClass(collageClass)

    override suspend fun insertCourse(course: Course) = repository.insertCourse(course)

    override suspend fun insertSchedule(schedule: Schedule) = repository.insertSchedule(schedule)

    override suspend fun getAllStudent(): List<Student> = repository.getAllStudent()

    override suspend fun getALlLecture(): List<Lecture> = repository.getALlLecture()

    override suspend fun getALlClass(): List<CollageClass> = repository.getALlClass()

    override suspend fun getAllCourse(): List<Course> = repository.getAllCourse()

    override suspend fun getAllSchedule(): List<Schedule> = repository.getAllSchedule()

    override suspend fun getScheduleByClassStudentKey(classKey: String): List<Schedule> = repository.getScheduleByClassStudentKey(classKey)
}