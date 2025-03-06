package com.example.apprestarios.components

data class Receta(
    val id: Int,
    val nombre: String,
    val descripcion: String,
    val ingredientes: List<String>,
    val instrucciones: List<String>
)

object Recetas {
    val listaRecetas = listOf(
        Receta(
            id = 1,
            nombre = "Pasta Carbonara",
            descripcion = "Un clásico italiano con huevo, queso y panceta.",
            ingredientes = listOf("200g de pasta", "100g de panceta", "2 huevos", "50g de queso parmesano"),
            instrucciones = listOf("Cocinar la pasta", "Freír la panceta", "Mezclar huevo y queso", "Combinar todo")
        ),
        Receta(
            id = 2,
            nombre = "Ensalada César",
            descripcion = "Ensalada fresca con pollo y aderezo César.",
            ingredientes = listOf("Lechuga", "Pollo asado", "Crutones", "Aderezo César"),
            instrucciones = listOf("Lavar la lechuga", "Cortar el pollo", "Mezclar todos los ingredientes", "Añadir aderezo")
        ),
        Receta(
            id = 3,
            nombre = "Tarta de Manzana",
            descripcion = "Postre clásico con manzanas y masa quebrada.",
            ingredientes = listOf("4 manzanas", "200g de harina", "100g de mantequilla", "100g de azúcar"),
            instrucciones = listOf("Preparar la masa", "Cortar las manzanas", "Hornear a 180°C", "Dejar enfriar")
        ),
        Receta(
            id = 4,
            nombre = "Sopa de Tomate",
            descripcion = "Sopa cremosa de tomate con hierbas.",
            ingredientes = listOf("1kg de tomates", "1 cebolla", "2 dientes de ajo", "Caldo de verduras"),
            instrucciones = listOf("Cocinar los tomates", "Sofreír cebolla y ajo", "Licuar todo", "Servir caliente")
        )
    )
}