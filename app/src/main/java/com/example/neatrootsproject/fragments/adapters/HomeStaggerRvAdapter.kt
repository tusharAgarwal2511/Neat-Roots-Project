package com.example.neatrootsproject.fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.neatrootsproject.databinding.HomeFragmentStaggerRvBinding
import com.example.neatrootsproject.databinding.RecyclerviewProfileFragmentBinding
import com.example.neatrootsproject.fragments.modals.HomeStaggerRvModel
import com.example.neatrootsproject.fragments.modals.ProfileFragmentRecyclerModel

class HomeStaggerRvAdapter (val homestaggerlist: ArrayList<HomeStaggerRvModel>) :
    RecyclerView.Adapter<HomeStaggerRvAdapter.ViewHolder>(){

    inner class ViewHolder (binding: HomeFragmentStaggerRvBinding) : RecyclerView.ViewHolder(binding.root){
        val image = binding.homeFragmentStaggerImg
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(HomeFragmentStaggerRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return homestaggerlist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val index = homestaggerlist[position]
        holder.image.setImageResource(index.image)
    }

}