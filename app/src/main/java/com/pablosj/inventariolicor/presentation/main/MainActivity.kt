package com.pablosj.inventariolicor.presentation.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.pablosj.inventariolicor.presentation.ui.theme.MainScreenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreenTheme {
                val navController = rememberNavController()
                MainScreen(navController = navController)
            }
        }
    }
}