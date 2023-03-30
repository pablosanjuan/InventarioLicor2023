package com.pablosj.inventariolicor.presentation.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pablosj.inventariolicor.R
import com.pablosj.inventariolicor.data.remote.dto.Event
import com.pablosj.inventariolicor.presentation.common_compose.*
import com.pablosj.inventariolicor.presentation.main.home.components.EventItem

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxSize()
            .padding(12.dp),
    ) {
        //val state = viewModel.state.value
        //state.item?.let { item ->
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = CenterVertically
        ) {
            LottieAnimation(
                resource = R.raw.lottie_circles_animation,
                size = 60.dp,
                alpha = 1F
            )
            Text(
                text = "Eventos",
                style = MaterialTheme.typography.h3,
                color = MaterialTheme.colors.onSurface,
                modifier = Modifier.weight(8f)
            )
            ButtonRounded(buttonType = ButtonType.PRIMARY, icon = Icons.Default.Create)
            ButtonRounded(buttonType = ButtonType.SECONDAY, icon = Icons.Default.List)
        }
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
        ) {
            items(getMockedEvents()) { event ->
                EventItem(
                    event = event,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(1.dp)
                )
                Spacer(modifier = Modifier.height(5.dp))
            }
        }
        //}

//            if (state.error.isNotBlank()) {
//                Text(
//                    text = state.error,
//                    color = MaterialTheme.colors.error,
//                    textAlign = TextAlign.Center,
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(horizontal = 20.dp)
//                        .align(Alignment.Center)
//                )
//            }
//            if (state.isLoading) {
//                CircularProgressIndicator(
//                    modifier = Modifier
//                        .align(Alignment.Center)
//                )
//            }
    }
}

fun getMockedEvents(): List<Event> {
    return mutableListOf(
        Event("aaa", "Concierto 1", "3-marzo-2023", "Estadio"),
        Event("sss", "Concierto 2", "23-febrero-2023", "La macarena"),
        Event("qqq", "Concierto 3", "5-septiembre-2023", "Estadio"),

    )
}
