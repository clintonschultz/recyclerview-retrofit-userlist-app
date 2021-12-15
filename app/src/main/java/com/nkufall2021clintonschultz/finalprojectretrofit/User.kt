package com.example.com.nkufall2021clintonschultz.finalprojectretrofit

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class User(

    val name: String,
    val username: String,
    val email: String,
    val phone: String,
    val website: String
)
