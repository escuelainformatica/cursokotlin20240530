package cl.eftec.app20240530.componente.paginas

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import cl.eftec.app20240530.componente.formulario.fotoformulario
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun paginaformulariofoto(fotoVistaModelo: FotoVistaModelo) {
    fotoformulario(fotoVistaModelo.foto,fotoVistaModelo)
}