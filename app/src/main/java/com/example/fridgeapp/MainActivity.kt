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

        createListBtn.setOnClickListener{
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        /*

        val listView = findViewById<ListView>(R.id.listView)
        var foodList = ArrayList<String>()

        foodList.add("Avocado")
        foodList.add("Orange Juice")
        foodList.add("Bread")

        var foodArrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,foodList)

        listView.adapter = foodArrayAdapter

         */

    }
}