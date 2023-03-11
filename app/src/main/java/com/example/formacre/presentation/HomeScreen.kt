package com.example.formacre.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formacre.R


@Composable
fun homeScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black))
    {
        Image(  painter = painterResource(id = R.drawable.rosemary),
                modifier = Modifier
                    .fillMaxSize()
                    .blur(14.dp),
                contentScale = ContentScale.Crop,
                contentDescription = "Rosemary")

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        0F to Color(0xFF2B7F68).copy(alpha = 0.3f),
                        .5F to Color(0xFF2B7F68).copy(alpha = 0.7f),
                        1F to Color(0xFF2B7F68).copy(alpha = 1f)
                    )
                )
        )
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(bottom = 50.dp),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally) {
            Button(onClick = { /*TODO*/ }, modifier = Modifier
                .fillMaxWidth(0.8f)
                .height(50.dp),  colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
                Row(horizontalArrangement = Arrangement.SpaceAround) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_google_logo),
                        contentDescription = "Google Button",
                        tint = Color.Unspecified,
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(text = "Continue with Google", style = TextStyle(fontSize = 15.sp))
                }
            }
        }
    }
}
