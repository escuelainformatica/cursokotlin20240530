package cl.eftec.app20240530.componente.listado

import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import cl.eftec.app20240530.componente.fila.fotofila
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun fotolistado(fotoVistaModelo: FotoVistaModelo) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        ElevatedButton(onClick = { fotoVistaModelo.navController!!.navigate("formulariofoto") }) {
            Text("Agregar")
        }

        for (foto in fotoVistaModelo.fotos) {
            fotofila(fotoVista = foto)
        }

    }
}