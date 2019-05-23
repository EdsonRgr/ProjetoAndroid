package com.example.aluno.aplicao_c_banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import org.jetbrains.anko.startActivity

class index : AppCompatActivity() {

    lateinit var newpass : Button
    lateinit var btnsair : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_index)

        val newpass :  Button = findViewById<Button>(R.id.newpass)
        val btnsair :  Button = findViewById<Button>(R.id.btnsair)

        btnsair.setOnClickListener{
            startActivity<aplicacao>()

        }


        newpass.setOnClickListener{
            startActivity<cadastrarsenha>()

        }
    }
}
