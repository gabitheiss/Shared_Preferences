package com.example.sharedpreferences.endpoint

import  retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitApp {


    private val retrofit = Retrofit.Builder()
        .baseUrl("https://fakestoreapi.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    fun criarUsuario(): InterfaceEndpoint {
        return retrofit.create(InterfaceEndpoint::class.java)
    }

}