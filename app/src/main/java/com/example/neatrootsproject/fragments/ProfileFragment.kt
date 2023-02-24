package com.example.neatrootsproject.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.neatrootsproject.AddData
import com.example.neatrootsproject.R
import com.example.neatrootsproject.databinding.FragmentProfileBinding
import com.example.neatrootsproject.fragments.adapters.ProfileFragmentRecyclerAdapter
import com.example.neatrootsproject.fragments.modals.ProfileFragmentRecyclerModel

class ProfileFragment : Fragment() {

    val bindingProfileFragment by lazy {
        FragmentProfileBinding.inflate(layoutInflater)
    }
    lateinit var arrayList: ArrayList<ProfileFragmentRecyclerModel>

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?
    ) : View? {
        // Inflate the layout for this fragment
        arrayList = AddData.addDataIntoArrayList()
        bindingProfileFragment.rvProfileImageRecyclerview.adapter = ProfileFragmentRecyclerAdapter(arrayList)
        bindingProfileFragment.rvProfileImageRecyclerview.setHasFixedSize(true)
        bindingProfileFragment.rvProfileImageRecyclerview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        return bindingProfileFragment.root
    }
}