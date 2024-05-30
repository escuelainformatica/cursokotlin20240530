package cl.eftec.app20240530

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.remember
import cl.eftec.app20240530.componente.scaffold
import cl.eftec.app20240530.ui.theme.App20240530Theme
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            App20240530Theme {
                var fotovm= remember {
                    FotoVistaModelo()
                }
                fotovm.cargarFotos()
                scaffold(fotovm)
            }
        }
    }
}
