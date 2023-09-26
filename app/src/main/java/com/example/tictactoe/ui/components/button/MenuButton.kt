package com.example.tictactoe.ui.components.button

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tictactoe.ui.theme.LightBlue65

@Composable
fun MenuButton(navController: NavController, text: String, route: String, color: Color = LightBlue65) {
    Button(
        onClick = { navController.navigate(route) },
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(40),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    )
    {
        Text(text)
    }
}

@Composable
fun MenuButton(text: String, color: Color = LightBlue65) {
    Button(
        onClick = { },
        modifier = Modifier
            .height(60.dp)
            .fillMaxWidth(),
        shape = RoundedCornerShape(40),
        colors = ButtonDefaults.buttonColors(containerColor = color)
    )
    {
        Text(text)
    }
}