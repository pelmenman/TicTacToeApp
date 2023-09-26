package com.example.tictactoe.ui.components.text

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp
import com.example.tictactoe.R
import com.example.tictactoe.ui.theme.FredokaBold
import com.example.tictactoe.ui.theme.Grey57
import com.example.tictactoe.ui.theme.LightBlue65
import com.example.tictactoe.ui.theme.PinkyRed62

@Composable
fun Title() {
    val titleWords = listOf(
        stringResource(R.string.tic) to LightBlue65, stringResource(R.string.tac) to Grey57, stringResource(
        R.string.toe) to PinkyRed62
    )
    Row {
        for (word in titleWords) {
            Text(
                text = word.first,
                color = word.second,
                style = TextStyle(
                    fontSize = 35.sp,
                    fontFamily = FredokaBold
                )
            )
        }
    }
}