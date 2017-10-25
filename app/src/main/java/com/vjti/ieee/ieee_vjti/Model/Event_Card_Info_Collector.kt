package com.vjti.ieee.ieee_vjti.Model

/**
 * Created by mandar on 25-10-2017.
 */
class Event_Card_Info_Collector {
    private var Title : String? = null
    private var Discription: String? = null
    private var Image: String? = null

    constructor(Title: String?, Discription: String?, Image: String?) {
        this.Title = Title
        this.Discription = Discription
        this.Image = Image
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
}