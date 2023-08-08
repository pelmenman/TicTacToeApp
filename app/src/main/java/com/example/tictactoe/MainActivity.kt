package com.example.tictactoe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.tictactoe.screens.*
import com.example.tictactoe.ui.theme.TicTacToeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TicTacToeTheme {
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = "start_screen") {
                    composable("start_screen") {
                        StartScreen(navController = navController)
                    }

                    composable("create_account") {
                        CreateAccountScreen(navController = navController)
                    }

                    composable("log_in") {
                        LogInScreen()
                    }

                    composable("main") {
                        MainScreen(navController = navController)
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

