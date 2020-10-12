package com.example.fridgeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class CreateList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_list)

        val  actionBar = supportActionBar

        actionBar!!.title = "Lets Create a List!"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}