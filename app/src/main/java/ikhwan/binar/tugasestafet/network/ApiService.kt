package ikhwan.binar.tugasestafet.network

import ikhwan.binar.estafet24mei.model.GetUserItemItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("user")
    fun getUser(
        @Query("username") username: String
    ) : Call<List<GetUserItemItem>>
}