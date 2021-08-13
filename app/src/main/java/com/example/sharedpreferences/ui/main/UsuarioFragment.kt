package com.example.sharedpreferences.ui.main

import android.content.Intent
import android.os.Bundle
import android.telecom.Call
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.sharedpreferences.MainActivity
import com.example.sharedpreferences.R
import com.example.sharedpreferences.endpoint.RetrofitApp
import com.example.sharedpreferences.model.Usuario
import retrofit2.Callback
import retrofit2.Response



class UsuarioFragment : Fragment(), Callback<Usuario> {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.usuario_activity, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val carregar = RetrofitApp.criarUsuario().buscarUsuario()
        carregar.clone().enqueue(this)
    }


    //preenche na tela os dados vindos da api
    override fun onResponse(call: retrofit2.Call<Usuario>, response: Response<Usuario>) {

        response.body()?.apply {

            view?.findViewById<TextView>(R.id.idId)?.text = this.id.toString()
            view?.findViewById<TextView>(R.id.idEmail)?.text = this.email
            view?.findViewById<TextView>(R.id.idUsername)?.text = this.username
            view?.findViewById<TextView>(R.id.idPassword)?.text = this.password
            view?.findViewById<TextView>(R.id.idFirstname)?.text = this.name.firstname
            view?.findViewById<TextView>(R.id.idLastname)?.text = this.name.lastname

        }

    }

    override fun onFailure(call: retrofit2.Call<Usuario>, t: Throwable) {
        println("FALHA")


    }
}