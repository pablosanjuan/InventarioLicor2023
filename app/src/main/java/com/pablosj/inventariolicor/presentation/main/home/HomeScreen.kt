package com.pablosj.inventariolicor.presentation.main.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pablosj.inventariolicor.R
import com.pablosj.inventariolicor.presentation.common_compose.*

@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(MaterialTheme.colors.surface)
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        //val state = viewModel.state.value
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
        ) {
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
                    style = MaterialTheme.typography.h2,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.weight(8f)
                )
                ButtonRounded(buttonType = ButtonType.PRIMARY, icon = Icons.Default.Create)
                ButtonRounded(buttonType = ButtonType.SECONDAY, icon = Icons.Default.List)
            }
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(20.dp)
            ) {
                item {

                }
                //items(item.team) { teamMember ->
                //    TeamMemberItem(
                //        teamMember = teamMember,
                //        modifier = Modifier
                //            .fillMaxWidth()
                //            .padding(10.dp)
                //    )
                //    Divider()
                //}
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
}
