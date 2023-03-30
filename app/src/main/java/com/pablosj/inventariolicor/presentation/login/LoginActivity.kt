package com.pablosj.inventariolicor.presentation.login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import com.pablosj.inventariolicor.presentation.navigationGraphs.LoginNavGraph
import com.pablosj.inventariolicor.presentation.ui.theme.SplashScreenTheme

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplashScreenTheme {
                val navController = rememberNavController()
                LoginNavGraph(navController = navController)
            }
        }
    }
}