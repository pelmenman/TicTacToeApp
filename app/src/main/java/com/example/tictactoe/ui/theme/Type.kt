package com.example.tictactoe.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.tictactoe.R


val FredokaOne = FontFamily(Font(R.font.fredoka_one_regular))

val FredokaBold = FontFamily(Font(R.font.fredoka_bold))

val Fredoka = FontFamily(Font(R.font.fredoka_regular))


// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FredokaBold,
        fontWeight = FontWeight.Normal,
        fontSize = 20.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    //For buttons
    labelLarge = TextStyle(
        fontFamily = Fredoka,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

