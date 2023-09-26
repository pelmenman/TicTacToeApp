package com.example.tictactoe.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tictactoe.R
import com.example.tictactoe.ui.components.button.MenuButton
import com.example.tictactoe.ui.components.divider.DividerTextComponent
import com.example.tictactoe.ui.components.text.ClickableLoginTextComponent
import com.example.tictactoe.ui.components.text.HeadingTextComponent
import com.example.tictactoe.ui.components.text.NormalTextComponent
import com.example.tictactoe.ui.components.textfield.InfoTextField
import com.example.tictactoe.ui.components.textfield.PasswordTextField

@Composable
fun SignUpScreen() {
    val focusManager = LocalFocusManager.current
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(28.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(text = stringResource(id = R.string.hey_there))
            HeadingTextComponent(text = stringResource(id = R.string.create_account))

            Spacer(modifier = Modifier.height(20.dp))

            InfoTextField(
                label = stringResource(R.string.username),
                focusManager = focusManager,
                painter = painterResource(id = R.drawable.user_icon)
            )
            Spacer(modifier = Modifier.height(5.dp))
            InfoTextField(
                label = stringResource(R.string.email),
                focusManager = focusManager,
                keyboardType = KeyboardType.Email,
                painter = painterResource(id = R.drawable.mail_icon)
            )
            Spacer(modifier = Modifier.height(5.dp))
            PasswordTextField(focusManager = focusManager)

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .heightIn(240.dp)
            )

            MenuButton(text = stringResource(id = R.string.sign_up))

            Spacer(modifier = Modifier
                .fillMaxWidth()
                .heightIn(10.dp)
            )

            DividerTextComponent()
            ClickableLoginTextComponent(onTextSelected = {
                println("TEST: Login clicked")
            })
        }

    }
}

@Preview
@Composable
fun PreviewSignUpScreen() {
    SignUpScreen()
}