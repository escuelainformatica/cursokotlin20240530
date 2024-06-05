package cl.eftec.app20240530.api

import cl.eftec.app20240530.modelo.Foto
import cl.eftec.app20240530.vistamodelo.FotoVistaModelo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class FotoRest {
    private fun constructor():Retrofit {
        val retrofit = Retrofit.Builder()
            .baseUrl("https://jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit
    }
    fun listarFotos(fotoVistaModelo: FotoVistaModelo) {
        val retrofit=constructor()
        val api = retrofit.create(FotoAPI::class.java)
        val call: Call<List<Foto>?>? = api.obtenerFotos();
        call!!.enqueue(object: Callback<List<Foto>?> {
            override fun onResponse(call: Call<List<Foto>?>, response: Response<List<Foto>?>) {
                if(response.isSuccessful) {
                    //Log.d("Main", "success!" + response.body().toString())
                    fotoVistaModelo.cargarFotoListo(response.body())
                }
            }
            override fun onFailure(call: Call<List<Foto>?>, t: Throwable) {
                fotoVistaModelo.cargarFotoError(t.message)
                //Log.e("Main", "Failed mate " + t.message.toString())
            }
        })
    }
    fun agregarFoto(fotoVistaModelo: FotoVistaModelo) {
        val retrofit=constructor()
        val api = retrofit.create(FotoAPI::class.java)
        val call: Call<Foto?>? = api.agregarFoto(fotoVistaModelo.foto.convertirAFoto());


        call!!.enqueue(object: Callback<Foto?> {
            override fun onResponse(call: Call<Foto?>, response: Response<Foto?>) {
                if(response.isSuccessful) {
                    //Log.d("Main", "success!" + response.body().toString())
                    fotoVistaModelo.agregarFotoOK(response.body())
                }
            }
            override fun onFailure(call: Call<Foto?>, t: Throwable) {

                fotoVistaModelo.agregatFotoError(t.message)
                //Log.e("Main", "Failed mate " + t.message.toString())
            }
        })
    }
}