package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.tictactoe.ui.components.game.ComputersTurnWidget
import com.example.tictactoe.ui.components.game.Field
import com.example.tictactoe.ui.components.game.UsersTurnWidget


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