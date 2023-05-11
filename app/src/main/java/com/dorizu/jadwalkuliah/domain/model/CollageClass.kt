package com.dorizu.jadwalkuliah.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CollageClass(
    val classCode: String,

    val name: String,
) : Parcelable
