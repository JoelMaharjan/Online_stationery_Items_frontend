
@file:Suppress("Annotator")



package com.Joel.merostationery.api

import com.Joel.merostationery.InsertResponse
import com.example.Online_Stationary.Response.ImageResponse
import com.example.Online_Stationary.Response.LoginResponse
import com.Joel.merostationery.entity.Register
import okhttp3.MultipartBody
import retrofit2.Response
import retrofit2.http.*

interface api {

    @POST("/insert")
    suspend fun Register(@Body user: Register):Response<InsertResponse>

    @FormUrlEncoded
    @POST("/login")
    suspend fun Login(@Field("username") username:String,
                      @Field("password") password:String):Response<LoginResponse>


    @Multipart
    @PUT("/photo/{id}")
    suspend fun addPhoto(
        @Path("id") id: String,
        @Part file: MultipartBody.Part
    ):Response<ImageResponse>



}