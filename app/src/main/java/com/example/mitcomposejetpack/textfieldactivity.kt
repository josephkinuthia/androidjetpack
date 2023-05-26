package com.example.mitcomposejetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class textactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            form()

        }
    }
}
    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    fun form() {
        Column(modifier = Modifier.fillMaxSize()) {
            Text(
                text = "personal details",
                color = Color.Black,
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.ExtraLight
            )

//firstname
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text(text = "firstname") },
                placeholder = { Text(text = "enter your firstname") },

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Person,
                        contentDescription = "face"
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "face"
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


            )
//middlename
            var mytext by remember { mutableStateOf("") }
            TextField(
                value = mytext,
                onValueChange = { mytext = it },
                label = { Text(text = "middlename") },
                placeholder = { Text(text = "enter your middlename") },

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "face"
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "face"
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


            )
//surname
            var surname by remember { mutableStateOf("") }
            TextField(
                value = surname,
                onValueChange = { surname = it },
                label = { Text(text = "surname") },
                placeholder = { Text(text = "enter your surname") },

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Face,
                        contentDescription = "face"
                    )
                },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = "face"
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)


            )


//password
            var password by remember { mutableStateOf("") }
            TextField(
                value = password,
                onValueChange = { password = it },
                label = { Text(text = "phone number") },
                placeholder = { Text(text = "enter your ") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "face"
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                visualTransformation = PasswordVisualTransformation()

            )
//contact
            var contact by remember { mutableStateOf("") }
            TextField(
                value = contact,
                onValueChange = { contact = it },
                label = { Text(text = "contact") },
                placeholder = { Text(text = "enter your password") },

                leadingIcon = {
                    Icon(
                        imageVector = Icons.Default.Call,
                        contentDescription = "face"
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Phone)
            )

        }

    }





@Preview(showBackground = true)
@Composable
fun formpreview(){
    form()

 }