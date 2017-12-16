package com.vjti.ieee.ieee_vjti.Holders

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Model.Project_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R

/**
 * Created by mandar on 25-10-2017.
 */
class Card_Project_View_Holder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var title : TextView? = null
    private var text: TextView? = null
    private var members : ArrayList<TextView>? = null
//    private var Image: ImageView? = null
//    private var chip : TextView? = null

    init  {
        this.title = itemView.findViewById<TextView>(R.id.project_title)
        this.text = itemView.findViewById<TextView>(R.id.project_discription)
        this.members = ArrayList()
    }

    fun updateUI(station: Project_Card_Info_Collector) {
//        var uri = station.getImage()
//        val resource0 = Image?.getResources()?.getIdentifier(uri, null, Image?.getContext()?.getPackageName())
        title?.setText(station.getTitle())
        text?.setText(station.getText())
        /*var i = 0
        var mem = station.getmembers()
        while(i<8){

            if(i<mem!!.size)
                members!![i].text = mem[i]
            //else members!![i].text = ""
            i+=1
        }*/

    }
}