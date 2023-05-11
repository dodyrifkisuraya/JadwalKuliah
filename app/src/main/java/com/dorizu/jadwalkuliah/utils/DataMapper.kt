package com.dorizu.jadwalkuliah.utils

import com.dorizu.jadwalkuliah.data.source.local.entity.*
import com.dorizu.jadwalkuliah.domain.model.*

object DataMapper {
    fun studentEntityMapToDomain(input: List<StudentEntity>) =
        input.map {
            Student(it.nim, it.name, it.collageClass, it.studyProgram)
        }

    fun scheduleEntitymapToDomain(input: List<ScheduleEntity>) =
        input.map {
            Schedule(it.key, it.classKey, it.lectureKey, it.courseKey, it.startTime, it.endTime)
        }

    fun lecturerEntitymapToDomain(input: List<LecturerEntity>) =
        input.map {
            Lecture(it.nip, it.name, it.lecturerCode)
        }

    fun courseEntitymapToDomain(input: List<CourseEntity>) =
        input.map {
            Course(it.courseCode, it.name)
        }

    fun collageClassEntitymapToDomain(input: List<CollageClassEntity>) =
        input.map {
            CollageClass(it.classCode, it.name)
        }

    fun Student.mapToEntity() = StudentEntity(this.nim, this.name, this.collageClass, this.studyProgram)

    fun Schedule.mapToEntity() = ScheduleEntity(this.key, this.classKey, this.lectureKey, this.courseKey, this.startTime, this.endTime)

    fun Lecture.mapToEntity() = LecturerEntity(this.nip, this.name, this.lecturerCode)

    fun Course.mapToEntity() = CourseEntity(this.courseCode, this.name)

    fun CollageClass.mapToEntity() = CollageClassEntity(this.classCode, this.name)
}