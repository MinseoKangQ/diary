package com.project.diary

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {

    var api: API
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://223.194.131.72:8080/connection/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        api = retrofit.create(API::class.java)
    }
}