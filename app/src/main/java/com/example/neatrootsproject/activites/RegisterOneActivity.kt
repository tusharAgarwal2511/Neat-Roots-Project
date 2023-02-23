package com.example.neatrootsproject.activites



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.neatrootsproject.databinding.ActivityRegisterOneBinding

class RegisterOneActivity : AppCompatActivity() {

    val registerOneActivityBinding by lazy {
        ActivityRegisterOneBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(registerOneActivityBinding.root)
        

        // redirects to the next register screen - register 2
        registerOneActivityBinding.btnRegisterOneNext.setOnClickListener {
            val intent = Intent(this@RegisterOneActivity, RegisterTwoActivity::class.java)
            startActivity(intent)
        }
    }
}