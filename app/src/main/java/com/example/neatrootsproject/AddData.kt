package com.example.neatrootsproject

import com.example.neatrootsproject.fragments.modals.ProfileFragmentRecyclerModel

object AddData {
        fun addDataIntoArrayList(): ArrayList<ProfileFragmentRecyclerModel>{
            val arraylist = ArrayList<ProfileFragmentRecyclerModel>()

            arraylist.add(ProfileFragmentRecyclerModel(R.drawable.profile_recycler_image_one))
            arraylist.add(ProfileFragmentRecyclerModel(R.drawable.profile_recycler_image_two))
            arraylist.add(ProfileFragmentRecyclerModel(R.drawable.profile_recycler_image_three))
            arraylist.add(ProfileFragmentRecyclerModel(R.drawable.profile_recycler_image_four))
            arraylist.add(ProfileFragmentRecyclerModel(R.drawable.profile_recycler_image_five))
            arraylist.add(ProfileFragmentRecyclerModel(R.drawable.profile_recycler_image_six))

            return arraylist
    }
}