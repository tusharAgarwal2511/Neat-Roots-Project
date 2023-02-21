package com.example.neatrootsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityHomeBinding
import com.example.neatrootsproject.databinding.ActivityWelcomeBinding

class WelcomeActivity : AppCompatActivity() {
    val welcomeActivityBinding : ActivityWelcomeBinding by lazy {
        ActivityWelcomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(welcomeActivityBinding.root)

        welcomeActivityBinding.welcomeRegisterBtn.setOnClickListener {
            //Redirect to Register
//            startActivity(Intent(this,RegisterOneActivity::class.java))
            val intent = Intent(this@WelcomeActivity,RegisterOneActivity::class.java)
            startActivity(intent)
        }
    }
}