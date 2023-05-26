package com.example.mitcomposejetpack

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mitcomposejetpack.ui.theme.MitcomposejetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable

fun Text() {
    var mContext = LocalContext.current

    Column(modifier = Modifier
        .fillMaxSize()

        .background(color = Color.Black)) {

        Text(
            text = "hello there",

            color = Color.Green,
            fontStyle = FontStyle.Italic

        )
        Text(text = "welcome to zyphur "
            , fontStyle = FontStyle.Italic, color = Color.White)

        Text(text = "Enter password to login", fontStyle = FontStyle.Italic,color = Color.White)
        Text(text = " to login press yes to sign press No ", textDecoration = TextDecoration.Underline)

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Cyan),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Yes")
            Text(text = "No")
        }



        //first button
        Button(
            onClick = {

                mContext.startActivity(Intent(mContext, layoutactivity::class.java))
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
        )
        {
            Text(text = "layout")
        }


            //second button
            Button(onClick = {
                mContext.startActivity(Intent(mContext, imagesactivity::class.java))
            }, ) {
                Text(text = "images")


            }
            //third button
            Button(onClick = {
                mContext.startActivity(Intent(mContext,textactivity::class.java))
            },colors = ButtonDefaults.buttonColors(containerColor = Color.Magenta)
            ,
            shape = RectangleShape,
            )  {
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription ="Icons" )
                Text(text = "textfield")


            } //fourth button
            Button(onClick = {
                mContext.startActivity(Intent(mContext,listactivity::class.java))
            },colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text(text = "lists")


            }
        }

    }



@Preview(showBackground = true)
@Composable
fun textpreview(){
    Text()
        }


