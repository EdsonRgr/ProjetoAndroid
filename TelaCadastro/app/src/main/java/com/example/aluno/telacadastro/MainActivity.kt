package com.example.aluno.telacadastro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val btnincluir : Button = findViewById<Button>(R.id.incluir)
        val btnlimpar : Button = findViewById<Button>(R.id.limpar)

        btnincluir.setOnClickListener(View.OnClickListener {
        })

        btnlimpar.setOnClickListener(View.OnClickListener {
            val txtnome = txtnome.text.clear()
            val txtemail = txtemail.text.clear()
            val txtlogin = txtlogin.text.clear()
            val txtsenha = txtsenha.text.clear()

        })


    }
}
