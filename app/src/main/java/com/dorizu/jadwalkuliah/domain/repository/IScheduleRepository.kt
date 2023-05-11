package com.dorizu.jadwalkuliah.domain.repository

import com.dorizu.jadwalkuliah.domain.model.*

interface IScheduleRepository {
    suspend fun insertStudent(student: Student)

    suspend fun insertLecture(lecturer: Lecture)

    suspend fun insertCollageClass(collageClass: CollageClass)

    suspend fun insertCourse(course: Course)

    suspend fun insertSchedule(schedule: Schedule)

    suspend fun getAllStudent(): List<Student>

    suspend fun getALlLecture(): List<Lecture>

    suspend fun getALlClass(): List<CollageClass>

    suspend fun getAllCourse(): List<Course>

    suspend fun getAllSchedule(): List<Schedule>

    suspend fun getScheduleByClassStudentKey(classKey: String): List<Schedule>
}