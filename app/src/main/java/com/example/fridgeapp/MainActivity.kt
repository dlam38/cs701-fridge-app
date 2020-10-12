package com.example.fridgeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  actionBar = supportActionBar

        actionBar!!.title = "Fridge Friend"

        createListBtn.setOnClickListener{
            val intent = Intent(this, CreateList::class.java)
            startActivity(intent)
        }
    }
}