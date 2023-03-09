package com.example.formacre.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class UsersViewModel: ViewModel() {

    var text by mutableStateOf("")
    var firstname by mutableStateOf("")
    var dateOfbirth by mutableStateOf("")
    var gender by mutableStateOf("")
    var nationalID by mutableStateOf("")
    var PrimaryPhone by mutableStateOf("")
    var SecondaryPhone by mutableStateOf("")

    fun onChangeText(newText: String)
    {
        text=newText
    }

    fun onChangeFirstName(newText: String)
    {
        firstname=newText
    }
    fun onChangedate(newText: String)
    {
        dateOfbirth=newText
    }
    fun onChangeGender(newText: String)
    {
        gender=newText
    }
    fun onChangedID(newText: String)
    {
        nationalID=newText
    }
    fun onChangedPrimary(newText: String)
    {
        PrimaryPhone=newText
    }
    fun onChangedSeconadry(newText: String)
    {
        SecondaryPhone=newText
    }


}