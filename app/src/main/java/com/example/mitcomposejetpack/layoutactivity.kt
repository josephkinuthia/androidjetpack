package com.example.mitcomposejetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mitcomposejetpack.ui.theme.MitcomposejetpackTheme

class layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}




@Composable
fun mytext(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Black)) {


        Text(text = "hello welcome", fontSize = 40.sp, fontStyle=FontStyle.Italic, color= Color.Green)
        Text(text = "To login select the choices below", color = Color.Cyan, fontSize = 30.sp)

        Row(modifier =Modifier.fillMaxWidth().background(color = Color.Red),
            horizontalArrangement = Arrangement.SpaceEvenly) {
            Text(text = "Yes")
            Text(text = "No")}
    }
}


@Preview(showBackground = true)
@Composable
fun mytextpreview(){
    mytext()
}