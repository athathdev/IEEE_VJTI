package com.vjti.ieee.ieee_vjti.Model

/**
 * Created by mandar on 27-10-2017.
 */
class Super_Event_Card_Info_Collector {
    private var Category : String? = null
    private var recyclerView: Int? = null

    constructor(Category: String?, recyclerView: Int?) {
        this.Category = Category
        this.recyclerView = recyclerView
    }

    fun getCategory():String{
        return this.Category!!
    }
    fun getRecyclerView():Int{
        return this.recyclerView!!
    }
}