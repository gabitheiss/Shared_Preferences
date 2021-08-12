package com.example.sharedpreferences.model

import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName ("firtsname") val firtsname: String,
    @SerializedName("lastname") val lastname: String
)
