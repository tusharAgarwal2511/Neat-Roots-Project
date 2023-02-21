package com.example.neatrootsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityRegisterTwoBinding

class RegisterTwoActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityRegisterTwoBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_two)

        supportActionBar!!.hide()

//        binding.button.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class:java)
//            startActivity(intent)
//            finish()
//        }
    }
}