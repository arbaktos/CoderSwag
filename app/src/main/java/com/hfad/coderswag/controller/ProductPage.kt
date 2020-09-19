package com.hfad.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import com.hfad.coderswag.R
import com.hfad.coderswag.constants.EXTRA_PRODUCT
import com.hfad.coderswag.model.Product
import com.hfad.coderswag.services.DataService
import kotlinx.android.synthetic.main.product_list_item.*
import kotlinx.android.synthetic.main.product_page_layout.*

class ProductPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_page)

        val product = intent.getParcelableExtra<Product>(EXTRA_PRODUCT)

        productPageName.text = product?.title
        productPagePrice.text = product?.price
        Additional_info.text = product?.addInfo
        val resourceId = resources.getIdentifier(product?.image,
            "drawable", packageName)
        productPageImage.setImageResource(resourceId)
    }
}