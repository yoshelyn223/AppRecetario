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
fun PastelView(navController: NavController){
Scaffold(
    topBar ={
        CenterAlignedTopAppBar(
            title = {
                TitleBar("Pastel Azteca")
            },
            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = FontColor),
        navigationIcon = {
            MainIconButton(Icons.AutoMirrored.Filled.ArrowBack){
                navController.popBackStack()
            }
        }
            )
    }
) {
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
                painter = painterResource(id = R.drawable.pastelazteca),
                contentDescription = "Pastel Azteca con Salsa de Chipotle",
                modifier = Modifier
                    .size(320.dp)
                    .clip(RoundedCornerShape(16.dp))
            )

            Text(
                text = "Ingredientes\n" + "Salsa Cremosa de Chipotle\n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacers()
            Text(
                text = "1 lata de salsa de tomate.\n" +
                        "1 1/2 tazas de Crema Marca Supremo de V&V SUPREMO. \n" +
                        "2 dientes de ajo a la mitad \n" +
                        "2 chiles chipotle de lata, SIN SEMILLAS.\n" +
                        "1/2 cucharadita de sal de grano Kosher.\n" +
                        "1/4 de cucharadita de pimienta negra molida.\n",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier.padding(horizontal = 8.dp)
            )
            Divider(
                color = Color.Gray,
                thickness =  1.dp
            )

            Text(
                text = "Ingredientes\n" + "Relleno\n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacers()
            Text(
                text = "2 cucharadas de aceite vegetal, cantidad dividida.\n" +
                        "1/2 cebolla grande blanca, fileteada. \n" +
                        "2 dientes de ajo, machacado.\n" +
                        "2 tazas de pollo rostizado, deshebrado.\n" +
                        "1 taza de granos de elote congelados.\n" +
                        "2 chiles poblanos, asados sin piel y sin semillas, cortado en tiras.\n"+
                        "1 calabaza, rodajas, cortadas en cuartos.\n"+
                        "1/2 cucharadita de sal.\n"+
                        "1/4 de cucharadita de pimienta negra molida.\n"+
                        "3/4 de taza de Queso Cotija Marca Sierra de V&V SUPREMO cantidad dividida.\n"+
                        "4-6 hojas de epazote fresco, cortado en tiras.\n"+
                        "8 tortillas de maiz.\n"+
                        "3 tazas de Queso Quesadilla Rallado Marca Chihuahua.\n",
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
                text = "7 Pasos para completar",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )
            Spacers()
            Text(
                text = "1. Precalienta el horno a 375°F. \n" +
                        "2. Licúa todos los ingredientes para la salsa en la licuadora. Pon a un lado.\n" +
                        "3. Precalienta un sartén con 1 cucharada de aceite a fuego medio por 1 minuto. Añade la cebolla y saltea por 1 minuto, agrega el ajo y cocina por 30 segundos, añade el pollo, el elote, las rajas de chile poblano, las calabazas, sal, pimienta, y cocina por 5 minutos. Apaga el fuego, añade el epazote, y ½ taza de queso Cotija, revuelve y reserva.\n" +
                        "4. Precalienta un comal a fuego medio por 1 minuto. Unta las tortillas con el aceite restante y caliéntalas por 1 minuto de cada lado. Corta las tortillas a la mitad. Pon a un lado.\n"+
                        "5. Cubre un refractario de 8x8 para el horno con 1/3 de taza de la salsa. Acomoda sobre la salsa 5 mitades de tortillas. Añade, 1/3 de taza de salsa sobre las tortillas, 1¼ de tazas de la preparación del pollo, 1 taza de queso Chihuahua y vuelve a empezar. Tortillas, salsa, pollo, y queso Chihuahua\n"+
                        "6. Combina lo que quedo del queso Cotija y Chihuahua y cubre el pastel con el queso. Hornea de 25-30 minutos o hasta que el queso se gratine. Remueve del horno y deja enfriar de 10-15 minutos.\n"+
                        "7. Sirve y disfruta!\n",
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
