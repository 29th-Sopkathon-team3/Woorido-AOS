package org.sopt.study.woorido.detail.api

import org.sopt.study.woorido.detail.data.ResponseData
import retrofit2.Call
import retrofit2.http.GET

interface OnlyOneService {

    @GET("rank/111111")
    fun getOnlyOne(

    ): Call<ResponseData>
}