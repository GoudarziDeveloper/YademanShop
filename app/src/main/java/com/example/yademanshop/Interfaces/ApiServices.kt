package com.example.yademanshop.Interfaces

import com.example.yademanshop.LoginData
import com.example.yademanshop.Models.User
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

class ApiServices {
    interface ApiService {
        @POST("jwt-auth/v1/token")
        fun getUsers(@Body body: LoginData?):Call<List<User>>
    }
    fun getApi() : ApiService =
            Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("http://192.168.1.4/yademan/wp-json/")
                    .build()
                    .create(ApiService::class.java)
}