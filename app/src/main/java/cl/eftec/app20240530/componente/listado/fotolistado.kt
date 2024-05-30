package cl.eftec.app20240530.componente.listado

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import cl.eftec.app20240530.componente.fila.fotofila
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun fotolistado(fotoVistaModelo: FotoVistaModelo) {
    Column {


    for(foto in fotoVistaModelo.fotos) {
        fotofila(fotoVista = foto)
    }
    ElevatedButton(onClick = { fotoVistaModelo.navController!!.navigate("formulariofoto")  }) {
        Text("Agregar")
    }
    }
}