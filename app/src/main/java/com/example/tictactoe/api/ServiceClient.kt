package com.example.tictactoe.api

import com.example.tictactoe.api.login.LoginUserReq
import com.example.tictactoe.api.login.LoginUserRes
import com.example.tictactoe.api.signup.SignUpUserReq
import com.example.tictactoe.api.signup.SignUpUserRes
import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.engine.cio.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.websocket.*
import io.ktor.client.request.*
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.*

object ServiceClient {
    private val client = HttpClient(CIO) {
        install(WebSockets)
        install(ContentNegotiation) {
            json()
        }
    }

    private const val BASE_URL = "https://tic-tac-toe-service.onrender.com"


    suspend fun logIn(email: String, password: String){
        val res:LoginUserRes = client.post("$BASE_URL/login") {
            contentType(ContentType.Application.Json)
            setBody(LoginUserReq(email, password))
        }.body()

        println("TEST: ${res.username}")
    }


    suspend fun signUp(username: String, email: String, password: String): SignUpUserRes = client.post("$BASE_URL/signup") {
            contentType(ContentType.Application.Json)
            setBody(SignUpUserReq(username, email, password))
    }.body()
}
