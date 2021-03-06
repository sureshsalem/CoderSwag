package com.example.coderswag.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.coderswag.Adapter.CategoryAdapter
import com.example.coderswag.Adapter.CategoryRecycleAdapter
import com.example.coderswag.Model.Category
import com.example.coderswag.R
import com.example.coderswag.Services.DataServices
import com.example.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,DataServices.Categories)*/
        adapter = CategoryRecycleAdapter(this, DataServices.Categories) {category ->
           /* println(category.title)*/
            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY,category.title)
            startActivity(productIntent)
            
        }
        categoriesListView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoriesListView.layoutManager =layoutManager
        categoriesListView.setHasFixedSize(true)




    }
}