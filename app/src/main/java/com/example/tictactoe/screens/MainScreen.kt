package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tictactoe.ui.theme.Grey57
import com.example.tictactoe.ui.theme.LightBlue65
import com.example.tictactoe.ui.theme.PinkyRed62

@Composable
fun MainScreen(
    navController: NavController
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row() {
            Text(text = "TIC ", color = LightBlue65, fontSize = 30.sp)
            Text(text = "TAC ", color = Grey57, fontSize = 30.sp)
            Text(text = "TOE!", color = PinkyRed62, fontSize = 30.sp)
        }

        Spacer(modifier = Modifier.padding(50.dp))

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