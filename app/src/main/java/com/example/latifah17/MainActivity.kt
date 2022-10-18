package com.example.latifah17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tab = findViewById<TabLayout>(R.id.tabLayout)
        var fragment : Fragment =PPLGFragment()

        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

        tab.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?){
                when(tab!!.position) {
                    0 -> fragment = PPLGFragment()
                    1 -> fragment = TPFLFragment()
                    2 -> fragment = TOFragment()
                    3 -> fragment = BUSANAFragment()
                    4 -> fragment = KULINERFragment()

                }

                val fT = supportFragmentManager.beginTransaction()
                fT.replace(R.id.frameLayout, fragment)
                fT.commit()
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
    }
}