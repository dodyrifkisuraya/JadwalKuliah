package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "course")
data class CourseEntity(
    @PrimaryKey
    @ColumnInfo(name = "course_code")
    val courseCode: String,

    @ColumnInfo(name = "name")
    val name: String,
)
