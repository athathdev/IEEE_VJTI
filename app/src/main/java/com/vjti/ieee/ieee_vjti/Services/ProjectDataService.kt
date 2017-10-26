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

        list.add(Project_Card_Info_Collector("Embaded","mkljumanshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvikmmmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnv\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Embaded","manshdjkkflpwoirutyuwqopjjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))
        list.add(Project_Card_Info_Collector("Machine Learning","manshdjkkflpwoirutyuwqopjmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvmanshdjkkflpwoirutyuwqopjjfnjnjvskn\n" +
                "kcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\n" +
                "dcnsdnnvnjfnvjnnvjfnjnjvskn\nkcdmdfikmmmckdmmimimnvjnfslmckdmknjnnvnvnvjn\ndcnsdnnvnjfnvjnnv", "@mipmap/ic_launcher_round"))


        return list
    }
}