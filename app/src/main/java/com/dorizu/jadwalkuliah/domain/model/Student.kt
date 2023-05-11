package com.dorizu.jadwalkuliah.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Student(
    val nim: String,

    val name: String,

    val collageClass: String,

    val studyProgram: String,
): Parcelable