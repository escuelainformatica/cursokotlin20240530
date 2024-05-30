package cl.eftec.app20240530.componente.listado

import androidx.compose.runtime.Composable
import cl.eftec.app20240530.componente.fila.fotofila
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun fotolistado(fotoVistaModelo: FotoVistaModelo) {
    for(foto in fotoVistaModelo.fotos) {
        fotofila(fotoVista = foto)
    }
}