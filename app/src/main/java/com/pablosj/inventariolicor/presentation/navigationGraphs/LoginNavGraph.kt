package com.pablosj.inventariolicor.presentation.navigationGraphs

import android.app.Activity
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_SINGLE_TOP
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
        startDestination = LoginScreenRoutes.Splash.route
    ) {
        composable(route = LoginScreenRoutes.Splash.route) {
            SplashScreen(navController = navController)
        }
        composable(route = LoginScreenRoutes.LogIn.route) {
            //LoginScreen()
        }
        composable(route = LoginScreenRoutes.SignIn.route) {
            //SigninScreen()
        }
        composable(route = LoginScreenRoutes.ToHomeActivity.route) {
            val context = LocalContext.current
            (context as Activity).apply {
                startActivity(
                    Intent(context, MainActivity::class.java).addFlags(
                        FLAG_ACTIVITY_SINGLE_TOP,
                    ),
                )
                finish()
            }
        }
    }
}
