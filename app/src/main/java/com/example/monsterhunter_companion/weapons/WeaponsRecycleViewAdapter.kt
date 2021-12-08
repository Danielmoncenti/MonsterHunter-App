package com.example.monsterhunter_companion.weapons

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.monsterhunter_companion.data.Weapons
import com.example.monsterhunter_companion.R
import com.example.monsterhunter_companion.WeaponInfoActivity

class WeaponsRecycleViewAdapter(val context: Context, private val weapons: List<Weapons>) :
    RecyclerView.Adapter<WeaponsRecycleViewAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_weapons, parent, false)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val weapon = weapons[position]


        holder.name.text =weapon.name
        holder.rarity.text = weapon.rarity
        holder.damage.text = weapon.damage.toString()
        holder.elemental_damage.text = weapon.elementDamage.toString()


        holder.itemView.setOnClickListener {
            val intent = Intent(this.context,WeaponInfoActivity()::class.java)
            intent.putExtra("name",weapon.name)
            intent.putExtra("type",weapon.type)
            intent.putExtra("damage",weapon.damage.toString())
            intent.putExtra("elemental_damage",weapon.elementDamage.toString())
            intent.putExtra("affinity", weapon.affinity)
            intent.putExtra("rarity", weapon.rarity)
            intent.putExtra("materials", weapon.materials)
            this.context.startActivity(intent)
        }
    }


    override fun getItemCount(): Int=weapons.size

    inner class ViewHolder(view: View) :RecyclerView.ViewHolder(view){

        val name : TextView = view.findViewById(R.id.weapon_name)
        val rarity : TextView = view.findViewById(R.id.weapon_rarity)
        val damage: TextView = view.findViewById(R.id.weapon_damage)
        val elemental_damage: TextView = view.findViewById(R.id.weapon_element_damage)




    }

}