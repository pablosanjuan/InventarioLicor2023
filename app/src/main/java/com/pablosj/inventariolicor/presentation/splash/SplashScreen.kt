package com.pablosj.inventariolicor.presentation.splash

import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FloatTweenSpec
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
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
import com.pablosj.inventariolicor.presentation.navigation.Screen
import com.pablosj.inventariolicor.presentation.ui.theme.white
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    var startAnimation by remember { mutableStateOf(false) }
    val alphaAnim = animateFloatAsState(
        targetValue = if (startAnimation) 1f else 0f,
        animationSpec = FloatTweenSpec(
             3000, 0, FastOutLinearInEasing

        )
    )

    LaunchedEffect(key1 = true) {
        startAnimation = true
        delay(3000)
        navController.popBackStack()
        navController.navigate(Screen.Home.route)
    }
    Splash(alpha = alphaAnim.value)
}

@Composable
fun Splash(alpha: Float) {
    Box(
        modifier = Modifier
            .background(white)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LottieAnimation(R.raw.lottie_splas_animation, 400.dp, alpha)
    }
}
