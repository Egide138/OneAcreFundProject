package com.example.formacre.navigation

sealed class Screen(val route: String){
    object HomePage: Screen(route = "home_screen")
    object UsersFormScreen: Screen(route = "form_screen")
    object Dashboard

}
