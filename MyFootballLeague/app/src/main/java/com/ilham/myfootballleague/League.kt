package com.ilham.myfootballleague

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class League(
    val logo: Int?,val name: String?, val description: String?
) : Parcelable