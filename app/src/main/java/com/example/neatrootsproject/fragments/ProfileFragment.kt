package com.example.neatrootsproject.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.neatrootsproject.AddData
import com.example.neatrootsproject.GlobalData
import com.example.neatrootsproject.databinding.FragmentProfileBinding
import com.example.neatrootsproject.fragments.adapters.ProfileFragmentRecyclerAdapter
import com.example.neatrootsproject.fragments.modals.ProfileFragmentRecyclerModel
import javax.microedition.khronos.opengles.GL

class ProfileFragment : Fragment() {

    val bindingProfileFragment by lazy {
        FragmentProfileBinding.inflate(layoutInflater)
    }
    lateinit var arrayList: ArrayList<ProfileFragmentRecyclerModel>

    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?
    ) : View? {

        val myApp = getActivity()?.getApplicationContext() as GlobalData
        var userName = myApp.userName




        bindingProfileFragment.tvProfileName.text = userName.toString()
        bindingProfileFragment.btnFollowUser.text = "Follow $userName"

        // Inflate the layout for this fragment
        arrayList = AddData.addDataIntoArrayList()
        bindingProfileFragment.rvProfileImageRecyclerview.adapter = ProfileFragmentRecyclerAdapter(arrayList)
        bindingProfileFragment.rvProfileImageRecyclerview.setHasFixedSize(true)
        bindingProfileFragment.rvProfileImageRecyclerview.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        return bindingProfileFragment.root
    }
}