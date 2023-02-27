package com.example.neatrootsproject.activites


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import com.example.neatrootsproject.databinding.ActivityRegisterOneBinding

class RegisterOneActivity : AppCompatActivity() {

    val registerOneActivityBinding by lazy {
        ActivityRegisterOneBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(registerOneActivityBinding.root)

        // validation code for email and password






        // redirects to the next register screen - register 2
        registerOneActivityBinding.btnRegisterOneNext.setOnClickListener {
            val intent = Intent(this@RegisterOneActivity, RegisterTwoActivity::class.java)

            //            use for email validation and password validation
            val email = registerOneActivityBinding.etRegisterOneEmail.text.toString()
            if (TextUtils.isEmpty(email)){
                registerOneActivityBinding.etRegisterOneEmail.error = "Please enter your email"
                return@setOnClickListener
            }

            val password = registerOneActivityBinding.etRegisterOnePassword.text.toString()
            if (TextUtils.isEmpty(password)){
                registerOneActivityBinding.etRegisterOnePassword.error = "Please enter your password"
                return@setOnClickListener
            }
            startActivity(intent)
        }
    }
}