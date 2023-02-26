package com.example.neatrootsproject.fragments

import android.content.Context.INPUT_METHOD_SERVICE
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neatrootsproject.R
import com.example.neatrootsproject.databinding.FragmentSearchBinding
import com.example.neatrootsproject.fragments.adapters.SearchFragmentImageRecyclerViewAdapter
import com.example.neatrootsproject.fragments.modals.SearchFragmentImageModal

class SearchFragment : Fragment() {

    val searchFragmentBinding by lazy {
        FragmentSearchBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater : LayoutInflater, container : ViewGroup?,
        savedInstanceState : Bundle?
    ) : View? {
        // Inflate the layout for this fragment
        val searchImageList : ArrayList<SearchFragmentImageModal> = ArrayList()
        val searchFragmentAdapter : SearchFragmentImageRecyclerViewAdapter
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_one, R.drawable.dog_search_two,R.drawable.dog_search_three))
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_four,R.drawable.dog_search_five,R.drawable.dog_search_six))

        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_seven,R.drawable.dog_search_eight,R.drawable.dog_search_nine))
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_ten,R.drawable.dog_search_eleven,R.drawable.dog_search_twelve))
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_thirteen,R.drawable.dog_search_fourteen,R.drawable.dog_search_fifteen))
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_sixteen,R.drawable.dog_search_seventeen,R.drawable.dog_search_eighteen))
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_ninteen,R.drawable.dog_search_twenty,R.drawable.dog_search_tewntyone))
        searchImageList.add(SearchFragmentImageModal(R.drawable.dog_search_twentytwo,R.drawable.dog_search_twentythree,R.drawable.dog_search_twentyfour))

        searchFragmentAdapter = SearchFragmentImageRecyclerViewAdapter(searchImageList)
        searchFragmentBinding.searchImageRecyclerView.layoutManager = LinearLayoutManager(context)
        searchFragmentBinding.searchImageRecyclerView.smoothScrollToPosition(0)


        searchFragmentBinding.searchEdittext?.setOnFocusChangeListener { v, hasFocus ->
            if (hasFocus) {
                searchFragmentBinding.searchEdittext?.hint = "Search"
                searchFragmentBinding.searchEdittext!!.text!!.clear()
            } else {
                searchFragmentBinding.searchEdittext!!.hint = ""
            }
        }


        searchFragmentBinding.etSearchPhotos.setEndIconOnClickListener {
            searchFragmentBinding.btnSeeMore.isVisible = true
            searchFragmentBinding.textViewAllResult.isVisible = true

            searchFragmentBinding.searchImageRecyclerView.adapter= searchFragmentAdapter

            // Hide the keyboard
            val imm = context?.getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(searchFragmentBinding.etSearchPhotos.windowToken, 0)


        }
        return searchFragmentBinding.root

    }
}