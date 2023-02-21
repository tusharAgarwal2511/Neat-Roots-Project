package com.example.neatrootsproject

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



//       registerTwoActivityBinding.button.setOnClickListener {
//            val intent = Intent(this, LoginActivity::class:java)
//            startActivity(intent)
//            finish()
//        }
    }
}
