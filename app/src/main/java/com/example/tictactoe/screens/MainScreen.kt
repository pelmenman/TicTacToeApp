package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
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

        Title()
        Spacer(modifier = Modifier.padding(50.dp))
        SinglePlayerButton(navController)
        MultiplayerGameButton(navController)
        SettingsButton(navController)
    }
}

@Composable
private fun Title() {
    Row {
        Text(text = "TIC ", color = LightBlue65, fontSize = 30.sp)
        Text(text = "TAC ", color = Grey57, fontSize = 30.sp)
        Text(text = "TOE!", color = PinkyRed62, fontSize = 30.sp)
    }
}

@Composable
private fun SinglePlayerButton(navController: NavController) {
    Button(
        onClick = { navController.navigate("single_game") },
        modifier = Modifier
            .padding(top = 50.dp, bottom = 10.dp)
            .height(60.dp)
            .width(270.dp),
        shape = RoundedCornerShape(40)
    )
    {
        Text("Single-player")
    }
}

@Composable
private fun MultiplayerGameButton(navController: NavController) {
    Button(
        onClick = { navController.navigate("multiplayer_game") },
        modifier = Modifier
            .padding(10.dp)
            .height(60.dp)
            .width(270.dp),
        shape = RoundedCornerShape(40)
    )
    {
        Text("Multiplayer")
    }
}

@Composable
private fun SettingsButton(navController: NavController) {
    Button(
        onClick = { navController.navigate("settings") },
        modifier = Modifier
            .padding(10.dp)
            .height(60.dp)
            .width(270.dp),
        shape = RoundedCornerShape(40)
    )
    {
        Text("Settings")
    }
}
