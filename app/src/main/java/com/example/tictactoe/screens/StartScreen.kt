package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.tictactoe.api.ServiceClient
import com.example.tictactoe.ui.theme.Grey57
import com.example.tictactoe.ui.theme.LightBlue65
import com.example.tictactoe.ui.theme.PinkyRed62
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

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
        CreateAccountButton(navController)
        Spacer(modifier = Modifier.size(20.dp))
        LogInButton(navController)
    }
}

@Composable
private fun Title() {
    Row {
        Text(text = "TIC ", color = LightBlue65, fontSize = 35.sp)
        Text(text = "TAC ", color = Grey57, fontSize = 35.sp)
        Text(text = "TOE!", color = PinkyRed62, fontSize = 35.sp)
    }
}

@Composable
private fun CreateAccountButton(navController: NavController) {
    val coroutineScope = rememberCoroutineScope()
    Button(
        onClick = { navController.navigate("create_account") },
        modifier = Modifier
            .padding(bottom = 0.dp)
            .height(60.dp)
            .width(300.dp),
        shape = RoundedCornerShape(40)
    ) {
        Text("Create account")
    }
}

@Composable
private fun LogInButton(navController: NavController) {
    Button(
        onClick = { navController.navigate("log_in") },
        modifier = Modifier
            .height(60.dp)
            .width(300.dp),
        colors = ButtonDefaults.buttonColors(containerColor = PinkyRed62),
        shape = RoundedCornerShape(40)
    ) {
        Text("Log in")
    }
}
