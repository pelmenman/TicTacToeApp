package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
fun StartScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Text(text = "TIC ", color = LightBlue65, fontSize = 35.sp)
            Text(text = "TAC ", color = Grey57, fontSize = 35.sp)
            Text(text = "TOE!", color = PinkyRed62, fontSize = 35.sp)
        }
        Spacer(Modifier.size(200.dp))
        Button(
            onClick = {navController.navigate("create_account")},
            modifier = Modifier
                .padding(10.dp)
                .height(60.dp)
                .width(300.dp),
            shape = RoundedCornerShape(20)
        ) {
            Text("Create account")
        }
        Button(
            onClick = {navController.navigate("log_in")},
            modifier = Modifier
                .height(60.dp)
                .width(300.dp),
            colors = ButtonDefaults.buttonColors(containerColor = PinkyRed62),
            shape = RoundedCornerShape(20)
        ) {
            Text("Log in")
        }

    }
}