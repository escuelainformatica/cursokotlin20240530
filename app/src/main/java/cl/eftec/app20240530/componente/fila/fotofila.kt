package cl.eftec.app20240530.componente.fila

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

import cl.eftec.app20240530.modelo.FotoVista
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo
import coil.compose.AsyncImage

@Composable
fun fotofila(fotoVista: FotoVista) {
    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .height(70.dp)
            .fillMaxWidth()
    ) {
        Row {
            //Image.
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth(0.15f)
                    .fillMaxHeight()
                    .background(Color.Green)
            ) {
                AsyncImage(
                    model = fotoVista.thumbnailUrl,
                    contentDescription = null,
                )
            }
            Column(modifier = Modifier.fillMaxWidth(0.8f)) {
                Text(text = fotoVista.title!!)
                Text(text = fotoVista.url!!)
            }
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Green)
            ) {
                Text(
                    text = fotoVista.id.toString(),


                    )
            }

        }

    }
}