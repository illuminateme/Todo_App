package com.aima.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aima.todoapp.R
import com.aima.todoapp.adapters.CountryAdapter
import com.aima.todoapp.databinding.ActivityCountryBinding
import com.aima.todoapp.models.Country

class CountryActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCountryBinding
    private lateinit var myCountryAdapter: CountryAdapter

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityCountryBinding.inflate(layoutInflater)
            setContentView(binding.root)

            val countries: List<Country> = listOf(
                Country(
                R.drawable.ic_brazil,
                    name = "Brazil",
                  continent = "South America",
                    population = 12L
                ),
                Country(
                    R.drawable.ic_china,
                    name = "China",
                    continent = "Asia",
                    population = 40L
                ),
                Country(
                    R.drawable.ic_nigeria,
                    name = "Nigeria",
                    continent = "Africa",
                    population = 30L
                ),
                Country(
                    R.drawable.ic_usa,
                    name = "United States",
                    continent = "North America",
                    population = 35L
                ),
                Country(
                    R.drawable.ic_britain,
                    name = "United Kingdom",
                    continent = "Europe",
                    population = 8L
            )
            )
            myCountryAdapter = CountryAdapter(countries)
            binding.countryRecyclerView.adapter = myCountryAdapter
        }
    }
