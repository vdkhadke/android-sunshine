//package com.example.android.sunshine.app
//
//import android.support.v7.app.ActionBarActivity
//import android.support.v4.app.Fragment
//import android.os.Bundle
//import android.view.LayoutInflater
//import android.view.Menu
//import android.view.MenuItem
//import android.view.View
//import android.view.ViewGroup
//import android.widget.Button
//import android.widget.Toast
//
//
//class MainActivity : ActionBarActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        if (savedInstanceState == null) {
//            supportFragmentManager.beginTransaction()
//                    .add(R.id.container, ForecastFragment())
//                    .commit()
//        }
//    }
//
//    private fun rollDice(){
//        Toast.makeText(this, "Roll button clicked " + Math.random()%6,
//                Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.main, menu)
//        return true
//    }
//
//    override fun onOptionsItemSelected(item: MenuItem): Boolean {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        val id = item.itemId
//
//
//        return if (id == R.id.action_settings) {
//            true
//        } else super.onOptionsItemSelected(item)
//
//    }
//
//    /**
//     * A placeholder fragment containing a simple view.
//     */
//    class ForecastFragment : Fragment() {
//
//        override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
//                                  savedInstanceState: Bundle?): View {
//            return inflater!!.inflate(R.layout.fragment_main, container, false)
//        }
//    }
//}
// URL: https://api.openweathermap.org/data/2.5/forecast?zip=94040,us&mode=json&units=metric&cnt=7