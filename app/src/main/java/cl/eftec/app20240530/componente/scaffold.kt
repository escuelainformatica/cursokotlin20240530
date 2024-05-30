package cl.eftec.app20240530.componente

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cl.eftec.app20240530.componente.formulario.fotoformulario
import cl.eftec.app20240530.componente.listado.fotolistado
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun scaffold(fotovm: FotoVistaModelo) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Top app bar")
                }
            )
        },
        bottomBar = {
            BottomAppBar(
                containerColor = MaterialTheme.colorScheme.primaryContainer,
                contentColor = MaterialTheme.colorScheme.primary,
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = "Bottom app bar",
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /* pendiente */ }) {

            }
        }

    ) {
        innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
        ) {
            fotolistado(fotoVistaModelo = fotovm)
            fotoformulario(fotovm.foto,fotovm)
        }
    }
}