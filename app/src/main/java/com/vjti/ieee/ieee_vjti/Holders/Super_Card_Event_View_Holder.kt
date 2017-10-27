package com.vjti.ieee.ieee_vjti.Holders

import android.graphics.Rect
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Adapters.Event_Adapters
import com.vjti.ieee.ieee_vjti.Model.Super_Event_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R
import com.vjti.ieee.ieee_vjti.Services.EventDataService



/**
 * Created by mandar on 27-10-2017.
 */
class Super_Card_Event_View_Holder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    private var Category : TextView? = null
    private var recyclerView: RecyclerView? = null

    init {
        this.Category = itemView.findViewById<TextView>(R.id.text_super_event)
        this.recyclerView = itemView.findViewById<RecyclerView>(R.id.recycler_view_super_event)
    }



    fun updateUI(station: Super_Event_Card_Info_Collector) {
        this.Category?.setText(station.getCategory().toString())
        recyclerView?.setHasFixedSize(true)
        recyclerView?.addItemDecoration(HorizontalSpaceItemDecorator(40))
        var eventdata : EventDataService = EventDataService().getInstance()
        val event_adapter = Event_Adapters(eventdata.getFeaturedStations(station.getRecyclerView()))
        recyclerView?.adapter = event_adapter
        val layoutManager = LinearLayoutManager(itemView.context)
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        recyclerView?.layoutManager = layoutManager
    }

    internal inner class HorizontalSpaceItemDecorator(val spacer: Int) : RecyclerView.ItemDecoration() {

        override  fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.top = spacer
            outRect.left = spacer/2
            outRect.right = spacer/2
        }
    }
}