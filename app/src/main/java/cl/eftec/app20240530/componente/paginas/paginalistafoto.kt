package cl.eftec.app20240530.componente.paginas

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import cl.eftec.app20240530.componente.listado.fotolistado
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun paginalistafoto(fotoVistaModelo: FotoVistaModelo) {
    fotolistado(fotoVistaModelo = fotoVistaModelo)
}