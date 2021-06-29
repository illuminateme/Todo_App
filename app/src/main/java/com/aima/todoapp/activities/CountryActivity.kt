package com.aima.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.todoapp.R
import com.aima.todoapp.databinding.ActivityCountryBinding

class CountryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountryBinding

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityCountryBinding.inflate(layoutInflater)
            setContentView(binding.root)
        }
    }
