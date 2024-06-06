package cl.eftec.app20240530.vistamodelo

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.mutableStateListOf
import androidx.navigation.NavHostController
import cl.eftec.app20240530.api.FotoRest
import cl.eftec.app20240530.modelo.Foto
import cl.eftec.app20240530.modelo.FotoVista
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

class FotoVistaModelo {
    var scope: CoroutineScope?=null
    var snackBar: SnackbarHostState?=null
    val foto=FotoVista()
    val fotos = mutableStateListOf<FotoVista>()
    var navController: NavHostController?=null

    fun cargarFotos() {
        var fotoRest=FotoRest()
        var listado=fotoRest.listarFotos(this)
    }
    fun cargarFotoListo(fotosDesdeRest: List<Foto>?) {
        fotos.clear()
        if(fotosDesdeRest==null) {
            return
        }
        var fila=0
        for(foto in fotosDesdeRest) {
            var fotoNueva=FotoVista()
            fotoNueva.asignarDesdeFoto(foto)
            fotos.add(fotoNueva)
            fila++
            if(fila>10) {
                break // salir del ciclo
            }
        }
    }
    fun cargarFotoError(message: String?) {
        //todo: pendiente mostrar error
    }

    fun agregarFoto() {
        var fotoRest=FotoRest()
        fotoRest.agregarFoto(this)
    }
    fun agregarFotoOK(body: Foto?) {
        fotos.add(foto.crearCopiaFoto())
        foto.borrarDatos()
        navController!!.popBackStack()
        scope!!.launch {
            snackBar!!.showSnackbar("Agregado exitosamente", withDismissAction = true, duration = SnackbarDuration.Indefinite)
        }

    }
    fun agregatFotoError(message: String?) {
        scope!!.launch {
            snackBar!!.showSnackbar("Error")
        }
    }



   /* @Volatile
    private var INSTANCE: EmployeeRoomDatabase? = null
    fun getInstance(context: Context): EmployeeRoomDatabase {
        // only one thread of execution at a time can enter this block of code
        synchronized(this) {
            var instance = INSTANCE

            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    EmployeeRoomDatabase::class.java,
                    "employee_database"
                ).fallbackToDestructiveMigration()
                    .build()

                INSTANCE = instance
            }
            return instance
        }
    }*/
}