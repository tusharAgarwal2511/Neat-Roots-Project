package com.example.neatrootsproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.neatrootsproject.R
import com.example.neatrootsproject.databinding.FragmentChatListBinding
import com.example.neatrootsproject.databinding.FragmentHomeBinding
import com.example.neatrootsproject.fragments.adapters.HomeHorizonalRvAdapter
import com.example.neatrootsproject.fragments.modals.HomeHorizonalRvModel

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    val HomeFragmentBinding by lazy {
        FragmentHomeBinding.inflate(layoutInflater)
    }

    lateinit var homehorizonalrvadapter : HomeHorizonalRvAdapter
    private lateinit var homehorizonalrvlist : ArrayList<HomeHorizonalRvModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_home, container, false)

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

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment HomeFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                HomeFragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}