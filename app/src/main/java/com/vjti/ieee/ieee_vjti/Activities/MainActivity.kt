package com.vjti.ieee.ieee_vjti.Activities

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.design.widget.NavigationView
import android.support.v4.app.Fragment
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.view.MotionEvent
import android.widget.Toast
import android.widget.Toolbar
import com.google.firebase.database.*
import com.vjti.ieee.ieee_vjti.Fragments.DetailsFragment
import com.vjti.ieee.ieee_vjti.Fragments.MainEventFragment
import com.vjti.ieee.ieee_vjti.Fragments.MainHomeFragment
import com.vjti.ieee.ieee_vjti.Fragments.MainProjectFragment
import com.vjti.ieee.ieee_vjti.Model.Event_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.Model.Home_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.Model.Project_Card_Info_Collector
import com.vjti.ieee.ieee_vjti.Model.Super_Event_Card_Info_Collector
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

    private var x1: Float = 0.toFloat()
    private var x2: Float = 0.toFloat()
    val MIN_DISTANCE = 150

    var firebaseDatabase : FirebaseDatabase? = null
    var databaseReference : DatabaseReference? = null

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

        MainActivity.ProjectCards?.add(Project_Card_Info_Collector("mandar sadye atharva abhyankar", "manshdjkkflpwoirutykflpwoiru\ndcndnnvnjfnvjnnv", "drawable/bicyclemusic"))
        setLayout()
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
            R.id.action_settings -> {
                val intent  = Intent(this,SettingsActivity::class.java)
                    startActivity(intent)
                    return true}

            else -> return super.onOptionsItemSelected(item)
        }
    }

    fun setLayout(){
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        fab.setOnClickListener { view ->
            /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()*/
            val intent  = Intent(this, ContactUsActivity::class.java)
            startActivity(intent)
        }

        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        mainActivity = this

        nav_view.setNavigationItemSelectedListener(this)
        navigation.setOnNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.home -> {
                // Handle the camera action
                drawer_layout.closeDrawer(GravityCompat.START)
                val manager = supportFragmentManager
                manager.beginTransaction().replace(R.id.fragment_container,MainHomeFragment()).addToBackStack(null).commit()
            }
            R.id.about -> {
                val url = "http://www.ieeevjti.com/team.html#team"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse(url))
                startActivity(intent)
            }
            R.id.blogs -> {
                val intent  = Intent(this, BlogListActivity::class.java)
                startActivity(intent)
            }
            R.id.events -> {
                drawer_layout.closeDrawer(GravityCompat.START)
                val manager = supportFragmentManager
                manager.beginTransaction().replace(R.id.fragment_container,MainEventFragment()).addToBackStack(null).commit()
            }
            R.id.library -> {
                val url = "http://www.ieeevjti.com/library.html"
                val intent = Intent(Intent.ACTION_VIEW)
                intent.setData(Uri.parse(url))
                startActivity(intent)
            }
            R.id.projects -> {
                drawer_layout.closeDrawer(GravityCompat.START)
                val manager = supportFragmentManager
                manager.beginTransaction().replace(R.id.fragment_container,MainProjectFragment()).addToBackStack(null).commit()
            }
            R.id.nav_share -> {
                try {
                    val shareAppIntent = Intent(android.content.Intent.ACTION_SEND)
                    shareAppIntent.setType("text/plain")
                    shareAppIntent.putExtra(Intent.EXTRA_SUBJECT, "\nThe official IEEE VJTI android app")
                    shareAppIntent.putExtra(Intent.EXTRA_TEXT, "link of the app")
                    startActivity(Intent.createChooser(shareAppIntent, "Share via"))
                }catch (e : Exception){
                    Toast.makeText(this, "Could not share app", Toast.LENGTH_LONG).show()
                }
            }
            R.id.nav_send -> {
                val intent  = Intent(this, ContactUsActivity::class.java)
                startActivity(intent)
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
        var spacer: Int = 30
        @JvmStatic
        var ProjectCards : ArrayList<Project_Card_Info_Collector>? = ArrayList()
        var EventCards : ArrayList<Event_Card_Info_Collector>? = ArrayList()
        var HomeCards : ArrayList<Home_Card_Info_Collector>? = ArrayList()
    }


    fun loadDetailsScreen(selectedStation: Event_Card_Info_Collector) {
        var manager = supportFragmentManager

        manager.beginTransaction()
                .replace(R.id.fragment_container,DetailsFragment())
                .addToBackStack(null)
                .commit()
    }
    fun loadDetailsScreen(selectedStation: Home_Card_Info_Collector) {
        var manager = supportFragmentManager

        manager.beginTransaction()
                .replace(R.id.fragment_container,DetailsFragment())
                .addToBackStack(null)
                .commit()
    }
    fun loadDetailsScreen(selectedStation: Project_Card_Info_Collector) {
        var manager = supportFragmentManager

        manager.beginTransaction()
                .replace(R.id.fragment_container,DetailsFragment())
                .addToBackStack(null)
                .commit()
    }
    fun loadDetailsScreen(selectedStation: Super_Event_Card_Info_Collector) {
        var manager = supportFragmentManager

        manager.beginTransaction()
                .replace(R.id.fragment_container,DetailsFragment())
                .addToBackStack(null)
                .commit()
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        when (event.action) {
            MotionEvent.ACTION_DOWN -> x1 = event.x
            MotionEvent.ACTION_UP -> {
                x2 = event.x
                val deltaX = x2 - x1
                if (Math.abs(deltaX) > 0) {
                    Toast.makeText(this, "left2right swipe", Toast.LENGTH_SHORT).show()
                } else {
                    // consider as something else - a screen tap for example
                }
            }
        }
        return super.onTouchEvent(event)
    }

    override fun setActionBar(toolbar: Toolbar?) {
        super.setActionBar(toolbar)
    }
}
