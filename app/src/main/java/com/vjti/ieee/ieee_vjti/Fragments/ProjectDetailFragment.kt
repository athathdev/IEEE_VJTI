package com.vjti.ieee.ieee_vjti.Fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.vjti.ieee.ieee_vjti.Activities.MainActivity

import com.vjti.ieee.ieee_vjti.R


/**
 * A simple [Fragment] subclass.
 * Use the [ProjectDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ProjectDetailFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val itemView = inflater!!.inflate(R.layout.fragment_project_detail, container, false)
        var Title = itemView.findViewById<TextView>(R.id.project_title)
        var Discription = itemView.findViewById<TextView>(R.id.project_discription)
        var station = MainActivity.projectpassthrough
        var memberTextList : ArrayList<TextView>? = ArrayList()
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text01))
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text02))
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text03))
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text04))
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text05))
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text06))
        memberTextList?.add(itemView.findViewById<TextView>(R.id.text07))
        Title?.setText(station!!.getTitle())
        Discription?.setText(station!!.getText())
        var localMemberList :ArrayList<String>? = station!!.getmembers()
        var i = 0;
        while(i<localMemberList!!.size){
            memberTextList!![i].text = "${i+1} ${localMemberList[i]}"
            i++
        }
        while(i<7){
            memberTextList!![i].text = ""
            i++
        }
        return itemView
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
         * @return A new instance of fragment ProjectDetailFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): ProjectDetailFragment {
            val fragment = ProjectDetailFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }

}// Required empty public constructor
