package com.example.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.sharedpreferences.endpoint.RetrofitApp
import com.example.sharedpreferences.model.Usuario
import com.example.sharedpreferences.ui.main.LoginFragment
import com.example.sharedpreferences.ui.main.UsuarioFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activiity_main)

        replaceFrag(LoginFragment.newInstance())
    }

    fun replaceFrag(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .commitNow()
    }


}