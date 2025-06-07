package com.example.jokesapi.data

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class JokesViewModel : ViewModel() {

    val jokesData = MutableLiveData<ResponseJokes>()

    val _jokesData
        get() = jokesData

    init {
        getRandomJokes()
    }

    fun getRandomJokes() {

        viewModelScope.launch {

            val response = JokesClient.jokesApiService.getJokes()

            if (response.isSuccessful) {

                jokesData.postValue(response.body())
            }
        }
    }
}