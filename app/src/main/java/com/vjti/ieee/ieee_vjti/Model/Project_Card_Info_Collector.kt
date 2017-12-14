package com.vjti.ieee.ieee_vjti.Model

import java.io.Serializable

/**
 * Created by mandar on 25-10-2017.
 */
class Project_Card_Info_Collector : Serializable {
    private var title : String? = null
    private var text: String? = null
    private var team : String?= null
    private var members : ArrayList<String>? = null
    //    private var Image: String? = null
//    private var chips : ArrayList<String>? = null
    init {

    }
    constructor(team:String,text:String,title: String) {
        this.team = team
        this.title = title
        this.text = text
        this.members = ArrayList()
        var split: List<String> = team.split(" ")
        var i = 0
        while (i < split!!.size) {
            this.members!!.add(" ${split[i]} ${split[i + 1]}")//for name and surname
            i += 2
        }
    }


    fun getTitle():String{
        return "${this.title}"
    }
    fun getTDiscription():String{
        return "${this.text}"
    }
    fun getmembers():ArrayList<String>?{
        return this.members
    }

}