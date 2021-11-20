package org.sopt.study.woorido.detail.data

import java.util.*

data class ResponseData(
    val status : Int,
    val success : Boolean,
    val message : String,
    val data : List<Data>
) {
    data class  Data(
        val code : Int,
        val userId : Int,
        val temperature : Float,
        val username : String,
        val profileImage : String,
        val isDeleted : Boolean,
        val id : Int,
        val createdAt : Date,
    )
}
