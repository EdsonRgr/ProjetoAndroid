package com.example.aluno.aplicao_c_banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_cadastrarsenha.*
import org.jetbrains.anko.startActivity

class cadastrarsenha : AppCompatActivity() {

    lateinit var bntvoltar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrarsenha)
        val bntvoltar :  Button = findViewById<Button>(R.id.bntvoltar)

        bntvoltar.setOnClickListener{
            startActivity<index>()

        }


    }
}
