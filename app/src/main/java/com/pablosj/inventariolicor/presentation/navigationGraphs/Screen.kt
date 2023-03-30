package com.pablosj.inventariolicor.presentation.navigationGraphs

sealed class Screen(val route: String) {
    //Login Activity
    object Splash : Screen(route = "splash_screen")
    object LogIn : Screen(route = "login_screen")
    object SignIn : Screen(route = "sign_in_screen")

    //Home Activity
    object ToHomeActivity : Screen(route = "to_home_activity")
    object Home : Screen(route = "home_screen")
}