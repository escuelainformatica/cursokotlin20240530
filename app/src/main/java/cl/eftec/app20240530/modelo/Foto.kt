package cl.eftec.app20240530.modelo


import com.google.gson.annotations.SerializedName


data class Foto(
    @SerializedName("albumId") var albumId: Int? = null,
    @SerializedName("id") var id: Int? = null,
    @SerializedName("title") var title: String? = null,
    @SerializedName("url") var url: String? = null,
    @SerializedName("thumbnailUrl") var thumbnailUrl: String? = null

)