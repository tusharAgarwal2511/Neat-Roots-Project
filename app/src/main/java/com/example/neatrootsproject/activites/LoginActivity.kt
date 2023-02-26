package com.example.neatrootsproject.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    val loginActivityBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(loginActivityBinding.root)


        // redirects to home screen
        loginActivityBinding.btnLoginLogin.setOnClickListener {

            val email = loginActivityBinding.etLoginEmail.text.toString()
            val password = loginActivityBinding.etLoginPassword.text.toString()

            if (email.equals("")) {
                loginActivityBinding.etLoginEmail.error = "Please enter email"
                return@setOnClickListener
            }else if (password.isEmpty()){
                loginActivityBinding.etLoginPassword.error = "Please enter password"
                return@setOnClickListener
            }else{
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
            }


        }
    }
}