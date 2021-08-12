package com.example.sharedpreferences.model

import com.google.gson.annotations.SerializedName

data class Usuario(

    @SerializedName("id") val id: Int,
    @SerializedName("email") val email: String,
    @SerializedName("username") val username: String,
    @SerializedName("password") val password: String,
    @SerializedName("name")  val name : Name

)
