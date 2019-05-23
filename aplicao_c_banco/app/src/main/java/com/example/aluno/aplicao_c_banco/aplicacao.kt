package com.example.aluno.aplicao_c_banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.aluno.aplicao_c_banco.R.layout.activity_cadastrarsenha
import com.example.aluno.aplicao_c_banco.R.styleable.View
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast



class aplicacao : AppCompatActivity() {

    lateinit var btnlogin: Button
    lateinit var btncadastrar: Button



    //val btnlogin: Button = findViewById<Button>(R.id.btnlogin)
    //val btncadastrar: Button = findViewById<Button>(R.id.btncadastrar)
    //val btnmudarsenha :  Button = findViewById<Button>(R.id.btnmudarsenha)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aplicacao)

        val btnlogin: Button = findViewById<Button>(R.id.btnlogin)
        val btncadastrar: Button = findViewById<Button>(R.id.btncadastrar)

        btnlogin.setOnClickListener{
            startActivity<index>()

        }

        btncadastrar.setOnClickListener{
            startActivity<cadastrar>()

        }


    }
}
