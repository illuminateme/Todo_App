package com.aima.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    val validUsername: String = "admin"
    val validPassword: String = "admin"

    //Layout Variables
    private lateinit var usernameInput: EditText
    private lateinit var passwordInput: EditText
    private lateinit var submitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameInput = findViewById(R.id.usernameInput)
        passwordInput = findViewById(R.id.passwordInput)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()

            login(username, password)
        }
    }

    fun login(username:String, password:String){
        if (isValidCredentials(username, password)){
            val intent : Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("username", username)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Invalid Credentials", Toast.LENGTH_SHORT ).show()
        }
    }

   private fun isValidCredentials(username: String, password: String):Boolean {
        if (password == validPassword) return true
        return false
    }

}