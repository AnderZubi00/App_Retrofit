package com.example.app_retrofit.repository

import com.example.app_retrofit.model.Product
import com.example.app_retrofit.network.RetrofitInstance

class ProductRepository {

    suspend fun getProducts(): List<Product> {
        return RetrofitInstance.api.getProducts().results
    }
}
