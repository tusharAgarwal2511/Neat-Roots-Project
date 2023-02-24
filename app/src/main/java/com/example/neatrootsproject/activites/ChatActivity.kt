package com.example.neatrootsproject.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.neatrootsproject.databinding.ActivityChatBinding

class ChatActivity : AppCompatActivity() {

    val chatActivityBinding : ActivityChatBinding by lazy {
        ActivityChatBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(chatActivityBinding.root)

        val extras = intent.extras
        if (extras != null) {
            val value = extras.getString("NAME")
            //The key argument here must match that used in the other activity
            chatActivityBinding.tvChatFragmentName.text = value.toString()
        }



    }
}