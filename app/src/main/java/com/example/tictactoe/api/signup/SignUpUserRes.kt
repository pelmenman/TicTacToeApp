package com.example.tictactoe.api.signup

@kotlinx.serialization.Serializable
data class SignUpUserRes(
    val id: Int,
    val username: String,
    val email: String
)
