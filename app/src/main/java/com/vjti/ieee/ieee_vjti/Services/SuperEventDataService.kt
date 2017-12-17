package com.vjti.ieee.ieee_vjti.Services

import com.vjti.ieee.ieee_vjti.Model.Super_Event_Card_Info_Collector

/**
 * Created by mandar on 27-10-2017.
 */
class SuperEventDataService {
    companion object {
        private var ourInstance = SuperEventDataService()

    }

    fun getInstance(): SuperEventDataService {
        return ourInstance
    }

    private fun DataService() {

    }

    fun getFeaturedCategories(): ArrayList<Super_Event_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet
        var array : ArrayList<String> = ArrayList()
        array.add("TOP")
        val list = ArrayList<Super_Event_Card_Info_Collector>()
        list.add(Super_Event_Card_Info_Collector((array[0]),0))
        return list
    }
}