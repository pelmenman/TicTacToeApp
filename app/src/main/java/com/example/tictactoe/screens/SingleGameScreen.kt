package com.example.tictactoe.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.tictactoe.R
import com.example.tictactoe.ui.theme.Fredoka
import com.example.tictactoe.ui.theme.Grey57

@Composable
fun SingleGameScreen() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            UsersTurnWidget()
            Spacer(modifier = Modifier.size(120.dp))
            ComputersTurnWidget()
        }
        Spacer(modifier = Modifier.size(70.dp))
        Field()
    }
}

@Composable
private fun UsersTurnWidget() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "You",
            modifier = Modifier.padding(bottom = 10.dp),
            fontFamily = Fredoka,
            color = Grey57
        )
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.cross_light_red),
            contentDescription = "cross",
            modifier = Modifier.size(70.dp)
        )
    }
}

@Composable
private fun ComputersTurnWidget() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            "Computer",
            modifier = Modifier.padding(bottom = 10.dp),
            fontFamily = Fredoka,
            color = Grey57
        )
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.circle_light_blue),
            contentDescription = "circle",
            modifier = Modifier.size(70.dp)
        )
    }
}

@Composable
private fun Field() {
    Image(
        imageVector = ImageVector.vectorResource(id = R.drawable.field_grid),
        contentDescription = "field grid",
        modifier = Modifier.size(370.dp)
    )
}