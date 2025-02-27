package com.example.apprestarios.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun ActionButton(colores: Color){
    FloatingActionButton(
        onClick = {/*TODO*/},
        containerColor = colores,
        contentColor = Color.White
    ) {
        Icon(Icons.Filled.Add, contentDescription = "ADD")
    }
}