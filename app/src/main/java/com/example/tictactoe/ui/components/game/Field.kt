package com.example.tictactoe.ui.components.game

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.tictactoe.R

@Composable
fun Field() {

    Image(
        imageVector = ImageVector.vectorResource(id = R.drawable.field_grid),
        contentDescription = "field grid",
        modifier = Modifier
            .size(370.dp)
    )
}
