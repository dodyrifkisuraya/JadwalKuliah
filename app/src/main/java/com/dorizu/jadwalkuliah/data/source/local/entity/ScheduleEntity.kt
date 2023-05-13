package com.dorizu.jadwalkuliah.data.source.local.entity

import androidx.room.*

@Entity(tableName = "schedule")
data class ScheduleEntity(
    @PrimaryKey
    @ColumnInfo(name = "key")
    val key: String,

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

data class ScheduleWithRelations(
    @Embedded val schedule: ScheduleEntity,

    @Relation(parentColumn = "class_key", entityColumn = "class_code")
    val classEntity: CollageClassEntity?,

    @Relation(parentColumn = "lecture_key", entityColumn = "nip")
    val lecturerEntity: LecturerEntity?,

    @Relation(parentColumn = "course_key", entityColumn = "course_code")
    val courseEntity: CourseEntity?,

    @Relation(
        parentColumn = "key",
        entityColumn = "nim",
        associateBy = Junction(StudentJoinSchedule::class)
    )
    val listStudent: List<StudentEntity>
)
