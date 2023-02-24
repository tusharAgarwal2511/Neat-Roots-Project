package com.example.neatrootsproject.fragments.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.neatrootsproject.databinding.RecyclerviewProfileFragmentBinding
import com.example.neatrootsproject.fragments.modals.ProfileFragmentRecyclerModel

class ProfileFragmentRecyclerAdapter(val arrayList: ArrayList<ProfileFragmentRecyclerModel>) :
    RecyclerView.Adapter<ProfileFragmentRecyclerAdapter.ViewHolder>(){
    inner class ViewHolder (binding: RecyclerviewProfileFragmentBinding) : RecyclerView.ViewHolder(binding.root){
          val image = binding.imageRecyclerItem
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(RecyclerviewProfileFragmentBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = arrayList[position]
        holder.image.setImageResource(index.image)
    }
}