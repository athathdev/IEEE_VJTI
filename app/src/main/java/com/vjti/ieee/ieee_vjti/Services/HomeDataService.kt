package com.vjti.ieee.ieee_vjti.Services

import com.vjti.ieee.ieee_vjti.Activities.MainActivity
import com.vjti.ieee.ieee_vjti.Model.Home_Card_Info_Collector

/**
 * Created by mandar on 24-10-2017.
 */
class HomeDataService {
    companion object {
        private var ourInstance = HomeDataService()

    }

    fun getInstance(): HomeDataService {
        return ourInstance
    }

    private fun DataService() {

    }

    fun getFeaturedStations(): ArrayList<Home_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet

//        val list = ArrayList<Home_Card_Info_Collector>()
        MainActivity.HomeCards?.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        MainActivity.HomeCards?.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Our Vision","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//        list.add(Home_Card_Info_Collector("Opportunities","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
//

        return MainActivity.HomeCards!!
    }
}