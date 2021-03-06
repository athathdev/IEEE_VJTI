package com.vjti.ieee.ieee_vjti.Fragments

import android.content.Context
import android.graphics.Rect
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vjti.ieee.ieee_vjti.Activities.MainActivity
import com.vjti.ieee.ieee_vjti.Adapters.Super_Project_Adapter
import com.vjti.ieee.ieee_vjti.R
import com.vjti.ieee.ieee_vjti.Services.SuperProjectDataService

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [MainProjectFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [MainProjectFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainProjectFragment : Fragment() {

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null

    private var mListener: OnMainProjectFragmentInteractionListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (arguments != null) {
            mParam1 = arguments.getString(ARG_PARAM1)
            mParam2 = arguments.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_main_project, container, false)
        val recyclerView = view.findViewById<RecyclerView>(R.id.content_project_recycler_super)
        recyclerView.setHasFixedSize(true)
        recyclerView.addItemDecoration(HorizontalSpaceItemDecorator(MainActivity.spacer))
        var projectdata : SuperProjectDataService = SuperProjectDataService().getInstance()
        val project_adapter = Super_Project_Adapter(projectdata.getFeaturedCategories())
        recyclerView.adapter = project_adapter
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
        //MainActivity.mainActivity!!.actionBar.setTitle("PROJECTS")
        return view
    }

    // TODO: Rename method, update argument and hook method into UI event
    fun onButtonPressed(uri: Uri) {
        if (mListener != null) {
            mListener!!.onMainProjectFragmentInteraction(uri)
        }
    }

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        if (context is OnMainProjectFragmentInteractionListener) {
            mListener = context
        } else {
            throw RuntimeException(context!!.toString() + " must implement OnFragmentInteractionListener")
        }
    }

    override fun onDetach() {
        super.onDetach()
        mListener = null
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     *
     *
     * See the Android Training lesson [Communicating with Other Fragments](http://developer.android.com/training/basics/fragments/communicating.html) for more information.
     */
    interface OnMainProjectFragmentInteractionListener {
        // TODO: Update argument type and name
        fun onMainProjectFragmentInteraction(uri: Uri)
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
         * @return A new instance of fragment MainProjectFragment.
         */
        // TODO: Rename and change types and number of parameters
        fun newInstance(param1: String, param2: String): MainProjectFragment {
            val fragment = MainProjectFragment()
            val args = Bundle()
            args.putString(ARG_PARAM1, param1)
            args.putString(ARG_PARAM2, param2)
            fragment.arguments = args
            return fragment
        }
    }
    internal inner class HorizontalSpaceItemDecorator(val spacer: Int) : RecyclerView.ItemDecoration() {

        override  fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
            super.getItemOffsets(outRect, view, parent, state)
            outRect.top = spacer/2
            outRect.bottom = spacer/2
        }
    }
}// Required empty public constructor
