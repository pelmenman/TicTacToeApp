package com.example.tictactoe.ui.components.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.tictactoe.R
import com.example.tictactoe.ui.theme.Fredoka
import com.example.tictactoe.ui.theme.Grey57

@Composable
fun UsersTurnWidget() {
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
