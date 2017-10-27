package com.vjti.ieee.ieee_vjti.Model

/**
 * Created by mandar on 25-10-2017.
 */
class Project_Card_Info_Collector {
    private var Title : String? = null
    private var Discription: String? = null
    private var Image: String? = null
    private var chips : ArrayList<String>? = null

    constructor(Title: String?, Discription: String?, Image: String?,chips:ArrayList<String>) {
        this.Title = Title
        this.Discription = Discription
        this.Image = Image
        this.chips = chips
    }

    fun getTitle():String{
        return "${this.Title}"
    }
    fun getTDiscription():String{
        return "${this.Discription}"
    }
    fun getImage():String{
        return "${this.Image}"
    }
    fun getChips():ArrayList<String>{
        return chips!!
    }

}