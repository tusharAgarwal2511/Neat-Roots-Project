package com.example.neatrootsproject.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.neatrootsproject.R
import com.example.neatrootsproject.fragments.ChatListFragment
import com.example.neatrootsproject.fragments.HomeFragment
import com.example.neatrootsproject.fragments.ProfileFragment
import com.example.neatrootsproject.fragments.SearchFragment
import com.example.neatrootsproject.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    val homeActivityBinding : ActivityHomeBinding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }
    
    override fun onCreate(savedInstanceState : Bundle?) {

        super.onCreate(savedInstanceState)


        setContentView(homeActivityBinding.root)


        // default selected item when activity loads
        homeActivityBinding.bottomNavigationView.setItemSelected(R.id.bottom_navigation_home)
        replaceFragments(HomeFragment())

        homeActivityBinding.bottomNavigationView.setOnItemSelectedListener {

            when(it) {

                R.id.bottom_navigation_home -> replaceFragments(HomeFragment())
                R.id.bottom_navigation_search -> replaceFragments(SearchFragment())
                R.id.bottom_navigation_chat -> replaceFragments(ChatListFragment())
                R.id.bottom_navigation_profile -> replaceFragments(ProfileFragment())
                R.id.bottom_navigation_add -> replaceFragments(HomeFragment())



            }
        }

    }

    private fun replaceFragments(fragment : Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.bottom_navigation_frame_layout, fragment)
        fragmentTransaction.commit()
    }
}