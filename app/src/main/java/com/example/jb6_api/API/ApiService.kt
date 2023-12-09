package com.example.jb6_api.API

import com.example.jb6_api.ResponseMorty
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("character")
    fun getMorty () : Call<ResponseMorty>



}