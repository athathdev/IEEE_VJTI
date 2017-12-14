package com.vjti.ieee.ieee_vjti.Holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Model.Event_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R


/**
 * Created by mandar on 24-10-2017.
 */
class Card_Event_View_Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var Date: TextView? = null
    private var Discription: TextView? = null
    private var Image: ImageView? = null
    private var prize: TextView? = null
    private var ps: TextView? = null
    private var register: TextView? = null
    private var venue: TextView? = null

    init  {
        this.Date = itemView.findViewById<TextView>(R.id.event_title)
        this.Discription = itemView.findViewById<TextView>(R.id.event_discription)
    }

    fun updateUI(station: Event_Card_Info_Collector) {
//        var uri = station.getImage()
//        val resource0 = Image?.getResources()?.getIdentifier(uri, null, Image?.getContext()?.getPackageName())
        Date?.setText(station.getDate())
        Discription?.setText(station.getTDiscription())
    }
}