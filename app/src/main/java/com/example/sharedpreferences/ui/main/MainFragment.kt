package com.example.sharedpreferences.ui.main

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.content.edit
import com.example.sharedpreferences.R

class MainFragment : Fragment() {

    private lateinit var preferences: SharedPreferences

    companion object {
        fun newInstance() = MainFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val inputEmailTextView = view.findViewById<EditText>(R.id.inputEmailTextView)

        preferences =
            requireActivity().getSharedPreferences("preferences_session", Context.MODE_PRIVATE)

        val emailSalvo = preferences.getString("chave email", "")
        if (!emailSalvo.isNullOrEmpty()) {
            inputEmailTextView.setText(emailSalvo)
        }
        view.findViewById<Button>(R.id.buttonSave).apply {
            setOnClickListener {
                preferences.edit {
                    putString("chave email", inputEmailTextView.text.toString())
                    commit()
                }
            }
        }

    }
}

