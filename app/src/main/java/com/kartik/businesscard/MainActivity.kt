package com.kartik.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.kartik.businesscard.ui.theme.BusinessCardTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting()
{
    Column (
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxSize()
            .background(color = Color.Cyan)
            .padding(top = 125.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_image),
                contentDescription = "android image",
                modifier = Modifier
                    .padding(10.dp)
                    .size(200.dp)
            )
            Text(
                text = "Kartik Nagrale",
                fontSize = 35.sp
            )
            Text(
                text = "Android Developer",
                fontSize = 20.sp,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
        }

        Column(
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.Start
        ) {
            Row (
                modifier = Modifier.padding(top = 150.dp).padding(6.dp)
            ){
                Icon(
                    painter = painterResource(id = R.drawable.baseline_call_24),
                    contentDescription = "call icon"
                )
                Spacer(Modifier.width(20.dp))
                Text(text = "+91 9657777456")
            }
            Row(
                modifier = Modifier.padding(6.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_share_24),
                    contentDescription = "share icon"
                )
                Spacer(Modifier.width(20.dp))
                Text(text = "@KartikNagrale")
            }
            Row(
                modifier = Modifier.padding(6.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_email_24),
                    contentDescription = "email icon"
                )
                Spacer(Modifier.width(20.dp))
                Text(text = "kartikknagrale@gmail.com")
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        Greeting()
    }
}