package com.example.mitcomposejetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateSizeAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mitcomposejetpack.ui.theme.MitcomposejetpackTheme

class imagesactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            image()

        }
    }
}




@Composable
fun image(){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Blue)) {
        Text(text  = "ganstartoon", color = Color.Red)
        Image(painter = painterResource(id =R.drawable.gangsta,), contentDescription = "GANSTA")




    }
}





@Preview(showBackground = true)
@Composable
fun imagepreview(){
    image()
    }
