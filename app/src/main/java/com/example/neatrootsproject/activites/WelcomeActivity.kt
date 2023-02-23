package com.example.neatrootsproject.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    val welcomeActivityBinding : ActivityWelcomeBinding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(welcomeActivityBinding.root)

        // redirects to register screen
        welcomeActivityBinding.welcomeRegisterBtn.setOnClickListener {

            val intentRegister = Intent(this@WelcomeActivity, RegisterOneActivity::class.java)
            startActivity(intentRegister)
        }

        // redirects to login screen
        welcomeActivityBinding.welcomeLoginBtn.setOnClickListener {
            val intentLogin = Intent(this@WelcomeActivity, LoginActivity::class.java)
            startActivity(intentLogin)
        }
    }
}