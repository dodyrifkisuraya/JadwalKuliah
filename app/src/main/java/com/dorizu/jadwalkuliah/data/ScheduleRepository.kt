package com.dorizu.jadwalkuliah.data

import com.dorizu.jadwalkuliah.data.source.local.entity.*
import com.dorizu.jadwalkuliah.data.source.local.room.ScheduleDao
import com.dorizu.jadwalkuliah.domain.model.*
import com.dorizu.jadwalkuliah.domain.repository.IScheduleRepository
import com.dorizu.jadwalkuliah.utils.DataMapper
import com.dorizu.jadwalkuliah.utils.DataMapper.mapToEntity
import com.dorizu.jadwalkuliah.utils.submit
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ScheduleRepository @Inject constructor(private val scheduleDao: ScheduleDao) :
    IScheduleRepository {
    override fun insertStudent(student: Student) =
        scheduleDao.insertStudent(student.mapToEntity()).submit()


    override fun insertLecture(lecturer: Lecture) =
        scheduleDao.insertLecture(lecturer.mapToEntity()).submit()

    override fun insertCollageClass(collageClass: CollageClass) =
        scheduleDao.insertCollageClass(collageClass.mapToEntity()).submit()

    override fun insertCourse(course: Course) =
        scheduleDao.insertCourse(course.mapToEntity()).submit()

    override fun insertSchedule(schedule: Schedule) =
        scheduleDao.insertSchedule(schedule.mapToEntity()).submit()

    override fun getAllStudent(): Flowable<ResultState<List<Student>>> =
        object : BuilderFlowableModelDomain<List<Student>, List<StudentEntity>>() {
            override fun createCall(): Flowable<List<StudentEntity>> = scheduleDao.getAllStudent()

            override fun mapResponseToDomain(data: List<StudentEntity>): List<Student> =
                DataMapper.studentEntityMapToDomain(data)
        }.asFlowable()


    override fun getALlLecture(): Flowable<ResultState<List<Lecture>>> =
        object : BuilderFlowableModelDomain<List<Lecture>, List<LecturerEntity>>() {
            override fun createCall(): Flowable<List<LecturerEntity>> = scheduleDao.getALlLecture()

            override fun mapResponseToDomain(data: List<LecturerEntity>): List<Lecture> =
                DataMapper.lecturerEntitymapToDomain(data)

        }.asFlowable()

    override fun getALlClass(): Flowable<ResultState<List<CollageClass>>> =
        object : BuilderFlowableModelDomain<List<CollageClass>, List<CollageClassEntity>>() {
            override fun createCall(): Flowable<List<CollageClassEntity>> =
                scheduleDao.getALlClass()

            override fun mapResponseToDomain(data: List<CollageClassEntity>): List<CollageClass> =
                DataMapper.collageClassEntitymapToDomain(data)

        }.asFlowable()

    override fun getAllCourse(): Flowable<ResultState<List<Course>>> =
        object : BuilderFlowableModelDomain<List<Course>, List<CourseEntity>>() {
            override fun createCall(): Flowable<List<CourseEntity>> = scheduleDao.getAllCourse()

            override fun mapResponseToDomain(data: List<CourseEntity>): List<Course> =
                DataMapper.courseEntitymapToDomain(data)

        }.asFlowable()

    override fun getAllSchedule(): Flowable<ResultState<List<Schedule>>> =
        object : BuilderFlowableModelDomain<List<Schedule>, List<ScheduleEntity>>() {
            override fun createCall(): Flowable<List<ScheduleEntity>> = scheduleDao.getAllSchedule()

            override fun mapResponseToDomain(data: List<ScheduleEntity>): List<Schedule> =
                DataMapper.scheduleEntitymapToDomain(data)

        }.asFlowable()

    override fun getScheduleByClassStudentKey(classKey: String): Flowable<ResultState<List<Schedule>>> =
        object : BuilderFlowableModelDomain<List<Schedule>, List<ScheduleEntity>>() {
            override fun createCall(): Flowable<List<ScheduleEntity>> =
                scheduleDao.getScheduleByClassStudentKey(classKey)

            override fun mapResponseToDomain(data: List<ScheduleEntity>): List<Schedule> =
                DataMapper.scheduleEntitymapToDomain(data)

        }.asFlowable()
}