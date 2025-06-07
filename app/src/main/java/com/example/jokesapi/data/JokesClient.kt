package com.example.jokesapi.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object JokesClient {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://v2.jokeapi.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val jokesApiService = retrofit.create(JokesApiService::class.java)

}