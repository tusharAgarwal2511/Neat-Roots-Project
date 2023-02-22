package com.example.neatrootsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityRegisterTwoBinding

class RegisterTwoActivity : AppCompatActivity() {

    val registerTwoActivityBinding by lazy {
        ActivityRegisterTwoBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(registerTwoActivityBinding.root)

        // redirects to login screen
        registerTwoActivityBinding.btnRegisterSignUp.setOnClickListener {
            val intent = Intent(this@RegisterTwoActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}
