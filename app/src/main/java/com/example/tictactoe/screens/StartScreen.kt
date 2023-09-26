package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tictactoe.ui.components.button.MenuButton
import com.example.tictactoe.ui.components.text.Title
import com.example.tictactoe.ui.theme.PinkyRed62

@Composable
fun StartScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.size(10.dp))
        Title()
        Spacer(modifier = Modifier.size(200.dp))
        MenuButton(navController = navController, text = "Create account", route = "create_account")
        Spacer(modifier = Modifier.size(20.dp))
        MenuButton(navController = navController, text = "Log in", route = "main", color = PinkyRed62)
    }
}
