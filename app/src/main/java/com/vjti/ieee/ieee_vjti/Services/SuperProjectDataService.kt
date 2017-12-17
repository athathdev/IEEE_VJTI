package com.vjti.ieee.ieee_vjti.Services

import com.vjti.ieee.ieee_vjti.Model.Super_Project_Card_Info_Collector

/**
 * Created by mandar on 27-10-2017.
 */
class SuperProjectDataService {
    companion object {
        private var ourInstance = SuperProjectDataService()

    }

    fun getInstance(): SuperProjectDataService {
        return ourInstance
    }

    private fun DataService() {

    }

    fun getFeaturedCategories(): ArrayList<Super_Project_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet
        var array : ArrayList<String> = ArrayList()
        array.add("NEW")
        val list = ArrayList<Super_Project_Card_Info_Collector>()
        list.add(Super_Project_Card_Info_Collector((array[0]),0))
        return list
    }
}