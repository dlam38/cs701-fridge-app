package com.example.fridgeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.SparseBooleanArray
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_create_list.*

class CreateList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_list)

        val  actionBar = supportActionBar

        actionBar!!.title = "Fridge Friend"
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Initializing the array lists and the adapter

        //var itemlist = arrayListOf<String>() //old

        //NEW: initializing 2d- arraylist
        //var newItemList = arrayListOf<ArrayList<String>>()

        var newItemList = arrayListOf<String>()

        //initializing adapter
        // NEW: now w/ newItemlist
        //ArrayAdapter<ArrayList<String>>(this, android.R.layout.select_dialog_multichoice, newItemList)
        var adapter = ArrayAdapter<String>(this, android.R.layout.select_dialog_multichoice, newItemList)

        // Adding the items to the list when the add button is pressed
        add.setOnClickListener {

            //itemlist.add(food.text.toString()) //old

            //NEW: arrayList of strings called tempItem
            //var tempItem = arrayListOf<String>()
            //tempItem.add(food.text.toString())
            //tempItem.add(quantity.text.toString())
            //tempItem.add(expiration.text.toString())

            //OLD:
            //itemlist.add(food)


            //              tempItem

            var tempString = food.text.toString() + "            " + quantity.text.toString() + "                 "  + expiration.text.toString()
            newItemList.add(tempString)


            listView.adapter =  adapter
                    //Notifies the attached observers that the underlying data has been changed
                    //  and any View reflecting the data set should refresh itself.
            adapter.notifyDataSetChanged()
            // This is because every time when you add the item the edit text space will be cleared
            //and go back to the place holder default
            food.text.clear()
            quantity.text.clear()
            expiration.text.clear()
        }


        // Selecting and Deleting the items from the list when the delete button is pressed
        delete.setOnClickListener {
            val position: SparseBooleanArray = listView.checkedItemPositions
            val count = listView.count
            var item = count - 1
            while (item >= 0) {
                if (position.get(item))
                {
                    adapter.remove(newItemList.get(item))
                }
                item--
            }
            position.clear()
            adapter.notifyDataSetChanged()
        }



        // Clearing all the items in the list when the clear button is pressed
        clear.setOnClickListener {

            newItemList.clear()
            adapter.notifyDataSetChanged()

        }



        // Adding the toast message to the list when an item on the list is pressed
        listView.setOnItemClickListener { adapterView, view, i, l ->
            android.widget.Toast.makeText(this, "You Selected the item --> "+newItemList.get(i), android.widget.Toast.LENGTH_SHORT).show()
        }





    }
}