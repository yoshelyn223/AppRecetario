package com.example.apprestarios.views

import android.annotation.SuppressLint
import androidx.annotation.ContentView
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.example.apprestarios.MainActivity
import com.example.apprestarios.components.ActionButton
import com.example.apprestarios.components.MainButton


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Inicio(){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "MENU") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = Color.Red)
            )
        },
    ){
       // ContentView()
    }
}

/*==@Composable
fun ContentView(){
   Column {
    MainButton("Receta 1", Color.Red, Color.Black) {
       Receta1()
   }

   MainButton("Receta2", Color.Red, Color.Black) {
       Receta2()
   }

   MainButton("Receta3", Color.Red, Color.Black) {
       Receta3()
   }

   MainButton("Receta4", Color.Red, Color.Black) {
      Receta4()
   }

   }
*/



