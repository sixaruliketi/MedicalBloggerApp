package com.example.medicalbloggerapp.auth.signup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.medicalbloggerapp.R
import com.example.medicalbloggerapp.auth.login.LoginActivity
import com.example.medicalbloggerapp.databinding.ActivitySignUpBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class SignUpActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySignUpBinding
    private val firebaseAuth = Firebase.auth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            signUpButton.setOnClickListener {
                val email = signUpEmailEditText.text.toString()
                val password = signUpPasswordEditText.text.toString()
                val repeatPassword = signUpRepeatPassword.text.toString()

                if(repeatPassword!=password){
                    Toast.makeText(this@SignUpActivity, "wrong password!", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                if (email.isEmpty() || password.isEmpty()
                    || password.length < 7 || password.contains(' ')){
                    return@setOnClickListener
                }

                firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
                    if (task.isSuccessful){
                        Toast.makeText(this@SignUpActivity, "congrats! now login!", Toast.LENGTH_SHORT).show()
                        goToLogin()
                    } else {
                        Toast.makeText(this@SignUpActivity, "something's wrong, try again", Toast.LENGTH_SHORT).show()
                    }
                }
            }
            signUpLoginButton.setOnClickListener {
                goToLogin()
            }
        }
    }

    private fun goToLogin(){
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

}