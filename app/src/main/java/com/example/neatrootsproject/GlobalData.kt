package com.example.neatrootsproject

import android.app.Application
import com.example.neatrootsproject.fragments.ProfileFragment

class GlobalData : Application() {

    var userName : String? = "Jane"

    fun getData() : String? {
        return userName
    }

    fun setData(userName : String?) {
        this.userName = userName
    }



}