package cl.eftec.app20240530.componente

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import cl.eftec.app20240530.componente.paginas.paginaformulariofoto
import cl.eftec.app20240530.componente.paginas.paginalistafoto
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun Navegacion(fotoVistaModelo: FotoVistaModelo) {
    val navController = rememberNavController()
    fotoVistaModelo.navController=navController
    NavHost(navController = navController, startDestination = "listadofoto") {
        composable("listadofoto") { paginalistafoto(fotoVistaModelo) }
        composable("formulariofoto") { paginaformulariofoto(fotoVistaModelo) }

        composable(
            route = "formulariofoto/{name}",
            arguments = listOf(navArgument("name") { type = NavType.StringType })
        ) { backStackEntry ->
            /* todo */
        }
    }
}