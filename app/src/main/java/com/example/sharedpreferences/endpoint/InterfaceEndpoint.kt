package com.example.sharedpreferences.endpoint

import com.example.sharedpreferences.model.Usuario
import retrofit2.Call
import retrofit2.http.GET

interface InterfaceEndpoint {

    @GET("/users/1")
    fun buscarUsuario() : Call<Usuario>

}