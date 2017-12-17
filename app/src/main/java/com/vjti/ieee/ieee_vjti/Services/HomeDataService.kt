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

        val list = ArrayList<Home_Card_Info_Collector>()
        list.add(Home_Card_Info_Collector("Authors","http://ieeeauthorcenter.ieee.org/?WT_mc_id", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Conference Organizers","https://www.ieee.org/conferences_events/conferences/organizers/organizers_index.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Educators","https://www.ieee.org/education_careers/education_careers_index.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Employers & Job Seekers","https://www.ieee.org/education_careers/careers/employers_job_seekers.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("FAQs","https://supportcenter.ieee.org/app/home?utm_source=hp&utm_campaign=faq&utm_medium=how&utm_term=support%20center%2C%20faqs&WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Media and Journalist","https://www.ieee.org/about/news/media_kit/media_kit_index.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Members","https://www.ieee.org/membership_services/membership_services_index.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Researchers","http://ieeexplore.ieee.org/Xplore/home.jsp?utm_source=hp&utm_campaign=xpl_research&utm_medium=how&utm_term=Xplore%20researchers&WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Students","https://www.ieee.org/membership_services/membership/students/index_students.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Volunteers","https://www.ieee.org/about/volunteers/volunteer_index.html?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Women in Engineering","http://wie.ieee.org/about/?WT.mc_id=", "@mipmap/ic_launcher_round"))
        list.add(Home_Card_Info_Collector("Young Professionals","https://www.ieee.org/membership_services/membership/young_professionals/index_young_professionals.html?WT.mc_id=", "@mipmap/ic_launcher_round"))

        return list
    }
}