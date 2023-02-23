package com.example.neatrootsproject.fragments.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.neatrootsproject.databinding.ChatListItemBinding
import com.example.neatrootsproject.fragments.modals.ChatListModal

class ChatListRecyclerViewAdapter(private val chatList : ArrayList<ChatListModal>) :RecyclerView.Adapter<ChatListRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(val binding : ChatListItemBinding) : RecyclerView.ViewHolder(binding.root){}

    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : ViewHolder {
        val view = ChatListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() : Int {
        return chatList.size

    }

    override fun onBindViewHolder(holder : ViewHolder, position : Int) {

        val temp = chatList[position] // temporarily storing the current chatList position

        holder.binding.tvChatListName.text = temp.name
        holder.binding.tvChatListChat.text = temp.chat
        holder.binding.ivChatListProfile.setImageResource(temp.profile)


    }
}