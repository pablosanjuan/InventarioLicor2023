package com.pablosj.inventariolicor.presentation.navigationGraphs

sealed class LoginScreenRoutes(val route: String) {
    //Login Activity
    object Splash : LoginScreenRoutes(route = "splash_screen")
    object LogIn : LoginScreenRoutes(route = "login_screen")
    object SignIn : LoginScreenRoutes(route = "sign_in_screen")

    //Home Activity
    object ToHomeActivity : LoginScreenRoutes(route = "to_home_activity")
}