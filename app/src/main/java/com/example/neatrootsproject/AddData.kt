package com.example.neatrootsproject

import com.example.neatrootsproject.fragments.modals.HomeStaggerRvModel
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

    fun addDataToStaggerArrayList(): ArrayList<HomeStaggerRvModel>{
        val arraylist = ArrayList<HomeStaggerRvModel>()


        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_demo_img))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img1))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img2))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_stagger_img))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img4))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_stagger_img))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img6))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img7))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img9))
        arraylist.add(HomeStaggerRvModel(R.drawable.home_fragment_stagger_img10))

        return arraylist

    }


}