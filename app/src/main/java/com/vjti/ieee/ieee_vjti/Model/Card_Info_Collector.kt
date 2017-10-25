package com.vjti.ieee.ieee_vjti.Model

/**
 * Created by mandar on 24-10-2017.
 */
class Card_Info_Collector {
    val DRAWABLE = ""//"drawable/"

    private var stationTitle0: String? = null
    private var imgUri0: String? = null
    private var stationTitle1: String? = null
    private var imgUri1: String? = null

    constructor (stationTitle0: String, imgUri0: String,stationTitle1: String, imgUri1: String) {
        this.stationTitle0 = stationTitle0
        this.imgUri0 = imgUri0
        this.stationTitle1 = stationTitle1
        this.imgUri1 = imgUri1
    }

    fun getStationTitle0(): String {
        return stationTitle0!!
    }

    fun getImgUri0(): String {
        return DRAWABLE + imgUri0
    }
    fun getStationTitle1(): String {
        return stationTitle1!!
    }

    fun getImgUri1(): String {
        return DRAWABLE + imgUri1
    }



}