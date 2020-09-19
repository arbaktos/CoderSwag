package com.hfad.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hfad.coderswag.R
import com.hfad.coderswag.constants.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
    }
}