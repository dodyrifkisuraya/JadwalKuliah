package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lecture")
data class LecturerEntity(
    @PrimaryKey
    @ColumnInfo(name = "nip")
    val nip: String,

    @ColumnInfo(name = "name")
    val name: String,

    @ColumnInfo(name = "lecturer_code")
    val lecturerCode: String,
)
