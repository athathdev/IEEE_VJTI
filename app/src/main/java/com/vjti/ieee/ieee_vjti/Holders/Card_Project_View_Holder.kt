package com.vjti.ieee.ieee_vjti.Holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Model.Project_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R

/**
 * Created by mandar on 25-10-2017.
 */
class Card_Project_View_Holder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var Title : TextView? = null
    private var Discription: TextView? = null
    private var Image: ImageView? = null
    private var chip : TextView? = null

    init  {
        this.Title = itemView.findViewById<TextView>(R.id.project_title)
        this.Image = itemView.findViewById<ImageView>(R.id.project_image)
        this.Discription = itemView.findViewById<TextView>(R.id.project_discription)
        this.chip = itemView.findViewById<TextView>(R.id.chip_event)
    }

    fun updateUI(station: Project_Card_Info_Collector) {
        var uri = station.getImage()
        val resource0 = Image?.getResources()?.getIdentifier(uri, null, Image?.getContext()?.getPackageName())
        Image?.setImageResource(resource0!!)

        Title?.setText(station.getTitle())
        Discription?.setText(station.getTDiscription())
        chip?.setText(station.getChips()[0])
    }
}