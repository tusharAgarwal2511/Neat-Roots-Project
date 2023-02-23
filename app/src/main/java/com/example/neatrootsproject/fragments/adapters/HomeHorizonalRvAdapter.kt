package com.example.neatrootsproject.fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.neatrootsproject.databinding.HomeFragmentHorizontalRvBinding
import com.example.neatrootsproject.fragments.modals.HomeHorizonalRvModel

class HomeHorizonalRvAdapter  (private val homehorizonalrvlist : ArrayList<HomeHorizonalRvModel>): RecyclerView.Adapter<HomeHorizonalRvAdapter.ViewHolder>(){

    inner class ViewHolder(val binding: HomeFragmentHorizontalRvBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HomeHorizonalRvAdapter.ViewHolder {

        val view = HomeFragmentHorizontalRvBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: HomeHorizonalRvAdapter.ViewHolder, position: Int) {

    holder.binding.homeFragmentHorizontalRvImage.setImageResource(homehorizonalrvlist.get(position).image)
    holder.binding.homeFragmentHorizontalRvProfile.setImageResource(homehorizonalrvlist.get(position).profile)
    holder.binding.homeFragmentHorizontalRvName.text = homehorizonalrvlist.get(position).name
    holder.binding.homeFragmentHorizontalRvUsername.text = homehorizonalrvlist.get(position).username

    }

    override fun getItemCount(): Int {
        return homehorizonalrvlist.size
    }
}