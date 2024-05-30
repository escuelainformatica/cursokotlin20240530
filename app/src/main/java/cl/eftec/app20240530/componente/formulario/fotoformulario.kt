package cl.eftec.app20240530.componente.formulario

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cl.eftec.app20240530.modelo.FotoVista
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

@Composable
fun fotoformulario(fotoVista: FotoVista,fotoVistaModelo: FotoVistaModelo) {
    Column {
        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Ingrese el titulo")},
            value = if(fotoVista.title!=null) fotoVista.title!! else "",
            onValueChange = {fotoVista.title=it} )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Ingrese la url")},
            value = if(fotoVista.url!=null) fotoVista.url!! else "",
            onValueChange = {fotoVista.url=it} )
        TextField(
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Ingrese la id")},
            value = if(fotoVista.id!=null) fotoVista.id?.toString()!! else "",
            onValueChange = {fotoVista.id= it.toInt()} )
        Row {
            ElevatedButton(onClick = { fotoVistaModelo.agregarFotoalListado() }) {
                Text("Agregar")
            }
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text("Cancelar")
            }
        }
    }
}