package com.example.tictactoe.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun MainScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "TIC TAC TOE!")
        Button(onClick = {navController.navigate("single_game")}, modifier = Modifier.padding(top = 50.dp, bottom = 20.dp))
        {
            Text("Single-player")
        }
        Button(onClick = {navController.navigate("multiplayer_game")}, modifier = Modifier.padding(20.dp))
        {
            Text("Multiplayer")
        }
        Button(onClick = {navController.navigate("settings")}, modifier = Modifier.padding(20.dp))
        {
            Text("Settings")
        }
    }

}