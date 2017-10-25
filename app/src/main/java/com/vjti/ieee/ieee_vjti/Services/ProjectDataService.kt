package com.vjti.ieee.ieee_vjti.Services

import com.vjti.ieee.ieee_vjti.Model.Card_Info_Collector

/**
 * Created by mandar on 24-10-2017.
 */
class ProjectDataService {
    companion object {
        private var ourInstance : ProjectDataService = ProjectDataService()

    }

    fun getInstance(): ProjectDataService {
        return ourInstance
    }

    private fun DataService() {

    }

    fun getFeaturedStations(): ArrayList<Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet

        val list = ArrayList<Card_Info_Collector>()
        list.add(Card_Info_Collector("Flight Plan (Tunes for Travel)", "@mipmap/ic_launcher_round","Flight Plan (Tunes for Travel)", "@mipmap/ic_launcher_round"))
        list.add(Card_Info_Collector("Two-Wheelin' (Biking Playlist)", "@mipmap/ic_launcher_round","Flight Plan (Tunes for Travel)", "@mipmap/ic_launcher_round"))
        list.add(Card_Info_Collector("Kids Jams (Music for Children", "@mipmap/ic_launcher_round","Flight Plan (Tunes for Travel)", "@mipmap/ic_launcher_round"))
        list.add(Card_Info_Collector("Kids Jams (Music for Children", "@mipmap/ic_launcher_round","Flight Plan (Tunes for Travel)", "@mipmap/ic_launcher_round"))


        return list
    }
}