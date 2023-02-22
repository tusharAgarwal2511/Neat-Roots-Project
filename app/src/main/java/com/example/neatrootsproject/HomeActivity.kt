package com.example.neatrootsproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.size
import androidx.fragment.app.Fragment
import com.example.neatrootsproject.Fragments.ChatFragment
import com.example.neatrootsproject.Fragments.HomeFragment
import com.example.neatrootsproject.Fragments.ProfileFragment
import com.example.neatrootsproject.Fragments.SearchFragment
import com.example.neatrootsproject.databinding.ActivityHomeBinding
import com.example.neatrootsproject.databinding.ActivityWelcomeBinding

class HomeActivity : AppCompatActivity() {

    val homeActivityBinding : ActivityHomeBinding by lazy {
        ActivityHomeBinding.inflate(layoutInflater)
    }
    // git testing
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
                R.id.bottom_navigation_chat -> replaceFragments(ChatFragment())
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