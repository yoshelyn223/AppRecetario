package com.example.apprestarios.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.apprestarios.views.HomeView
import com.example.apprestarios.views.RecetaView

//@Composable
//fun NavManager(navController: NavHostController) {
//    NavHost(navController = navController, startDestination = "home") {
//        composable("home") {
//            HomeView(navController)
//        }
//        composable("receta/{recetaId}") { backStackEntry ->
//            val recetaId = backStackEntry.arguments?.getString("recetaId")?.toIntOrNull()
//            RecetaView(navController, recetaId)
//        }
//    }
//}

//@Composable
//fun NavManager() {
//    val navController = rememberNavController()
//    NavHost(
//        navController = navController,
//        startDestination = "Home"
//    ) {
//        composable("Home") {
//            HomeView(navController)
//        }
//        composable("Detalle") {
//            RecetaView(navController)
//        }
//    }
//}


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

        composable("Detalle/{recetaId}") { backStackEntry ->
            val recetaId = backStackEntry.arguments?.getString("recetaId")?.toIntOrNull()
            RecetaView(navController, recetaId)
        }
    }
}