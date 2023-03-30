package com.pablosj.inventariolicor.presentation.main.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Place
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.pablosj.inventariolicor.presentation.common_compose.LottieAnimation
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import com.pablosj.inventariolicor.R
import com.pablosj.inventariolicor.data.remote.dto.Event

@Composable
fun EventItem(
    event: Event,
    modifier: Modifier,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()
    val surfaceColor = if (isSystemInDarkTheme()) {
        Color.DarkGray
    } else {
        Color.White
    }
    val selector = if (isPressed) Color.Red else surfaceColor
    Row(
        modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(10.dp))
            .background(selector)
            .clickable(
                onClick = { /* AQUI AGREGAR LO QUE HACE EL CLICK */ },
                interactionSource = remember { MutableInteractionSource() },
                indication = rememberRipple(bounded = true, color = Color.Gray)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = modifier.weight(3f)
        ) {
            LottieAnimation(
                R.raw.lottie_schedule_animation,
                99.dp,
                1f
            )
        }
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = modifier.weight(9f)
        ) {
            Text(
                text = event.name,
                style = MaterialTheme.typography.h4,
                color = MaterialTheme.colors.onSurface
            )
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(12.dp),
                    imageVector = Icons.Default.DateRange,
                    contentDescription = "Add icon",
                    tint = MaterialTheme.colors.onSurface,
                )
                Spacer(modifier = Modifier.width(width = 4.dp))
                Text(
                    text = event.date,
                    style = MaterialTheme.typography.body1,
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colors.onSurface
                )
            }
            Row(
                modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(12.dp),
                    imageVector = Icons.Default.Place,
                    contentDescription = "Add icon",
                    tint = MaterialTheme.colors.onSurface,
                )
                Spacer(modifier = Modifier.width(width = 4.dp))
                Text(
                    text = event.place,
                    style = MaterialTheme.typography.body2,
                    fontStyle = FontStyle.Italic,
                    color = MaterialTheme.colors.onSurface
                )
            }
        }
    }
}