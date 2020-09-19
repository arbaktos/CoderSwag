package com.hfad.coderswag.services
import com.hfad.coderswag.model.Category
import com.hfad.coderswag.model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTS", "shirtimage"),
        Category("HATS", "hatimage"),
        Category("HOODIES", "hoodieimage"),
        Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beenie", "$18", "hat1", "some additional info"),
        Product("Devslopes Hat Black", "$20", "hat2", "Some more additional info"),
        Product("Devslopes Hat White", "$18", "hat3", "Even more additional info"),
        Product("Devslopes Hat Snapback", "$22", "hat4", "the last additional info")
    )

    val hoodies = listOf(
        Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
        Product("Devslopes Hoodie Red", "$32", "hoodie2"),
        Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
        Product("Devslopes Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Devslopes Shirt Black", "$18", "shirt1"),
        Product("Devslopes Badge Light Gray", "$20", "shirt2"),
        Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
        Product("Devslopes Hustle", "$22", "shirt4")
    )

    val digital_goods = listOf<Product>()

    fun getProducts(category: String?): List<Product> {
        return when(category){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digital_goods
        }

    }
}