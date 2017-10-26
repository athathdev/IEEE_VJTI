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
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutykflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnskflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcndnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\nkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmikflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnmimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutykflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqokflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnpjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutyukflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Workshop","manshdjkkflpwoirutkflpwoiru\n" +
                "tyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        list.add(Event_Card_Info_Collector("Robotics","manshdjkkflpwoiru\ntyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "drawable/bicyclemusic"))
        return list
    }
}