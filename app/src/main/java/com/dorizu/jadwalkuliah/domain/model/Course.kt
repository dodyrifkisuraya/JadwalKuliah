package com.dorizu.jadwalkuliah.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Course(
    val courseCode: String,

    val name: String,
) : Parcelable
