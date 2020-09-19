package com.hfad.coderswag.controller

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.hfad.coderswag.R
import com.hfad.coderswag.adapters.ProductsAdapter
import com.hfad.coderswag.constants.EXTRA_CATEGORY
import com.hfad.coderswag.constants.EXTRA_PRODUCT
import com.hfad.coderswag.model.Product
import com.hfad.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType)){product ->
            val productIntent = Intent(this, ProductPage::class.java)
            productIntent.putExtra(EXTRA_PRODUCT, product)
            startActivity(productIntent)
        }
        productListView.adapter = adapter

        var orientation = resources.configuration.orientation

        var spanCount = 2
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        val screenSize = resources.configuration.screenWidthDp
        if (screenSize > 720){
            spanCount = 3
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
    }
}