package cl.eftec.app20240530.modelo

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

class FotoVista() {
    var albumId by mutableStateOf<Int?>(null)
    var id by mutableStateOf<Int?>(null)
    var title  by mutableStateOf<String?>(null)
    var url by mutableStateOf<String?>(null)
    var thumbnailUrl by mutableStateOf<String?>(null)

    constructor(albumId: Int?, id: Int?, title: String?, url: String?, thumbnailUrl: String?) : this() {
        this.albumId = albumId
        this.id = id
        this.title = title
        this.url = url
        this.thumbnailUrl = thumbnailUrl
    }
    fun crearCopiaFoto():FotoVista {
        var fotoNueva=FotoVista()
        fotoNueva.id=id
        fotoNueva.title=title
        fotoNueva.url=url
        fotoNueva.albumId=albumId
        fotoNueva.thumbnailUrl=thumbnailUrl
        return fotoNueva
    }
    fun borrarDatos() {
        id=null
        title=null
        url=null
        albumId=null
        thumbnailUrl=null
    }

}

/*
        "albumId": 1,
        "id": 1,
        "title": "accusamus beatae ad facilis cum similique qui sunt",
        "url": "https://via.placeholder.com/600/92c952",
        "thumbnailUrl": "https://via.placeholder.com/150/92c952"
 */