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

    fun getFeaturedStations(): ArrayList<Event_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet

        val list = ArrayList<Event_Card_Info_Collector>()
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        return list
    }
}