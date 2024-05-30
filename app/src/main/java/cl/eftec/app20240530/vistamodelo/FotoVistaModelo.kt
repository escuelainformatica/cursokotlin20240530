package cl.eftec.app20240530.vistamodelo

import androidx.compose.runtime.mutableStateListOf
import androidx.navigation.NavHostController
import cl.eftec.app20240530.modelo.FotoVista

class FotoVistaModelo {
    var foto=FotoVista()
    var fotos = mutableStateListOf<FotoVista>()
    var navController: NavHostController?=null

    fun cargarFotos() {
        var fototmp=FotoVista(1,1,"titulo1","https://via.placeholder.com/150/77179","https://via.placeholder.com/150/77179")
        fotos.add(fototmp)
        fototmp=FotoVista(2,2,"titulo2","https://via.placeholder.com/150/77179","https://via.placeholder.com/150/77179")
        fotos.add(fototmp)
        fototmp=FotoVista(3,3,"titulo2","https://via.placeholder.com/150/77179","https://via.placeholder.com/150/77179")
        fotos.add(fototmp)
    }
    fun agregarFotoalListado() {
        fotos.add(foto.crearCopiaFoto())
        foto.borrarDatos()

    }
}