package com.nkufall2021clintonschultz.finalprojectretrofit

import com.example.com.nkufall2021clintonschultz.finalprojectretrofit.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    @GET("users/")

fun fetchAllUsers(): Call<List<User>>
}