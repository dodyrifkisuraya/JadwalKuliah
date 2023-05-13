package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.Entity

@Entity(tableName = "student_join_schedule", primaryKeys = ["nim", "key"])
data class StudentJoinSchedule(
    val nim: String,
    val key: String
)