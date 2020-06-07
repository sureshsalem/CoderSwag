package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {

    val Categories = listOf(

        Category("SHIRTS","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage"),
        Category("SHIRTS","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")


    )

    val hats = listOf(
        Product("hat01","$5","hat1"),
        Product("hat02","$6","hat2"),
        Product("hat03","$7","hat3"),
        Product("hat04","$8","hat4")
    )

    val hoodies = listOf(
        Product("hoodie01","$10","hoodie1"),
        Product("hoodie02","$15","hoodie2"),
        Product("hoodie03","$20","hoodie3"),
        Product("hoodie04","$10","hoodie4")

    )

    val shirts = listOf(
        Product("shirt01","$20","shirt1"),
        Product("shirt02","$30","shirt2"),
        Product("shirt03","$40","shirt3"),
        Product("shirt04","$50","shirt4"),
        Product("shirt05","$60","shirt5")
    )

    val digitalGoods = listOf<Product>()

    fun getProducts(category: String) : List<Product>{
        return when(category){
            "SHIRTS" -> shirts
            "HOODIES" -> hoodies
            "HATS" -> hats
            else -> digitalGoods
        }
    }

}