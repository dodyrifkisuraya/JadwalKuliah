package com.dorizu.jadwalkuliah.data.source.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.dorizu.jadwalkuliah.data.source.local.entity.*

@Dao
interface ScheduleDao {
    @Insert
    fun insertStudent(student: StudentEntity)

    @Insert
    fun insertLecture(lecturer: LecturerEntity)

    @Insert
    fun insertCollageClass(collageClass: CollageClassEntity)

    @Insert
    fun insertCourse(course: CourseEntity)

    @Insert
    fun insertSchedule(schedule: ScheduleEntity)

    @Query("SELECT * FROM student")
    fun getAllStudent(): List<StudentEntity>

    @Query("SELECT * FROM lecture")
    fun getALlLecture(): List<LecturerEntity>

    @Query("SELECT * FROM collage_class")
    fun getALlClass(): List<CollageClassEntity>

    @Query("SELECT * FROM course")
    fun getAllCourse(): List<CourseEntity>

    @Query("SELECT * FROM schedule")
    fun getAllSchedule(): List<ScheduleEntity>

    @Query("SELECT * FROM schedule WHERE class_key = :classKey")
    fun getScheduleByClassStudentKey(classKey: String): List<ScheduleEntity>
}