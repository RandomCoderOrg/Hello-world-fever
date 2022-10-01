package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloworldTheme
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloworldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.Yellow
                ) {
                    Column(modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
                    {

                            Greeting("World")


                    }

                }
            }
        }
    }
}



@Composable
fun Greeting(name: String) {
        Text(text = "Hello $name!",
            modifier = Modifier.width(400.dp),
            style = TextStyle(
                color = Color.Magenta,
                fontSize = 60.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = FontFamily.Cursive,
                textAlign = TextAlign.Center,
                letterSpacing = 4.sp,
                shadow = Shadow(
                    color = Color.Cyan,
                    offset = Offset(10f,10f),
                    blurRadius = 5f
                )
            )
        )
    }



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HelloworldTheme {
        Surface(
            color = Color.Yellow
        ) {
            Greeting("World")
        }
    }
}