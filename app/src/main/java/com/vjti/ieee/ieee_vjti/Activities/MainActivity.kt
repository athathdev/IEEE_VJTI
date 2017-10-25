package com.vjti.ieee.ieee_vjti.Activities

import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.design.widget.Snackbar
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.vjti.ieee.ieee_vjti.Fragments.DetailsFragment
import com.vjti.ieee.ieee_vjti.Fragments.MainEventFragment
import com.vjti.ieee.ieee_vjti.Fragments.MainHomeFragment
import com.vjti.ieee.ieee_vjti.Fragments.MainProjectFragment
import com.vjti.ieee.ieee_vjti.Model.Card_Info_Collector
import com.vjti.ieee.ieee_vjti.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_main.*
import kotlinx.android.synthetic.main.content_main.*




class MainActivity : AppCompatActivity()
        ,NavigationView.OnNavigationItemSelectedListener
        ,BottomNavigationView.OnNavigationItemSelectedListener
        ,MainHomeFragment.OnMainHomeFragmentInteractionListener
        ,MainEventFragment.OnMainEventFragmentInteractionListener
        ,MainProjectFragment.OnMainProjectFragmentInteractionListener
        ,DetailsFragment.OnDetailsFragmentInteractionListener{

    override fun onDetailsFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMainHomeFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMainEventFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onMainProjectFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        mainActivity = this

        nav_view.setNavigationItemSelectedListener(this)
        navigation.setOnNavigationItemSelectedListener(this)

        val manager = supportFragmentManager
        var fragment : Fragment? = manager.findFragmentById(R.id.fragment_container)
        if (fragment == null){
            var fragment = MainHomeFragment()
            manager.beginTransaction().add(R.id.fragment_container,fragment).commit()
        }
    }

    override fun onBackPressed() {
        if (drawer_layout.isDrawerOpen(GravityCompat.START)) {
            drawer_layout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        when (item.itemId) {
            R.id.action_settings -> return true
            else -> return super.onOptionsItemSelected(item)
        }
    }



    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_camera -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_manage -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
            R.id.menu_home -> {
                val manager = supportFragmentManager
                manager.beginTransaction().replace(R.id.fragment_container,MainHomeFragment()).addToBackStack(null).commit()
            }
            R.id.menu_event -> {
                val manager = supportFragmentManager
                manager.beginTransaction().replace(R.id.fragment_container,MainEventFragment()).addToBackStack(null).commit()
            }
            R.id.menu_projects -> {
                val manager = supportFragmentManager
                manager.beginTransaction().replace(R.id.fragment_container,MainProjectFragment()).addToBackStack(null).commit()

            }
        }

        drawer_layout.closeDrawer(GravityCompat.START)
        return true
    }

    companion object {
        var mainActivity: MainActivity? = null

    }

    fun loadDetailsScreen(selectedStation: Card_Info_Collector) {
        var manager = supportFragmentManager

        manager.beginTransaction()
                .replace(R.id.fragment_container,DetailsFragment())
                .addToBackStack(null)
                .commit()
    }


}