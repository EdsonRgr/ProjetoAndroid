package com.example.aluno.telalogin2_func

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

import org.jetbrains.anko.toast




class telalogin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_telalogin)

        val btLogin : Button = findViewById<Button>(R.id.btLogin)

        btLogin.setOnClickListener(View.OnClickListener {
            val textViewLogin: TextView = findViewById(R.id.etUserName) as TextView
            val textViewSenha: TextView = findViewById(R.id.epSenha) as TextView

            val loginResult : Boolean = SimulaBD.login(
                    textViewLogin.text.toString(),
                    textViewSenha.text.toString())
            if ( loginResult == true ) {
                toast("Login realizado com Sucesso")
            }else{
                toast("Usuario ou Senha incorretos")
            }
        })
    }
}
