package com.dorizu.jadwalkuliah.data.source.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.dorizu.jadwalkuliah.data.source.local.entity.*

@Database(entities = [CollageClassEntity::class, CourseEntity::class, LecturerEntity::class, ScheduleEntity::class, StudentEntity::class], version = 1, exportSchema = false)
abstract class ScheduleDatabase: RoomDatabase() {
    abstract fun scheduleDao(): ScheduleDao
}