package com.vjti.ieee.ieee_vjti.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vjti.ieee.ieee_vjti.Holders.Super_Card_Event_View_Holder
import com.vjti.ieee.ieee_vjti.Model.Super_Event_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R

/**
 * Created by mandar on 27-10-2017.
 */
class Super_Event_Adapter (stations: ArrayList<Super_Event_Card_Info_Collector>): RecyclerView.Adapter<Super_Card_Event_View_Holder>() {
    private var stations: ArrayList<Super_Event_Card_Info_Collector>? = null
    private var mContext : Context? = null
    init {
        this.stations = stations
    }

    override fun onBindViewHolder(holder: Super_Card_Event_View_Holder, position: Int) {
        val station = stations!![position]



        holder.updateUI(station)

        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View) {
                //Load the details

            }
        })

    }


    override fun getItemCount(): Int {
        return stations!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Super_Card_Event_View_Holder {

        val stationCard = LayoutInflater.from(parent.context).inflate(R.layout.super_card_4_event, parent, false)
        return Super_Card_Event_View_Holder(stationCard)
    }

}