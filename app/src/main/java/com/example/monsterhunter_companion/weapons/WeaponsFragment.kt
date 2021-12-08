package com.example.monsterhunter_companion.weapons

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.monsterhunter_companion.R
import com.example.monsterhunter_companion.data.WeaponsList

class WeaponsFragment : Fragment()   {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =inflater.inflate(R.layout.fragment_weapons_list,container,false)

        if(view is RecyclerView){
            context?.let {

                view.adapter=WeaponsRecycleViewAdapter(it, WeaponsList)
            }?:activity?.finish()

        }
        return view
    }
}
