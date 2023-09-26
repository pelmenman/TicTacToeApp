package com.example.tictactoe.ui.components.textfield

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusManager
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import com.example.tictactoe.ui.theme.Grey95
import com.example.tictactoe.ui.theme.LightBlue65
import com.example.tictactoe.ui.theme.componentShapes


@Composable
fun InfoTextField(label: String, focusManager: FocusManager, keyboardType: KeyboardType = KeyboardType.Text, painter: Painter) {
    val textValue = remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .clip(componentShapes.small),
        label = { Text(text = label) },
        value = textValue.value,
        onValueChange = { textValue.value = it },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = LightBlue65,
            focusedLabelColor = LightBlue65,
            containerColor = Grey95
        ),
        leadingIcon = { Icon(painter = painter, contentDescription = "") },
        keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done, keyboardType = keyboardType),
        keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() })
    )

}
