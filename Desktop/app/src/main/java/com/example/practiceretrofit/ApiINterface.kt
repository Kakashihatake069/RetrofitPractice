package com.example.practiceretrofit

import retrofit2.Call
import retrofit2.http.GET


interface ApiINterface {


    @GET("/posts")
    fun getAllProducts() : Call<List<ResponseItem>>

}