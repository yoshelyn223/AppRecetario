package com.example.apprestarios.views

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.apprestarios.components.Recetas

@Composable
fun RecetaView(navController: NavController, recetaId: Int?) {
    val receta = Recetas.listaRecetas.find { it.id == recetaId }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        if (receta != null) {
            Text(text = receta.nombre, style = MaterialTheme.typography.headlineMedium)
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Ingredientes:", style = MaterialTheme.typography.titleMedium)
            receta.ingredientes.forEach { ingrediente ->
                Text(text = "- $ingrediente", style = MaterialTheme.typography.bodyMedium)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = "Instrucciones:", style = MaterialTheme.typography.titleMedium)
            receta.instrucciones.forEachIndexed { index, instruccion ->
                Text(text = "${index + 1}. $instruccion", style = MaterialTheme.typography.bodyMedium)
            }
        } else {
            Text(text = "Receta no encontrada", style = MaterialTheme.typography.headlineMedium)
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Regresar al inicio")
        }
    }
}
