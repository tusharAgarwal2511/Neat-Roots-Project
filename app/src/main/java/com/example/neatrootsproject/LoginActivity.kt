package com.example.neatrootsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityLoginBinding
import com.example.neatrootsproject.databinding.ActivityRegisterOneBinding

class LoginActivity : AppCompatActivity() {

    val loginActivityBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(loginActivityBinding.root)


        // redirects to home screen
        loginActivityBinding.btnLoginLogin.setOnClickListener {
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}