package com.example.neatrootsproject.fragments.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.neatrootsproject.activites.ChatActivity
import com.example.neatrootsproject.databinding.ChatListItemBinding
import com.example.neatrootsproject.databinding.FragmentChatListBinding
import com.example.neatrootsproject.fragments.modals.ChatListModal


class ChatListRecyclerViewAdapter(private val chatList : ArrayList<ChatListModal>, private val onChatItemClickListener : OnChatItemClickListener) : RecyclerView.Adapter<ChatListRecyclerViewAdapter.ViewHolder>() {

    private lateinit var chatListBinding : FragmentChatListBinding
    inner class ViewHolder(val chatListItemBinding : ChatListItemBinding, onChatItemClickListener : OnChatItemClickListener) : RecyclerView.ViewHolder(chatListItemBinding.root){

        init {

            chatListItemBinding.clChatListItem.setOnClickListener {
                onChatItemClickListener.onClick(adapterPosition)
            }
        }
    }

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : ViewHolder {
        val view = ChatListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view, onChatItemClickListener)
    }

    override fun getItemCount() : Int {
        return chatList.size

    }

    override fun onBindViewHolder(holder : ViewHolder, position : Int) {

        val temp = chatList[position] // temporarily storing the current chatList position

        holder.chatListItemBinding.tvChatListName.text = temp.name
        holder.chatListItemBinding.tvChatListChat.text = temp.chat
        holder.chatListItemBinding.ivChatListProfile.setImageResource(temp.profile)



    }

    interface OnChatItemClickListener{

        fun onClick(position : Int)

    }

}