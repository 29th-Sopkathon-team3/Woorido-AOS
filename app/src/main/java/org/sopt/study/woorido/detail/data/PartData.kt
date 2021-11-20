package org.sopt.study.woorido.detail.data

import java.util.*

data class PartData(
    val code : Int,
    val userId : Int,
    val temperature : Float,
    val username : String,
    val profileImage : String,
    val isDeleted : Boolean,
    val id : Int,
    val createdAt : Date,
)
