package com.vjti.ieee.ieee_vjti.Adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vjti.ieee.ieee_vjti.Activities.MainActivity
import com.vjti.ieee.ieee_vjti.Holders.Card_Event_View_Holder
import com.vjti.ieee.ieee_vjti.Model.Event_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R


/**
 * Created by mandar on 24-10-2017.
 */
class Event_Adapters (stations: ArrayList<Event_Card_Info_Collector>): RecyclerView.Adapter<Card_Event_View_Holder>() {
    private var stations: ArrayList<Event_Card_Info_Collector>? = null

    init {
        this.stations = stations
    }

    override fun onBindViewHolder(holder: Card_Event_View_Holder, position: Int) {
        val station = stations!![position]

        holder.updateUI(station)

        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View) {
                //Load the details
                MainActivity.mainActivity?.loadDetailsScreen(station)
            }
        })

    }


    override fun getItemCount(): Int {
        return stations!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Card_Event_View_Holder {

        val stationCard = LayoutInflater.from(parent.context).inflate(R.layout.card_4_events, parent, false)
        return Card_Event_View_Holder(stationCard)
    }

}