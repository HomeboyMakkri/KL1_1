package com.example.kl1_1

import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<MyViewHolder>() {

    private val items = ArrayList<Int>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.item_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(items[position])
        if (position % 2 == 0){
            holder.image.setBackgroundColor(Color.BLUE)
        } else {
            holder.image.setBackgroundColor(Color.RED)
        }
    }

    fun setItems(list: List<Int>) {
        items.clear()
        items.addAll(list)
        notifyItemRangeChanged(0, itemCount)
    }

    fun addItem(item: Int) {
        items.add(item)
        notifyItemInserted(items.size - 1)
    }

    fun getItems(): List<Int> {
        return items
    }
}