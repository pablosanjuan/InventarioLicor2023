package com.pablosj.inventariolicor.presentation.common_compose

import androidx.compose.foundation.indication
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonRounded(
    text: String = "",
    textSize: TextUnit = 29.sp,
    buttonType: ButtonType = ButtonType.PRIMARY,
    icon: ImageVector? = null,
) {
    val interactionSource = remember { MutableInteractionSource() }
    val rippleColor = Color.Red
    Button(
        onClick = {

        },
        colors = ButtonDefaults.buttonColors(
            backgroundColor = buttonTypeColor(buttonType),
            contentColor = MaterialTheme.colors.onPrimary,
        ),
        elevation = ButtonDefaults.elevation(
            defaultElevation = 20.dp,
            pressedElevation = 1.dp,
        ),
        shape = RoundedCornerShape(100),
        modifier = Modifier
            .padding(4.dp)
            .indication(
                interactionSource = interactionSource,
                indication = rememberRipple(
                    color = rippleColor,
                    radius = 8.dp
                )
            )

    ) {
        icon?.apply {
            Icon(
                imageVector = this,
                contentDescription = "Add icon"
            )
            Spacer(modifier = Modifier.width(width = 4.dp))
        }
        Text(
            text = text,
            fontSize = textSize,
            color = MaterialTheme.colors.onPrimary
        )
    }
}

@Composable
fun buttonTypeColor(buttonType: ButtonType): Color {
    return when (buttonType) {
        ButtonType.PRIMARY -> MaterialTheme.colors.primary
        ButtonType.SECONDAY -> MaterialTheme.colors.secondary
        ButtonType.DENY -> MaterialTheme.colors.error
    }
}
