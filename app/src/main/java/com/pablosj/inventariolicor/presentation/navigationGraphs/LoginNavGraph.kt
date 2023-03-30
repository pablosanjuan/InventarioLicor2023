package com.pablosj.inventariolicor.presentation.navigationGraphs

import android.app.Activity
import android.content.Intent
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pablosj.inventariolicor.presentation.login.spalsh.SplashScreen
import com.pablosj.inventariolicor.presentation.main.MainActivity

@Composable
fun LoginNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Splash.route
    ) {
        composable(route = Screen.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.LogIn.route) {
            //LoginScreen()
        }
        composable(route = Screen.SignIn.route) {
            //SigninScreen()
        }
        composable(route = Screen.ToHomeActivity.route) {
            val context = LocalContext.current
            (context as Activity).apply {
                startActivity(Intent(context, MainActivity::class.java))
                finish()
            }
        }
    }
}
