package com.example.aluno.telacadastro

import android.media.Image
import java.util.*

//Extendemos Parcelable pra que o usuario possa ser passado de uma activity pra outra
//atraves de uma extra inserted
class Usuario(nome: String, email: String, senha: String, login: String){
    var id: Int = -1
    var nome: String = nome
    var email: String = email
    var login: String = login
    var senha: String = senha
    var created: Date = Date()
    lateinit var foto: Image

}