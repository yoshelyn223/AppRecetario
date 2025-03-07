package com.example.apprestarios.views


import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.apprestarios.R
import com.example.apprestarios.components.ActionButton
import com.example.apprestarios.components.CardItem
import com.example.apprestarios.components.TitleBar
import com.example.apprestarios.ui.theme.BackGround
import com.example.apprestarios.ui.theme.ItemColor
import com.example.apprestarios.ui.theme.TitleColor

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    TitleBar("VARIEDAD DE RECETAS")
                },
                colors =
                    TopAppBarDefaults.centerAlignedTopAppBarColors(containerColor = TitleColor)
            )
        },
        floatingActionButton = {
            ActionButton(Color.Red)
        }
    ){
        ContentView(navController)
    }
}

@Composable
private fun ContentView(navController: NavController) {

    LazyColumn(
        modifier = Modifier.fillMaxSize()
            .background(BackGround),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            CardItem(
                name = "Espagueti verde con queso philadelphia",
                img = R.drawable.spagetiverde,
                onClick = {
                    navController.navigate("Detalle")
                }
            )
        }
        item {
            CardItem(
                name = "Pastel Azteca con Salsa de Chipotle",
                img = R.drawable.pastelazteca,
                onClick = {
                    navController.navigate("PastelView")
                }
            )
        }
        item {
            CardItem(
                name = "Lomo con Gravy",
                img = R.drawable.lomogravy,
                onClick = {
                    navController.navigate("LomoView")
                }
            )
        }
        item {
            CardItem(
                name = "Corn Dogs Banderillas Coreanas",
                img = R.drawable.corndogs,
                onClick = {
                    navController.navigate("BanderillasView")
                }
            )
        }
    }
}