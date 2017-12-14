package com.vjti.ieee.ieee_vjti.Model

import java.io.Serializable

/**
 * Created by mandar on 25-10-2017.
 */
class Event_Card_Info_Collector : Serializable {
    private var date: String? = null
    private var discription: String? = null
    private var image: String? = null
    private var prize: String? = null
    private var ps: String? = null
    private var register: String? = null
    private var venue: String? = null

    constructor(date: String?, Discription: String?, Image: String?, prize: String = "some prize", ps: String = "some ps", register: String = "some register", venue: String = "some venue") {
        this.date = date
        this.discription = Discription
        this.image = Image
        this.prize = prize
        this.ps = ps
        this.register = register
        this.venue = venue
    }

    fun getDate(): String {
        return "${this.date}"
    }

    fun getTDiscription(): String {
        return "${this.discription}"
    }

    fun getImage(): String {
        return "${this.image}"
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

}