package dev.rhcehd123.core.network

import dev.rhcehd123.core.model.GachaResult
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query
import javax.inject.Inject

private interface RetrofitGachaSaverNetworkApi {
    @GET("history")
    suspend fun getGachaHistory(@Query("userId") userId: String, @Query("projectId") projectid: Long): NetworkResponse<List<GachaResult>>
}

private data class NetworkResponse<T> (
    val data: T,
    val msg: String,
)

const val BASE_URL = "http://192.168.0.16:3000/"
const val USER_ID = "a_8018520100734868792"
const val PROJECT_ID = 1L

class RetrofitGachaSaverNetwork @Inject constructor(): GachaSaverNetworkDataSource {
    private val networkApi = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(RetrofitGachaSaverNetworkApi::class.java)

    override suspend fun getGachaHistory(): List<GachaResult> {
        return networkApi.getGachaHistory(USER_ID, PROJECT_ID).data
    }
}