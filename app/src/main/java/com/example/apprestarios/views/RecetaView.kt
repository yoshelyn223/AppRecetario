package com.example.apprestarios.views

import android.annotation.SuppressLint
import androidx.annotation.ContentView
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
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
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
fun RecetaView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Espagueti verde con queso philadelphia")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = FontColor),
                navigationIcon = {
                    MainIconButton(Icons.AutoMirrored.Filled.ArrowBack){
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
private fun ContentView(navController: NavController) {
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
                painter = painterResource(id = R.drawable.spagetiverde),
                contentDescription = "Espagueti verde con queso philadelphia",
                modifier = Modifier
                    .size(320.dp)
                    .clip(RoundedCornerShape(16.dp))
            )
            Text(
                text = "Ingredientes",
                fontSize = 30.sp,
                fontWeight = FontWeight.ExtraBold,
            )
            Spacers()
            Text(
                text = "250 grs de Espagueti \n" +
                        "300 grs Chile poblano asado, desvenados y limpios \n" +
                        "340 grs Queso crema de philadelphia \n" +
                        "2 botes de crema liquida\n" +
                        "4 rebanadas de queso tipo manchego\n" +
                        "150 grs de mantequilla sin sal\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Divider(
                color = Color.Gray,
                thickness =  1.dp
            )

            Spacers()
            Text(
                text = "Paso a paso",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1. Cocer la pasta con unas gotas de acete y una pizca de sal, hasta que este blanda.\n" +
                        "2. Licuar crema, queso crema, chiles, queso manchego. (Si esta muy espeso poner leche).\n" +
                        "3. En una olla verter la mantequilla hasta que se derrita completamente, colocar la mezcla de las cremas y chile hasta que empiece a hervir.\n" +
                        "4. Colocaar la pasta en la olla con la crema y los chiles, moverla poco a poco hasta qeu todo quede bien mezclado y listo.\n",
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
