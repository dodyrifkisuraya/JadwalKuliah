package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.*

@Entity(tableName = "student")
data class StudentEntity(
    @PrimaryKey
    @ColumnInfo(name = "nim")
    var nim: String,

    @ColumnInfo(name = "name")
    var name: String,

    @ColumnInfo(name = "collage_class")
    var collageClass: String,

    @ColumnInfo(name = "study_program")
    var studyProgram: String,
)

data class StudentWithRelation(
    @Embedded
    var studentEntity: StudentEntity,

    @Relation(
        parentColumn = "nim",
        entityColumn = "key",
        associateBy = Junction(StudentJoinSchedule::class)
    )
    var listSchedule: List<ScheduleEntity> = emptyList()
)
