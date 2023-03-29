package com.pablosj.inventariolicor.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "hola mundo")
    }
}