package com.dorizu.jadwalkuliah.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Schedule(
    val key: Int,

    val classKey: String,

    val lectureKey: String,

    val courseKey: String,

    val startTime: String,

    val endTime: String,
) : Parcelable
