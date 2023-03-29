package com.pablosj.inventariolicor.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color.Companion.DarkGray
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val LightColorPalette = darkColors(
    primary = Indigo900,
    primaryVariant = Amber,
    secondary = Blue,
    surface = Indigo50,
    onPrimary = White,
    onSecondary = White,
    onBackground = White,
    onSurface = DarkGrey,
    error = Red800,
    onError = White,
    secondaryVariant = White,
)

private val DarkColorPalette = lightColors(
    primary = Indigo900,
    primaryVariant = Amber,
    secondary = Blue,
    surface = DarkGrey,
    onPrimary = White,
    onSecondary = White,
    onBackground = White,
    onSurface = White,
    error = Red800,
    onError = White,
    secondaryVariant = White,
)

@Composable
fun AnimatedSplashScreenTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(
            color = if (darkTheme) DarkGray else Indigo900,
            darkIcons = false
        )
    }

    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}