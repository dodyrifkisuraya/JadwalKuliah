package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "collage_class")
data class CollageClassEntity(
    @PrimaryKey
    @ColumnInfo(name = "class_code")
    val classCode: String,

    @ColumnInfo(name = "name")
    val name: String,
)
