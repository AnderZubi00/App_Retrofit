package com.example.app_retrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.app_retrofit.ui.screens.ProductScreen
import com.example.app_retrofit.ui.theme.App_RetrofitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            App_RetrofitTheme {
                ProductScreen()
            }
        }
    }
}
