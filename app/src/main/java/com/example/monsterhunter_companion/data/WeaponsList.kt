package com.example.monsterhunter_companion.data

import com.example.monsterhunter_companion.R

object WeaponsList : ArrayList<Weapons>() {



    init {
        add(
            Weapons(
                "Espada1",
                "espada_y_escudo",
                50,
                "Fuego",
                20,
                "10%",
                "Rareza 1",
                "Gran Jaggi",
                R.drawable.espada_y_escudo
            )
        )
        add(
            Weapons(
                "Espada2",
                "espada_y_escudo",
                60, "Fuego",
                30,
                "20%", "Rareza 2",
                "Kirin",
                R.drawable.espada_y_escudo
            )
        )
        add(
            Weapons(
                "Gran Espada1",
                "Gran Espada",
                200,
                "Hielo",
                50,
                "-5%",
                "Rareza 1",
                "Gran Jagrass",
                R.drawable.espada_y_escudo
            )
        )
    }

}