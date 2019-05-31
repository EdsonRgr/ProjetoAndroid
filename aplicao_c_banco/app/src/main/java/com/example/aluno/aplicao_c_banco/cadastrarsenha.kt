package com.example.aluno.aplicao_c_banco

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.lang.Exception

class cadastrarsenha : AppCompatActivity()  {

    lateinit var bntvoltar: Button
    lateinit var btnnewpass: Button

    lateinit var novasenha: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrarsenha)
        val bntvoltar :  Button = findViewById<Button>(R.id.bntvoltar)

        this.btnnewpass = findViewById<Button>(R.id.btnnewpass)
        this.novasenha = findViewById<EditText>(R.id.novasenha);

        bntvoltar.setOnClickListener{
            startActivity<index>()

        }


    }
}
