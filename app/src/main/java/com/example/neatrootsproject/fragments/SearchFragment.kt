package com.example.neatrootsproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neatrootsproject.R
import com.example.neatrootsproject.databinding.FragmentSearchBinding
import com.example.neatrootsproject.fragments.adapters.SearchFragmentImageRecyclerViewAdapter
import com.example.neatrootsproject.fragments.modals.SearchFragmentImageModal

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SearchFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SearchFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1 : String? = null
    private var param2 : String? = null

    val searchFragmentBinding by lazy {
        FragmentSearchBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }

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
        searchFragmentBinding.searchImageRecyclerView.adapter= searchFragmentAdapter
        return searchFragmentBinding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SearchFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1 : String, param2 : String) =
            SearchFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}