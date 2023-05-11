package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schedule")
data class ScheduleEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "key")
    val key: Int,

    @ColumnInfo(name = "class_key")
    val classKey: String,

    @ColumnInfo(name = "lecture_key")
    val lectureKey: String,

    @ColumnInfo(name = "course_key")
    val courseKey: String,

    @ColumnInfo(name = "start_time")
    val startTime: String,

    @ColumnInfo(name = "end_time")
    val endTime: String,
)
