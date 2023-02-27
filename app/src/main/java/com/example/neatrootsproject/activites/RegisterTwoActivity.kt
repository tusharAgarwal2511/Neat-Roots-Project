package com.example.neatrootsproject.activites

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.appcompat.app.AppCompatActivity
import com.example.neatrootsproject.GlobalData
import com.example.neatrootsproject.databinding.ActivityRegisterTwoBinding

class RegisterTwoActivity : AppCompatActivity() {

    val registerTwoActivityBinding by lazy {
        ActivityRegisterTwoBinding.inflate(layoutInflater)
    }

    lateinit var name : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(registerTwoActivityBinding.root)





        // redirects to login screen
        registerTwoActivityBinding.btnRegisterSignUp.setOnClickListener {
            val intent = Intent(this@RegisterTwoActivity, LoginActivity::class.java)

//            use for email validation
            name = registerTwoActivityBinding.etRegisterTwoName?.text.toString()
            if (TextUtils.isEmpty(name)){
                registerTwoActivityBinding.etRegisterTwoName?.error = "Please enter your name"
                return@setOnClickListener
            }

            val myApp = applicationContext as GlobalData
            myApp.userName = name.toString()




            startActivity(intent)
        }
    }
}
