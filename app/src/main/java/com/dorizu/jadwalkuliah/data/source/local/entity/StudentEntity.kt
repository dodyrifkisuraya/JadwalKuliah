package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "student")
data class StudentEntity(
    @PrimaryKey
    @ColumnInfo(name = "nim")
    val nim: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "collage_class")
    val collageClass: String,

    @ColumnInfo(name = "study_program")
    val studyProgram: String,
)
