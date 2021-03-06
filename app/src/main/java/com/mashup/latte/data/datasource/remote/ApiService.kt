package com.mashup.latte.data.datasource.remote

import com.mashup.latte.data.dto.request.AlcoholRequest
import com.mashup.latte.data.dto.request.TokenRequest
import com.mashup.latte.data.dto.response.DiariesResponse
import com.mashup.latte.data.dto.response.TokenResponse
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @GET("/api/v1/diaries")
    fun requestDiaries(): Single<DiariesResponse>

    @POST("/auth/convert-token/")
    fun getLoginToken(@Body token: TokenRequest): Single<TokenResponse>

    @POST("/api/v1/diaries")
    fun postDiary(@Body alcoholRequest: AlcoholRequest): Call<Unit>

}