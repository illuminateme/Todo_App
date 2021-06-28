package com.aima.todoapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.aima.todoapp.R

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var goToProfile: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.usernameDisplay)
        goToProfile = findViewById(R.id.goToProfile)
        usernameDisplay.text = intent.getStringExtra("username")

        goToProfile.setOnClickListener {
            openProfilePage()
        }
    }
        fun openProfilePage() {

            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
