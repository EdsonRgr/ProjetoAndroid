package com.example.aluno.aplicao_c_banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.startActivity

class cadastrar : AppCompatActivity() {
             lateinit var btnvoltar2 : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar)

        val bntvoltar2 = findViewById<Button>(R.id.btnvoltar2)

        bntvoltar2.setOnClickListener{
            startActivity<aplicacao>()

        }


    }
}
