package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tictactoe.ui.components.button.MenuButton
import com.example.tictactoe.ui.components.text.Title


@Composable
fun MainScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        Title()
        Spacer(modifier = Modifier.padding(50.dp))
        MenuButton(navController = navController, text = "Single-player", route = "single_game")
        MenuButton(navController = navController, text = "Multiplayer", route = "multiplayer_game")
        MenuButton(navController = navController, text = "Settings", route = "settings")
    }
}
