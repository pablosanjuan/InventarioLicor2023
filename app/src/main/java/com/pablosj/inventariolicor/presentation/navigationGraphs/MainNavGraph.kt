package com.pablosj.inventariolicor.presentation.navigationGraphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pablosj.inventariolicor.presentation.main.home.HomeScreen
import com.pablosj.inventariolicor.presentation.main.settings.SettingsScreen

@Composable
fun MainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = MainScreenRoutes.Home.route
    ) {
        composable(route = MainScreenRoutes.Home.route) {
            HomeScreen()
        }
        composable(route = MainScreenRoutes.Settings.route) {
            SettingsScreen()
        }
    }
}

