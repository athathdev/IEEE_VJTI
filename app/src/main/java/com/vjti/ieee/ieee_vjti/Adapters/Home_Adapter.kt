package com.vjti.ieee.ieee_vjti.Adapters

import android.content.Intent
import android.net.Uri
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vjti.ieee.ieee_vjti.Holders.Card_Home_View_Holder
import com.vjti.ieee.ieee_vjti.Model.Home_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R

/**
 * Created by mandar on 25-10-2017.
 */
class Home_Adapter (stations: ArrayList<Home_Card_Info_Collector>): RecyclerView.Adapter<Card_Home_View_Holder>() {
    private var stations: ArrayList<Home_Card_Info_Collector>? = null

    init {
        this.stations = stations
    }

    override fun onBindViewHolder(holder: Card_Home_View_Holder, position: Int) {
        val station = stations!![position]
        holder.updateUI(station)

        holder.itemView.setOnClickListener(object : View.OnClickListener {
            override  fun onClick(v: View) {
                //Load the details
                val url = station.getTDiscription()
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse(url))
                v.context.startActivity(intent)
            }
        })

    }


    override fun getItemCount(): Int {
        return stations!!.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Card_Home_View_Holder {

        val stationCard = LayoutInflater.from(parent.context).inflate(R.layout.card_4_home, parent, false)
        return Card_Home_View_Holder(stationCard)
    }

}