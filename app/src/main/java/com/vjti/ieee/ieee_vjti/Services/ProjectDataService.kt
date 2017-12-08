package com.vjti.ieee.ieee_vjti.Services

import com.vjti.ieee.ieee_vjti.Model.Project_Card_Info_Collector

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

    fun getFeaturedStations(stats:Int = 0): ArrayList<Project_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet
        var array : ArrayList<String> = ArrayList()
        array.add("rasberry pie")

        val list = ArrayList<Project_Card_Info_Collector>()
        if(stats == 0) {
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Project_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
        }
        return list
    }
}