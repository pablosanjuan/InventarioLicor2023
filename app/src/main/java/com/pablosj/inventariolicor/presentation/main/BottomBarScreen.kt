package com.pablosj.inventariolicor.presentation.main

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomBarScreen(
    val route: String,
    val title: String,
    val icon: ImageVector,
    ) {
    object Home : BottomBarScreen(
        route= "home_screen",
        title = "Home",
        icon = Icons.Default.Home
    )

    object Settings : BottomBarScreen(
        route= "settings_screen",
        title = "Configuracion",
        icon = Icons.Default.Settings
    )

}