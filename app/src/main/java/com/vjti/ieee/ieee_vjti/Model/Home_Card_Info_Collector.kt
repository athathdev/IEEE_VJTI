package com.vjti.ieee.ieee_vjti.Model

/**
 * Created by mandar on 25-10-2017.
 */
class Home_Card_Info_Collector {
    private var Title : String? = null
    private var url: String? = null
    private var Image: String? = null

    constructor(Title: String?, url: String?, Image: String?) {
        this.Title = Title
        this.url = url
        this.Image = Image
    }

    fun getTitle():String{
        return "${this.Title}"
    }
    fun getTDiscription():String{
        return "${this.url}"
    }
    fun getImage():String{
        return "${this.Image}"
    }
}