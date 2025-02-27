package com.example.apprestarios

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.apprestarios.ui.theme.AppRestariosTheme
import com.example.apprestarios.views.Inicio
import com.example.apprestarios.views.Receta1
import com.example.apprestarios.views.Receta2

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppRestariosTheme {
                GreetingPreview()
            }
        }
    }
}

@Preview (showBackground = true)
@Composable
fun GreetingPreview(){
    Column {
    Inicio()
        Button(
            onClick = {
                val receta1 = Receta1()
                receta1.mostrarReceta()
            },
            modifier = Modifier.padding(10.dp)
        ) {
            Text("RECETA 01")
        }

    }
}

