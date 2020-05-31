package com.example.coderswag.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.coderswag.Model.Category
import com.example.coderswag.R

class CategoryRecycleAdapter(val context: Context, var categories: List<Category>): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
       val view = LayoutInflater.from(parent?.context).inflate(R.layout.category_list_item,parent,false)
        return Holder(view)

    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position],context)


    }



    inner class Holder(itemView: View): RecyclerView.ViewHolder(itemView){

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoyImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resoureId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage?.setImageResource(resoureId)
            categoryName?.text = category.title


        }

    }
}