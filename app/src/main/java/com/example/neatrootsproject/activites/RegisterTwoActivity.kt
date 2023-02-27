package com.example.neatrootsproject.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
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

//            use for email validation
            val email = registerTwoActivityBinding.etRegisterTwoName?.text.toString()
            if (TextUtils.isEmpty(email)){
                registerTwoActivityBinding.etRegisterTwoName?.error = "Please enter your name"
                return@setOnClickListener
            }

            startActivity(intent)
        }
    }
}
