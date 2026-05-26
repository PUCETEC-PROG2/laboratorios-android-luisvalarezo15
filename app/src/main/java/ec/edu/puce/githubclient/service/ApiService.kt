package ec.edu.puce.githubclient.service

import androidx.compose.ui.text.style.TextDirection
import coil.memory.MemoryCache
import ec.edu.puce.githubclient.models.Repository
import ec.edu.puce.githubclient.models.RepositoryPayload
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {
    @GET("/user/repos")
    suspend fun  getRepositories(
    @Query(value = "affiliation") affiliation : String = "owner",
    @Query(value = "sort") sort : String = "created",
    @Query(value = "direction") direction : String = "desc",
    @Query(value = "per_page") perPage : Int = 100


    ): List<Repository>
    @POST(value = "/user/repos")
    suspend fun createRepostory(
        @Body repository: RepositoryPayload
    ): Repository
}