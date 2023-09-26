package com.example.tictactoe.api.signup

@kotlinx.serialization.Serializable
data class SignUpUserReq(
    val username: String,
    val email: String,
    val password: String
)
