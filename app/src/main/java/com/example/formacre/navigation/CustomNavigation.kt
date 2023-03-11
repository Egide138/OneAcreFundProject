package com.example.formacre.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.formacre.presentation.homeScreen
import com.example.formacre.presentation.UsersRegistrationForm

@Composable
fun navigation (){
    var navigationController = rememberNavController()
    
    NavHost(navController = navigationController, startDestination = Screen.UsersFormScreen.route){
        composable(
            route = Screen.HomePage.route
        ){
           homeScreen()
        }

        composable(
            route = Screen.UsersFormScreen.route
        ){
            UsersRegistrationForm()
        }
    }
}