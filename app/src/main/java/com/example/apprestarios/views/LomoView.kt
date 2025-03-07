package com.example.apprestarios.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.apprestarios.R
import com.example.apprestarios.components.MainButton
import com.example.apprestarios.components.MainIconButton
import com.example.apprestarios.components.Spacers
import com.example.apprestarios.components.TitleBar
import com.example.apprestarios.ui.theme.FontColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LomoView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Lomo con Gravy")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = FontColor),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ){
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(6.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
                .padding(6.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Spacers()
            Spacers()
            Image(
                painter = painterResource(id = R.drawable.lomogravy),
                contentDescription = "Lomo con Gravy",
                modifier = Modifier
                    .size(320.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(
                text = "Ingredientes",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1 cucharada de jugo sazonador.\n" +
                        "1 taza de agua.\n" +
                        "1/2 taza de vino blanco.\n" +
                        "2 cucharaditas de maicena.\n" +
                        "3 cucharadas de miel.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp)
            )
            Spacers()
            Text(
                text = "Preparacion",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1. Raspar los restos del jugo se coce con el lomo\n" +
                        "2. Agregar unas cucharadas de agua caliente para que sea mas facil moverlo.\n" +
                        "3. Calentar los restos de jugo de lomo, el vino blanco, una cucharada de miel, el agua y el jugo sazonador. Dejar hervir 10 minutos\n" +
                        "4. Diluir la maicena en un poco de agua.\n"+
                        "5. Añadir la maicena a la salsa gravy en fuego lento, mover para que no se pegue.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )

            Spacers()
            MainButton("🏡<<HOME<<🏡", Color.Green, Color.Black){
                navController.popBackStack()
            }
        }
    }
}