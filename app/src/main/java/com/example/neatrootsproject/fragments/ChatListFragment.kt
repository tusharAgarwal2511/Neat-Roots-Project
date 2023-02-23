package com.example.neatrootsproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neatrootsproject.R
import com.example.neatrootsproject.databinding.FragmentChatListBinding
import com.example.neatrootsproject.fragments.adapters.ChatListRecyclerViewAdapter
import com.example.neatrootsproject.fragments.modals.ChatListModal

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ChatListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChatListFragment : Fragment() {
    // TODO: Rename and change types of parameters

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

        chatListRecyclerViewAdapter = ChatListRecyclerViewAdapter(chatList)

        chatListFragmentBinding.chatListRecyclerView.adapter = chatListRecyclerViewAdapter
        chatListFragmentBinding.chatListRecyclerView.layoutManager = LinearLayoutManager(this@ChatListFragment.context)


        return chatListFragmentBinding.root
    }

}