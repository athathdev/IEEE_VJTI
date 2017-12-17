package com.vjti.ieee.ieee_vjti.Fragments

import android.content.Context
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Activities.MainActivity
import com.vjti.ieee.ieee_vjti.Model.Event_Card_Info_Collector

import com.vjti.ieee.ieee_vjti.R

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [EventDetailsFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [EventDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class EventDetailsFragment : Fragment() {

    // TODO: Rename and change types of parameters
    var station : Event_Card_Info_Collector? = null
    var onClickRegisterButton : String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            station = Event_Card_Info_Collector(arguments.getString("Date"), arguments.getString("Image"), arguments.getString("Discription"),
                    arguments.getString("Prize"), arguments.getString("PS"), arguments.getString("Register"),
                    arguments.getString("Venue"), MainActivity.IMG)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_event_details, container, false)
        val eventDate = view.findViewById<TextView>(R.id.event_fragment_date)
        val eventImage = view.findViewById<ImageView>(R.id.event_fragment_image)
        val eventDescription = view.findViewById<TextView>(R.id.event_fragment_description)
        val prize = view.findViewById<TextView>(R.id.event_fragment_prize)
        val problemstatement = view.findViewById<TextView>(R.id.event_fragment_ps)
        val registerButton = view.findViewById<Button>(R.id.event_fragment_register)
        val venue = view.findViewById<TextView>(R.id.event_fragment_venue)
            eventDate.text = station!!.getDate()
            eventImage.setImageBitmap(station!!.getEventImage())
            eventDescription.text = station!!.getimg()
            prize.text = station!!.getprize()
            problemstatement.text = station!!.getps()
            onClickRegisterButton = station!!.getregister()
            venue.text = station!!.getvenue()
            registerButton.setOnClickListener(onClick)
        return view
    }

    var onClick = View.OnClickListener { view ->

        //here write a code to open the page in browser
        //link is stored in variable onClickRegisterButton
    }


    companion object {
        // TODO: Rename parameter arguments, choose names that match
        // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
        private val ARG_PARAM1 = "param1"
        private val ARG_PARAM2 = "param2"

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment EventDetailsFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): EventDetailsFragment {
            val fragment = EventDetailsFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
}// Required empty public constructor
