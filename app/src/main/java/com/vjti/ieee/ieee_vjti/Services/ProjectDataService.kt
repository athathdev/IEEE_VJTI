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

    fun getFeaturedStations(): ArrayList<Project_Card_Info_Collector> {
        //Pretend we just downloaded featured stations from the Internet

        val list = ArrayList<Project_Card_Info_Collector>()

        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))


        return list
    }
}