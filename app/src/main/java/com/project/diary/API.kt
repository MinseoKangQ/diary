package com.project.diary

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

// SpringBoot API 이용하는 경우 사용
interface API {

    // 로그인 기능
    @POST("android")
    fun getLoginResponse(@Body user: User) : Call<String>
}