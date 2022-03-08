package com.example.monsterhunter_companion

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.tabs.TabLayout
import androidx.viewpager.widget.ViewPager
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import com.example.monsterhunter_companion.Filters.FiltersDialog
import com.example.monsterhunter_companion.databinding.ActivityMainBinding
import com.example.monsterhunter_companion.ui.main.SectionPageAdapter
import com.example.monsterhunter_companion.ui.main.SectionPageAdapter.Companion.ARMORS_ID
import com.example.monsterhunter_companion.ui.main.SectionPageAdapter.Companion.MONSTERS_ID
import com.example.monsterhunter_companion.ui.main.SectionPageAdapter.Companion.WEAPONS_ID
import java.security.InvalidParameterException

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val sectionsPagerAdapter = SectionPageAdapter(supportFragmentManager)
        val viewPager: ViewPager = findViewById(R.id.view_pager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)


        findViewById<FloatingActionButton>(R.id.FilterWindow).setOnClickListener {
            val currentFragment = viewPager.currentItem
            val dialogLayout = when (currentFragment) {
                WEAPONS_ID -> R.layout.filter_weapons
                ARMORS_ID -> R.layout.filter_weapons
                MONSTERS_ID -> R.layout.filter_weapons
                else -> throw InvalidParameterException()
            }

            val dialog = FiltersDialog(this, dialogLayout) { filtros ->


            }


            dialog.show()
            dialog.findViewById<Button>(R.id.button).setOnClickListener {
                if (dialog.isShowing) {
                    sectionsPagerAdapter.refreshData(currentFragment)
                    dialog.dismiss()
                }
            }
        }
    }
}