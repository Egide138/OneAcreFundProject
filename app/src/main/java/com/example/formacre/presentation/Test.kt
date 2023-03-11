package com.example.formacre.presentation

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.formacre.R
import kotlinx.coroutines.launch
import kotlin.random.Random

@SuppressLint("UnrememberedMutableState")
@Preview
@Composable
fun Login(){

    val colorBg = remember {
        mutableStateOf(Color.Yellow)
    }
    Column( modifier = Modifier
        .fillMaxSize()
        .background(colorBg.value)
//        .padding(102.dp),
//            horizontalAlignment = Alignment.CenterHorizontally,
//            verticalArrangement = Arrangement.Center
        ) {
        val painter = painterResource(id = R.drawable.rosemary)
        val description = "Rosemary"
        val subtitle = "A picture of Rosemary"
        Box(modifier = Modifier
            .fillMaxWidth(0.6f)
            .padding(12.dp)
            .clickable {
                colorBg.value = Color(Random.nextFloat(), Random.nextFloat(), Random.nextFloat())
            }) {
            MyCard(painter = painter, contentDescription = description, title = subtitle)
        }
        Box(modifier = Modifier.fillMaxSize()){
            Form(modifier = Modifier.fillMaxSize())
        }
    }
}

@Composable

fun Form(
    modifier: Modifier
){
    val scaffoldState = rememberScaffoldState()
    val textField = remember {
        mutableStateOf("")
    }
    val scope = rememberCoroutineScope()

    Scaffold(
        modifier = modifier,
        scaffoldState = scaffoldState
    ) {
        Column(modifier = Modifier.padding(horizontal =  10.dp), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
            TextField(value = textField.value, label = {Text("Your username")}, onValueChange = {
                textField.value = it
            })
            Spacer(modifier = Modifier.height(15.dp))
            Button(onClick = {
                scope.launch {
                    scaffoldState.snackbarHostState.showSnackbar("Hello ${textField.value}")
                }
            }) {
                Text(text = "Hello world")
            }
        }
    }

}
@Composable
fun MyCard(
    painter:Painter,
    contentDescription:String,
    title: String,
    modifier: Modifier=Modifier
){
   Card(modifier = Modifier
       .fillMaxHeight(0.3f)
       .border(width = 2.dp, color = Color.Blue),

       shape = RoundedCornerShape(12.dp), elevation = 3.dp) {
       Box(
          modifier = Modifier.height(20.dp),

       ){
            Image(painter = painter, contentDescription = contentDescription, contentScale = ContentScale.Crop)
            Box(
             modifier = Modifier
                 .fillMaxSize()
                 .background(
                     Brush.verticalGradient(
                         colors = listOf(
                             Color.Transparent,
                             Color.Black
                         ),
                         startY = 300f
                     )
                 )

            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(10.dp), contentAlignment = Alignment.BottomStart){
                Text(title, style = TextStyle(color = Color.White, fontSize = 16.sp))

            }
       }
   }
}