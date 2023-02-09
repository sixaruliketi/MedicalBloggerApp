package com.example.medicalbloggerapp.auth.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.medicalbloggerapp.MainActivity
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.auth.signup.SignUpActivity
import com.example.medicalbloggerapp.databinding.ActivityLoginBinding
import com.example.medicalbloggerapp.databinding.ActivityMainBinding
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    private val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            loginButton.setOnClickListener {
                val email = loginEmailEditText.text.toString()
                val password = loginPasswordEditText.text.toString()

                if (email.isEmpty() || password.isEmpty()) {
                    Toast.makeText(this@LoginActivity, "something went wrong!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }
                auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                    if (it.isSuccessful) {
                        startActivity(Intent(this@LoginActivity, MainActivity::class.java))
                    } else {
                        Toast.makeText(this@LoginActivity, "something went wrong! try again later", Toast.LENGTH_SHORT).show()
                        loginEmailEditText.text.clear()
                        loginPasswordEditText.text.clear()
                    }
                }
            }
            loginSignUpButton.setOnClickListener {
                startActivity(Intent(this@LoginActivity,SignUpActivity::class.java))
                finish()
            }
        }
    }
}