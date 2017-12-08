package com.vjti.ieee.ieee_vjti.Services

import com.vjti.ieee.ieee_vjti.Model.Event_Card_Info_Collector

/**
 * Created by mandar on 24-10-2017.
 */
class EventDataService {
    companion object {
        private var ourInstance = EventDataService()

    }

    fun getInstance(): EventDataService {
        return ourInstance
    }

    private fun DataService() {

    }

    fun getFeaturedStations(stats:Int = 0): ArrayList<Event_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet
        var array : ArrayList<String> = ArrayList()
        array.add("rasberry pie")

        val list = ArrayList<Event_Card_Info_Collector>()
        if(stats == 0) {
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
            list.add(Event_Card_Info_Collector("Workshop", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic", array))
        }
        return list
    }
}