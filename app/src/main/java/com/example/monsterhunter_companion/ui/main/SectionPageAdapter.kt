package com.example.monsterhunter_companion.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.monsterhunter_companion.armors.ArmorsFragment
import com.example.monsterhunter_companion.monsters.MonstersFragment
import com.example.monsterhunter_companion.weapons.WeaponsFragment
import com.google.android.material.appbar.AppBarLayout
import kotlin.IllegalStateException


class SectionPageAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val TAB_TITLES = arrayOf(
        "WEAPONS",
        "ARMORS",
        "MONSTERS"
)

    override fun getItem(position: Int): Fragment {
        return when(position){
            0 ->WeaponsFragment()
            1 ->ArmorsFragment()
            2 ->MonstersFragment()
            else -> throw IllegalStateException("There is onyl 3 tabs")
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return TAB_TITLES[position]
    }

    override fun getCount(): Int {
        return TAB_TITLES.size
    }


}