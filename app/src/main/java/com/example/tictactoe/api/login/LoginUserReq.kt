package com.example.tictactoe.api.login

@kotlinx.serialization.Serializable
data class LoginUserReq(
    val email: String,
    val password: String
)
