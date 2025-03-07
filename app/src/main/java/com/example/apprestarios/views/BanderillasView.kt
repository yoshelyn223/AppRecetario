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
import androidx.compose.material3.Divider
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
fun BanderillasView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("Corn Dogs Banderillas Coreanas")
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
                painter = painterResource(id = R.drawable.corndogs),
                contentDescription = "Corn Dogs Banderillas Coreanas",
                modifier = Modifier
                    .size(320.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Spacers()
            Text(
                text = "Ingredientes\n"+ "Para la masa\n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "3 tazas de harina de trigo.\n" +
                        "5 cucharadas de azucar.\n" +
                        "1 1/2 cucharada de sal.\n" +
                        "1 sobre de levadura.\n" +
                        "2 cucharadas de aceite de sesamo tostado.\n"+
                        "2 huevos.\n"+
                        "1 taza de agua tibia.\n",
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
                text = "Ingredientes\n"+ "Para la papa\n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "4 papas grandes en cubitos.\n" +
                        "Agua para cocer.\n" +
                        "Almidon de maiz (maicena).\n",
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
                text = "Ingredientes\n"+ "Para las salsas\n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "2 cucharadas de mayonesa.\n" +
                        "2 cucharadas de salsa Sriracha.\n" +
                        "1 cucharada de aceite de Ajonjoli.\n" +
                        "4 cucharadas de salsa Sweet Chili.\n" +
                        "2 cucharadas de Gochujang.\n",
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
                text = "Ingredientes\n"+ "Para armar las banderillas\n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1 paquete de salchichas de tu preferencia.\n" +
                        "500 grs de queso Mozzarella.\n" +
                        "1 lt de aceite comestible.\n" +
                        "Palitos de madera.\n" +
                        "1 paquete de panko.\n",
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
                text = "Preparacion de las banderillas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1. En un bowl coloca el agua tibia, el sobre de levadura y un poco del azúcar, deja reposar por dos minutos y mueve para diluirla bien.\n" +
                        "2. Añade los huevos, el resto del azúcar, la harina, la sal y los dos huevos.\n" +
                        "3. Bate un poco y después mezcla con una espátula hasta que tengas una masita blanda.\n" +
                        "4. Agrega el aceite de sésamo y sigue mezclando por un minuto, deja reposar hasta que doble su tamaño.\n"+
                        "5. Pica las papas en cubitos pequeños.\n"+
                        "6. Ponlas en agua hirviendo por 5 minutos, no deben estar completamente cocidas.\n"+
                        "7. Pásalas por agua fría y escúrrelas, deja secar.\n"+
                        "8. Añade maizena a las papas secas para que absorban lo que queda de humedad, debe cubrirlas bien.\n"+
                        "9. Parte tus salchichas a la mitad.\n"+
                        "10. Corta el queso en palitos.\n"+
                        "11. En los palitos de madera inserta la salchicha y después el queso.\n"+
                        "12. Cubre la banderilla con la masa, después recubrela con las papas y baña con panko, así los huequitos que queden estarán cubiertos.\n"+
                        "13. Fríe las banderillas en aceite caliente hasta que se vean doraditas.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 24.dp),
                textAlign = TextAlign.Justify
            )

            Divider(
                color = Color.Gray,
                thickness =  1.dp
            )

            Spacers()
            Text(
                text = "Preparacion de las salsas",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1. Se harán dos salsas, para la primera añade la mayonesa, la sriracha y el aceite de ajonjolí, mezcla bien.\n" +
                        "2.Para la otra salsa mezcla el Sweet chili y el gochujang, mezcla bien.\n" +
                        "3.Pon en tu banderilla ¡y disfruta!\n",
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