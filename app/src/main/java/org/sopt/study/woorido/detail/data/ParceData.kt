package org.sopt.study.woorido.detail.data

import android.os.Parcelable
import androidx.versionedparcelable.VersionedParcelize
import kotlinx.parcelize.Parcelize

@Parcelize
data class ParceData(
    var userName : String,
    var userImg : String,
    var userId : Int,
) : Parcelable
