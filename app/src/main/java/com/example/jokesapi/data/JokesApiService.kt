package com.example.jokesapi.data

import retrofit2.Response
import retrofit2.http.GET

interface JokesApiService {
    @GET("joke/Any")
    suspend fun getJokes(): Response<ResponseJokes>
}