package com.example.app_retrofit.network

import com.example.app_retrofit.model.ProductResponse
import retrofit2.http.GET

interface ApiService {
    @GET("api/products")
    suspend fun getProducts(): ProductResponse
}
