package cl.eftec.app20240530.api

import cl.eftec.app20240530.modelo.Foto
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST
import retrofit2.http.Path

public interface FotoAPI {
    @Headers(
        "Accept: application/json"
    )
    //@GET("posts/{id}")
    //abstract fun getPostById(@Path("id") id: String): Call<Foto?>?
    //@GET("posts")
    //abstract fun getPosts(): Call<List<Foto>?>?
    @GET("photos")
    abstract fun obtenerFotos(): Call<List<Foto>?>?
    @POST("photos")
    abstract fun agregarFoto(@Body()post:Foto):Call<Foto?>?
}
