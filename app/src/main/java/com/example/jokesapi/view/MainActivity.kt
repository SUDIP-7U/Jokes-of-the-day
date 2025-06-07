package com.example.jokesapi.view

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.jokesapi.R
import com.example.jokesapi.data.JokesViewModel

class MainActivity : AppCompatActivity() {
   private lateinit var viewModel: JokesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[JokesViewModel::class.java]

        viewModel._jokesData.observe(this) { data->
            Log.d("TAG", "onCreate: Jokes $data")
        }
    }
}