package com.example.kl1_1

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val image = view.findViewById<ImageView>(R.id.image_view)
    val text = view.findViewById<TextView>(R.id.text_1)

    fun bind(number: Int) {
        text.text = "$number"
    }

}