package com.example.neatrootsproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.neatrootsproject.AddData
import com.example.neatrootsproject.R
import com.example.neatrootsproject.databinding.FragmentHomeBinding
import com.example.neatrootsproject.fragments.adapters.HomeHorizonalRvAdapter
import com.example.neatrootsproject.fragments.adapters.HomeStaggerRvAdapter
import com.example.neatrootsproject.fragments.adapters.ProfileFragmentRecyclerAdapter
import com.example.neatrootsproject.fragments.modals.HomeHorizonalRvModel
import com.example.neatrootsproject.fragments.modals.HomeStaggerRvModel

class HomeFragment : Fragment() {


    val HomeFragmentBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    lateinit var homehorizonalrvadapter : HomeHorizonalRvAdapter
    private lateinit var homehorizonalrvlist : ArrayList<HomeHorizonalRvModel>

    //stagger recyclerView
    private lateinit var homestaggerlist : ArrayList<HomeStaggerRvModel>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        //Stagger Recycler View
        homestaggerlist = AddData.addDataToStaggerArrayList()
        HomeFragmentBinding.homeFragmentStaggerRv.adapter = HomeStaggerRvAdapter(homestaggerlist)
        HomeFragmentBinding.homeFragmentStaggerRv.setHasFixedSize(true)
        HomeFragmentBinding.homeFragmentStaggerRv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)



        homehorizonalrvlist = ArrayList()

        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.homeonedemo,R.drawable.homeprofiledemo,"Ridhwan Nordin","@ridzjcob"))
        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.home_fragment_img1,R.drawable.home_fragment_profile_img1,"Clem Onojeghuo","@clemono2"))
        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.home_fragment_img2,R.drawable.home_fragment_profile_img2,"Jon Tyson","@jontyson"))
        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.home_fragment_img3,R.drawable.home_fragment_profile_img3,"Simon Zhu","@smnzhu"))
        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.homeonedemo,R.drawable.homeprofiledemo,"Ridhwan Nordin","@ridzjcob"))
        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.home_fragment_img1,R.drawable.home_fragment_profile_img1,"Clem Onojeghuo","@clemono2"))
        homehorizonalrvlist.add(HomeHorizonalRvModel(R.drawable.home_fragment_img2,R.drawable.home_fragment_profile_img2,"Jon Tyson","@jontyson"))

        homehorizonalrvadapter = HomeHorizonalRvAdapter(homehorizonalrvlist)

        HomeFragmentBinding.homeFragmentRecyclerView.adapter = homehorizonalrvadapter
        HomeFragmentBinding.homeFragmentRecyclerView.layoutManager = LinearLayoutManager(this@HomeFragment.context,LinearLayoutManager.HORIZONTAL,false)
        return HomeFragmentBinding.root
    }


}