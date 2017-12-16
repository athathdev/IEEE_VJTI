package com.vjti.ieee.ieee_vjti.Model

import java.io.Serializable

/**
 * Created by mandar on 25-10-2017.
 */
class Event_Card_Info_Collector : Serializable {
    private var date: String? = null
    private var description: String? = null
    private var img: String? = null
    private var prize: String? = null
    private var ps: String? = null
    private var register: String? = null
    private var venue: String? = null

    constructor(date: String?, Discription: String?, Image: String?, prize: String = "some prize", ps: String = "some ps", register: String = "some register", venue: String = "some venue") {
        this.date = date
        this.description = Discription
        this.img = Image
        this.prize = prize
        this.ps = ps
        this.register = register
        this.venue = venue
    }

    constructor(){}

    fun getDate(): String {
        return "${this.date}"
    }

    fun getDescription(): String {
        return "${this.description}"
    }

    fun getimg(): String {
        return "${this.img}"
    }

    fun getprize(): String {
        return "${this.prize}"
    }

    fun getps(): String {
        return "${this.ps}"
    }

    fun getregister(): String {
        return "${this.register}"
    }

    fun getvenue(): String {
        return "${this.venue}"
    }
    fun setDate(date: String){
        this.date = date
    }
    fun setDescription(discription : String){
        this.description = discription
    }
    fun setimg(url : String){
        this.img = url
    }
    fun setPrize(prize: String){
        this.prize = prize
    }
    fun setPs(ps: String){
        this.ps = ps
    }
    fun setRegister(register: String){
        this.register = register
    }
    fun setVenue(venue: String){
        this.venue = venue
    }
}