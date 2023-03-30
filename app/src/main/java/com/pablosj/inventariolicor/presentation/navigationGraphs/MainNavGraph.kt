package com.pablosj.inventariolicor.presentation.navigationGraphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pablosj.inventariolicor.presentation.main.BottomBarScreen
import com.pablosj.inventariolicor.presentation.main.home.HomeScreen
import com.pablosj.inventariolicor.presentation.main.home.SettingsScreen

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route) {
            HomeScreen()
        }
        composable(route = BottomBarScreen.Settings.route) {
            SettingsScreen()
        }
    }
}

