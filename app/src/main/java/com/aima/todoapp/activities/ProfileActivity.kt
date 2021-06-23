package com.aima.todoapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aima.todoapp.R
import com.aima.todoapp.databinding.ActivityProfileBinding

class ProfileActivity : AppCompatActivity() {

    private lateinit var binding: ActivityProfileBinding

    private lateinit var homeButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        binding = ActivityProfileBinding.inflate(layoutInflater)

     // same function as above   homeButton = findViewById(R.id.homeButton)
        homeButton.setOnClickListener {
            val anyIntent = Intent(this,HomeActivity::class.java)
            startActivity(anyIntent)
        }
    }
}