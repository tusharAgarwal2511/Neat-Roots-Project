package com.example.neatrootsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityRegisterOneBinding

class RegisterOneActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityRegisterOneBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportActionBar!!.hide()

        binding.button.setOnClickListener {
            val intent = Intent(this, RegisterTwoActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}