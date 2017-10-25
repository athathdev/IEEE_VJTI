package com.vjti.ieee.ieee_vjti.Holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Model.Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R


/**
 * Created by mandar on 24-10-2017.
 */
class Card_Event_View_Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var mainImage0: ImageView? = null
    private var titleTextView0: TextView? = null
    private var mainImage1: ImageView? = null
    private var titleTextView1: TextView? = null

    init  {

        this.mainImage0 = itemView.findViewById<ImageView>(R.id.main_image0)
        this.titleTextView0 = itemView.findViewById(R.id.main_text0)
        this.mainImage1 = itemView.findViewById<ImageView>(R.id.main_image1)
        this.titleTextView1 = itemView.findViewById(R.id.main_text1)
    }

    fun updateUI(station: Card_Info_Collector) {
        var uri = station.getImgUri0()
        val resource0 = mainImage0?.getResources()?.getIdentifier(uri, null, mainImage0?.getContext()?.getPackageName())
        mainImage0?.setImageResource(resource0!!)

        titleTextView0?.setText(station.getStationTitle0())
        uri = station.getImgUri1()
        val resource1 = mainImage1?.getResources()?.getIdentifier(uri, null, mainImage1?.getContext()?.getPackageName())
        mainImage1?.setImageResource(resource1!!)

        titleTextView1?.setText(station.getStationTitle1())
    }
}