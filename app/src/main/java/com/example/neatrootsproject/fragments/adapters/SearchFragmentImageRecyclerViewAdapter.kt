package com.example.neatrootsproject.fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.neatrootsproject.databinding.SearchFragmentImagesViewLayoutBinding
import com.example.neatrootsproject.fragments.modals.SearchFragmentImageModal

class SearchFragmentImageRecyclerViewAdapter(val searchImageList: ArrayList<SearchFragmentImageModal>) : RecyclerView.Adapter<SearchFragmentImageRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: SearchFragmentImagesViewLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = SearchFragmentImagesViewLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return searchImageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.imageViewDog1.setImageResource(searchImageList[position].image1)
        holder.binding.imageViewDog2.setImageResource(searchImageList[position].image2)
        holder.binding.imageViewDog3.setImageResource(searchImageList[position].image3)
    }


}