package com.example.apprestarios.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.apprestarios.views.BanderillasView
import com.example.apprestarios.views.HomeView
import com.example.apprestarios.views.LomoView
import com.example.apprestarios.views.PastelView
import com.example.apprestarios.views.RecetaView


@Composable
fun NavManager() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Home"
    ) {
        composable("Home") {
            HomeView(navController)
        }
        composable("Detalle") {
            RecetaView(navController)
        }
        composable("PastelView") {
            PastelView(navController)
        }
        composable("LomoView") {
            LomoView(navController)
        }
        composable("BanderillasView") {
            BanderillasView(navController)
        }
    }
}