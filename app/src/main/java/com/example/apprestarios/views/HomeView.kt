package com.example.apprestarios.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.apprestarios.components.Recetas


// HomeView.kt
@Composable
fun HomeView(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(text = "Recetario", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))
        LazyColumn {
            items(Recetas.listaRecetas) { receta ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    onClick = {
                        // Navegamos a "Detalle" con el recetaId como parámetro
                        navController.navigate("Detalle/${receta.id}")
                    }
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(text = receta.nombre, style = MaterialTheme.typography.headlineSmall)
                        Text(text = receta.descripcion, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}