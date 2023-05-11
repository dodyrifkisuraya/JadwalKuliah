package com.dorizu.jadwalkuliah.data

import com.dorizu.jadwalkuliah.data.source.local.room.ScheduleDao
import com.dorizu.jadwalkuliah.domain.model.*
import com.dorizu.jadwalkuliah.domain.repository.IScheduleRepository
import com.dorizu.jadwalkuliah.utils.DataMapper
import com.dorizu.jadwalkuliah.utils.DataMapper.mapToEntity
import javax.inject.Singleton

@Singleton
class ScheduleRepository (private val scheduleDao: ScheduleDao) : IScheduleRepository {
    override suspend fun insertStudent(student: Student) = scheduleDao.insertStudent(student.mapToEntity())

    override suspend fun insertLecture(lecturer: Lecture) = scheduleDao.insertLecture(lecturer.mapToEntity())

    override suspend fun insertCollageClass(collageClass: CollageClass) = scheduleDao.insertCollageClass(collageClass.mapToEntity())

    override suspend fun insertCourse(course: Course) = scheduleDao.insertCourse(course.mapToEntity())

    override suspend fun insertSchedule(schedule: Schedule) =
        scheduleDao.insertSchedule(schedule.mapToEntity())

    override suspend fun getAllStudent(): List<Student> =
        DataMapper.studentEntityMapToDomain(scheduleDao.getAllStudent())

    override suspend fun getALlLecture(): List<Lecture> =
        DataMapper.lecturerEntitymapToDomain(scheduleDao.getALlLecture())

    override suspend fun getALlClass(): List<CollageClass> =
        DataMapper.collageClassEntitymapToDomain(scheduleDao.getALlClass())

    override suspend fun getAllCourse(): List<Course> =
        DataMapper.courseEntitymapToDomain(scheduleDao.getAllCourse())

    override suspend fun getAllSchedule(): List<Schedule> =
        DataMapper.scheduleEntitymapToDomain(scheduleDao.getAllSchedule())

    override suspend fun getScheduleByClassStudentKey(classKey: String): List<Schedule> =
        DataMapper.scheduleEntitymapToDomain(scheduleDao.getScheduleByClassStudentKey(classKey))
}