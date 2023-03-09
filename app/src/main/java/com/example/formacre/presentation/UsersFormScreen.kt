package com.example.formacre.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.formacre.model.UsersViewModel

@Composable
fun UsersRegistrationForm()
{
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
       val myviewModel: UsersViewModel = viewModel()
        TitleForm()
        Spacer(modifier = Modifier.height(50.dp))
        LabelAndPlaceHolder("First Name", textField = myviewModel.text,setTextFieled={myviewModel.onChangeText(it)})
        LabelAndPlaceHolder("Last Name", textField = myviewModel.firstname,setTextFieled={myviewModel.onChangeFirstName(it)})
        LabelAndPlaceHolder("Date Of Birth", textField = myviewModel.dateOfbirth,setTextFieled={myviewModel.onChangedate(it)})
        LabelAndPlaceHolder("Gender", textField = myviewModel.gender,setTextFieled={myviewModel.onChangeGender(it)})
        LabelAndPlaceHolder("NationalID number", textField = myviewModel.nationalID,setTextFieled={myviewModel.onChangedID(it)})
        LabelAndPlaceHolder("Primary Phone Number", textField = myviewModel.PrimaryPhone,setTextFieled={myviewModel.onChangedPrimary(it)})
        LabelAndPlaceHolder("Secondary Phone Number", textField = myviewModel.SecondaryPhone,setTextFieled={myviewModel.onChangedSeconadry(it)})
        Row() {
            SubmitButton()
            Spacer(modifier = Modifier.width(100.dp))
            CancelButton()
        }
    }
}
@Composable
fun TitleForm()
{
    Text("USER FORM", color = MaterialTheme.colors.primary,fontSize = 25.sp,fontWeight = FontWeight.Bold)
}
@Composable
fun LabelAndPlaceHolder(label: String,textField: String,setTextFieled:(String)->Unit) {
    OutlinedTextField(
        value = textField,
        onValueChange = setTextFieled,
        label = { Text(text = label) },
        placeholder = { Text(text = "Your Placeholder") },
    )
}
@Composable
fun SubmitButton() {
    Button(onClick = {}) {
        Text(text = "SUBMIT")
    }
}
@Composable
fun CancelButton() {
    Button(onClick = {}) {
        Text(text = "CANCEL")
    }
}