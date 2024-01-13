package com.example.lesson2810

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListAdapter
import android.widget.TextView
import androidx.core.view.marginStart
import androidx.core.view.marginTop
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson2810.databinding.MessagePreviewBinding

class StringAdapter: RecyclerView.Adapter<StringAdapter.StringViewHolder>(){

    private val list = mutableListOf<String>()

    inner class StringViewHolder(
        val textView: TextView
    ): RecyclerView.ViewHolder(textView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StringViewHolder {
        val textView = TextView(parent.context)
        textView.textSize = 20F
        return StringViewHolder(textView)
    }

    override fun getItemCount(): Int =
        list.size

    override fun onBindViewHolder(holder: StringViewHolder, position: Int) {
        holder.textView.text = list[position]
    }

    fun submitList(list: List<String>) {
        with(this.list){
            clear()
            addAll(list)
        }
        notifyDataSetChanged()
    }
}



