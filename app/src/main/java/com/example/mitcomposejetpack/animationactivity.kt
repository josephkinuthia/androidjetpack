package com.example.mitcomposejetpack

import android.graphics.Paint.Align
import android.inputmethodservice.Keyboard
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mitcomposejetpack.ui.theme.MitcomposejetpackTheme

class animationactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            animation()


        }
    }
}

@Composable
fun animation(){

    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.Gray), horizontalAlignment = Alignment.CenterHorizontally) {
        Text(text = "bulldog", fontStyle = FontStyle.Italic,)
        Image(
            painter = painterResource(id = R.drawable.bunny),
            contentDescription = "funka",
            modifier = Modifier
                .size(width = 500.dp, height = 150.dp)
                .clip(shape = CircleShape),


            )}

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Color.Gray),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "mixamo", fontStyle = FontStyle.Italic,)
            Card(){
                Row (){

                    Image(
                        painter = painterResource(id = R.drawable.mixamo),
                        contentDescription = "funka",
                        modifier = Modifier
                            .size(width = 500.dp, height = 150.dp)
                            .clip(shape = CircleShape))

             Column(
                        modifier = Modifier
                            .padding(20.dp)){
                 Text(text="am back")
             }
                }




            }


            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.Gray),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "gansta", fontStyle = FontStyle.Italic,)
                Card(){
                    Image(
                    painter = painterResource(id = R.drawable.gangsta),
                    contentDescription = "funka",
                    modifier = Modifier
                        .size(width = 500.dp, height = 150.dp)
                        .clip(shape = CircleShape)
                )}
                Text(text="mixamo is back")


            }


                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Gray),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = "bird black", fontStyle = FontStyle.Italic,)
                    Card() {Image(
                        painter = painterResource(id = R.drawable.bird),
                        contentDescription = "funka",
                        modifier = Modifier
                            .size(width = 500.dp, height = 150.dp)
                            .clip(shape = CircleShape)
                    )

                    }
                    Text(text="gansta paradise")


                }
            }
        }

@Preview(showBackground = true)
@Composable
  fun animatiuonpreview() {
            animation()

        }

