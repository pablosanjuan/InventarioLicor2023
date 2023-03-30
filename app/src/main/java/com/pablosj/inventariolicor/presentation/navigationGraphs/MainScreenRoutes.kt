package com.pablosj.inventariolicor.presentation.navigationGraphs

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class MainScreenRoutes(
    val route: String,
    val title: String,
    val icon: ImageVector,
    ) {
    object Home : MainScreenRoutes(
        route= "home_screen",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Settings : MainScreenRoutes(
        route= "settings_screen",
        title = "Configuracion",
        icon = Icons.Default.Settings
    )

}