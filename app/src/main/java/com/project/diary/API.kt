package com.project.diary

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface API {
    //login
    @POST("android")
    fun getLoginResponse(@Body user: User) : Call<String>
}