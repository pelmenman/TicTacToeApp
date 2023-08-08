package com.example.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tictactoe.screens.MainScreen
import com.example.tictactoe.screens.MultiplayerGameScreen
import com.example.tictactoe.screens.SettingsScreen
import com.example.tictactoe.screens.SingleGameScreen
import com.example.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "main") {
                    composable("main") {
                        MainScreen(navController)
                    }

                    composable("single_game") {
                        SingleGameScreen()
                    }

                    composable("multiplayer_game") {
                        MultiplayerGameScreen()
                    }

                    composable("settings") {
                        SettingsScreen()
                    }
                }

//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    MainScreen()
//                }
            }
        }
    }
}

