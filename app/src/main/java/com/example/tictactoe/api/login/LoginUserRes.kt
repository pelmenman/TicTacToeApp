package com.example.tictactoe.api.login

@kotlinx.serialization.Serializable
data class LoginUserRes(
    val id: String,
    val username: String
)
