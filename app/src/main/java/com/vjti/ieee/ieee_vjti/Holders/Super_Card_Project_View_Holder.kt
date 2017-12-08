package com.vjti.ieee.ieee_vjti.Holders

import android.graphics.Rect
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Activities.MainActivity
import com.vjti.ieee.ieee_vjti.Adapters.Project_Adapter
import com.vjti.ieee.ieee_vjti.Model.Super_Project_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R
import com.vjti.ieee.ieee_vjti.Services.ProjectDataService

/**
 * Created by mandar on 27-10-2017.
 */
class Super_Card_Project_View_Holder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var Category : TextView? = null
    private var recyclerView: RecyclerView? = null

    init {
        this.Category = itemView.findViewById<TextView>(R.id.text_super_project)
        this.recyclerView = itemView.findViewById<RecyclerView>(R.id.recycler_view_super_project)
    }



    fun updateUI(station: Super_Project_Card_Info_Collector) {
        this.Category?.setText(station.getCategory().toString())
        recyclerView?.setHasFixedSize(true)
        recyclerView?.addItemDecoration(HorizontalSpaceItemDecorator(MainActivity.spacer))
        var eventdata : ProjectDataService = ProjectDataService().getInstance()
        val event_adapter = Project_Adapter(eventdata.getFeaturedStations())
        recyclerView?.adapter = event_adapter
        val layoutManager = LinearLayoutManager(itemView.context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView?.layoutManager = layoutManager
    }

    internal inner class HorizontalSpaceItemDecorator(val spacer: Int) : RecyclerView.ItemDecoration() {

        override  fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.left = spacer/2
            outRect.right = spacer/2
        }
    }
}