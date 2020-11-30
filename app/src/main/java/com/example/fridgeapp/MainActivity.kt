package com.example.fridgeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

const val moveToListActivity = "com.example.fridgeapp.ListActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val  actionBar = supportActionBar

        actionBar!!.title = "Fridge Friend"

        //When the start button is clicked, the app moves on to the list activity
        createListBtn.setOnClickListener{
            val intent = Intent(this, CreateList::class.java)
            startActivity(intent)
        }
    }
}