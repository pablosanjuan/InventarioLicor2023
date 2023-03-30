package com.pablosj.inventariolicor.presentation.login.spalsh

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FloatTweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pablosj.inventariolicor.R
import com.pablosj.inventariolicor.presentation.login.LottieAnimation
import com.pablosj.inventariolicor.presentation.navigationGraphs.Screen
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = FloatTweenSpec(
            1000, 0, FastOutLinearInEasing

        )
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(4000)
        navController.popBackStack()
        navController.navigate(Screen.ToHomeActivity.route)
    }
    Splash(alpha = alphaAnim.value)
}

@Composable
fun Splash(alpha: Float) {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        val lottieSplashAnimation =
            if (isSystemInDarkTheme()) R.raw.lottie_splash_dark else R.raw.lottie_splash_light
        LottieAnimation(lottieSplashAnimation, 400.dp, alpha)
    }
}
