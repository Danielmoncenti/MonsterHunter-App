package com.example.monsterhunter_companion.Filters

import android.app.Dialog
import android.content.Context
import android.os.Bundle
import com.example.monsterhunter_companion.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FiltersDialog(ctx: Context, val dialogLayout: Int, val onSuccess: (Int) -> Unit) : Dialog(ctx) {
    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(dialogLayout)

        onSuccess(1)

    }
}