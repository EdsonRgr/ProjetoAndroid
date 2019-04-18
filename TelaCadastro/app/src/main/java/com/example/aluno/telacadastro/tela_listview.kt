package com.example.aluno.telacadastro

import android.os.Bundle
import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.ListView

import kotlinx.android.synthetic.main.activity_tela_listview.*
import org.jetbrains.anko.toolbar

class tela_listview : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_listview)


        var listView = findViewById<ListView>(R.id.listview)


        val arraylistview: ArrayList<String> = ArrayList<String>()
        arraylistview.add("Item 1")
        arraylistview.add("Item 2")
        arraylistview.add("Item 3")
        arraylistview.add("Item 4")
        arraylistview.add("Item 5")

        listView.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, arraylistview)

    }


}
