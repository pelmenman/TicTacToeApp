package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tictactoe.api.ServiceClient
import com.example.tictactoe.ui.theme.Fredoka
import com.example.tictactoe.ui.theme.Grey90
import kotlinx.coroutines.launch

@Composable
fun CreateAccountScreen(navController: NavController) {
    val focusManager = LocalFocusManager.current
    var username by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(
            label = { Text("Username") },
            value = username,
            onValueChange = {newText -> username = newText},
            textStyle = TextStyle(fontFamily = Fredoka),
            colors = TextFieldDefaults.textFieldColors(containerColor = Grey90),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() })
        )

        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            label = { Text("Email") },
            value = email,
            onValueChange = {newText -> email = newText},
            textStyle = TextStyle(fontFamily = Fredoka),
            colors = TextFieldDefaults.textFieldColors(containerColor = Grey90),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() } )
        )

        Spacer(modifier = Modifier.size(10.dp))

        TextField(
            label = { Text("Password") },
            value = password,
            onValueChange = {newText -> password = newText},
            textStyle = TextStyle(fontFamily = Fredoka),
            colors = TextFieldDefaults.textFieldColors(containerColor = Grey90),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() })
        )

        Spacer(modifier = Modifier.size(30.dp))

        Button(
            onClick = {
                coroutineScope.launch {
                    ServiceClient.signUp(username, email, password)
                }
            },
            modifier = Modifier
                .height(60.dp)
                .width(300.dp),
            shape = RoundedCornerShape(40)
        ) {
            Text("Register")
        }
    }
}