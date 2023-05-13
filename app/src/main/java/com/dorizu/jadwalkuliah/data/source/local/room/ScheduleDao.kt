package com.dorizu.jadwalkuliah.data.source.local.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.dorizu.jadwalkuliah.data.source.local.entity.*
import io.reactivex.Completable
import io.reactivex.Flowable

@Dao
interface ScheduleDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertStudent(student: StudentEntity): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertLecture(lecturer: LecturerEntity): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCollageClass(collageClass: CollageClassEntity): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCourse(course: CourseEntity): Completable

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertSchedule(schedule: ScheduleEntity): Completable

    @Query("SELECT * FROM student")
    fun getAllStudent(): Flowable<List<StudentEntity>>

    @Query("SELECT * FROM lecture")
    fun getALlLecture(): Flowable<List<LecturerEntity>>

    @Query("SELECT * FROM collage_class")
    fun getALlClass(): Flowable<List<CollageClassEntity>>

    @Query("SELECT * FROM course")
    fun getAllCourse(): Flowable<List<CourseEntity>>

    @Query("SELECT * FROM schedule")
    fun getAllSchedule(): Flowable<List<ScheduleEntity>>

    @Query("SELECT * FROM schedule WHERE class_key = :classKey")
    fun getScheduleByClassStudentKey(classKey: String): Flowable<List<ScheduleEntity>>
}