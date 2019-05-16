package com.example.firebase.firebase

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class testactivity : AppCompatActivity() {

    lateinit var btnSingUp: Button
    lateinit var btnLogin: Button
    lateinit var lbEmailDoUsuarioLogado : TextView
    lateinit var fbAuth : FirebaseAuth
    lateinit var txtEmail: EditText
    lateinit var txtPass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_testactivity)

        this.lbEmailDoUsuarioLogado = findViewById<TextView>(R.id.lbEmailDoUsuarioLogado);
        this.fbAuth = FirebaseAuth.getInstance()
        this.txtEmail = findViewById<EditText>(R.id.txtEmail);
        this.txtPass = findViewById<EditText>(R.id.txtPass);
        this.btnSingUp = findViewById<Button>(R.id.btnSingUp);
        this.btnLogin = findViewById<Button>(R.id.btnLogin);

    }

    public override fun onStart() {
        super.onStart()

        val currentUser = this.fbAuth.currentUser
        updateUI(currentUser)
    }

    private fun updateUI(user: FirebaseUser?){
        if (user != null) {
            this.lbEmailDoUsuarioLogado.text = user.email
        } else{
            this.lbEmailDoUsuarioLogado.text = "Nenhum User Logado"
        }
    }

    private fun singUp(){
        this.fbAuth.createUserWithEmailAndPassword(this.txtEmail, this.txtPass)
                .addOnCanceledListener (this){
                    if (task.isSuccessful){
                        Log.d(TAG, "createUserWithEmail:sucesse")
                        val user =
                    }
                }


    }
}
