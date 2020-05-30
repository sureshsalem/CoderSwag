package com.example.coderswag.Services

import com.example.coderswag.Model.Category
import com.example.coderswag.Model.Product

object DataServices {

    val Categories = listOf(

        Category("SHIRTS","shirtimage"),
        Category("HOODIE","hoodieimage"),
        Category("HATS","hatimage"),
        Category("DIGITAL","digitalgoodsimage")

    )

    val hats = listOf(
        Product("hat01","$5","hat01"),
        Product("hat02","$6","hat02"),
        Product("hat03","$7","hat03"),
        Product("hat04","$8","hat04")
    )

    val hoodies = listOf(
        Product("hoodie01","$10","hoodie01"),
        Product("hoodie02","$15","hoodie02"),
        Product("hoodie03","$20","hoodie03"),
        Product("hoodie04","$10","hoodie04")

    )

    val shirts = listOf(
        Product("shirt01","$20","shirt01"),
        Product("shirt01","$30","shirt01"),
        Product("shirt01","$40","shirt01"),
        Product("shirt01","$50","shirt01"),
        Product("shirt01","$60","shirt01")
    )

}