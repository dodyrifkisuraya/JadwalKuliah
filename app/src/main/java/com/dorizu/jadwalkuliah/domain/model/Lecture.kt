package com.dorizu.jadwalkuliah.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Lecture(
    val nip: String,

    val name: String,

    val lecturerCode: String,
) : Parcelable
