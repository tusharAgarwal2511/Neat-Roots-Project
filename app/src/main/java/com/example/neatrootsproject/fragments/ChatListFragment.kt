package com.example.neatrootsproject.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neatrootsproject.R
import com.example.neatrootsproject.activites.ChatActivity
import com.example.neatrootsproject.databinding.FragmentChatListBinding
import com.example.neatrootsproject.fragments.adapters.ChatListRecyclerViewAdapter
import com.example.neatrootsproject.fragments.modals.ChatListModal

class ChatListFragment : Fragment(), ChatListRecyclerViewAdapter.OnChatItemClickListener {


    val chatListFragmentBinding by lazy {
        FragmentChatListBinding.inflate(layoutInflater)
    }

    lateinit var chatListRecyclerViewAdapter : ChatListRecyclerViewAdapter
    private lateinit var chatList : ArrayList<ChatListModal>


    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_chat_list, container, false)

        chatList = ArrayList()

        chatList.add(ChatListModal(name = "James", chat = "Thank you! That was very helpful!", profile = R.drawable.chat_list_fragment_img1))
        chatList.add(ChatListModal(name = "Will Kenny", chat = "I know.. I am trying to get the funds", profile = R.drawable.chat_list_fragment_img2))
        chatList.add(ChatListModal(name = "Beth Williams", chat = "I’m looking for tips around capturing the milky way. I have a 6D with a 24-100mm...", profile = R.drawable.chat_list_fragment_img3))
        chatList.add(ChatListModal(name = "Rev Shawn", chat = "Wanted to ask you if you are available for portrait shoot next week", profile = R.drawable.chat_list_fragment_img4))

        chatListRecyclerViewAdapter = ChatListRecyclerViewAdapter(chatList, this)

        chatListFragmentBinding.chatListRecyclerView.adapter = chatListRecyclerViewAdapter
        chatListFragmentBinding.chatListRecyclerView.smoothScrollToPosition(0)
        chatListFragmentBinding.chatListRecyclerView.layoutManager = LinearLayoutManager(this@ChatListFragment.context)


        return chatListFragmentBinding.root
    }

    override fun onClick(position : Int) {
        val chatActivityIntent = Intent(context, ChatActivity::class.java)
        val chatName = chatList[position]
        chatActivityIntent.putExtra("NAME", chatName.name)
        startActivity(chatActivityIntent)
    }

}