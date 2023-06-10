package com.project.diary

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

// SpringBoot API 이용하는 경우 사용
object RetrofitBuilder {

    var api: API
    init {
        val retrofit = Retrofit.Builder()
            // ipconfig getifaddr en0 명령어 입력 후 주소
            .baseUrl("http://192.168.0.21:8080/connection/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(API::class.java)
    }
}