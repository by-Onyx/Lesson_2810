package com.example.lesson2810.presenter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson2810.data.MsgPreview
import com.example.lesson2810.databinding.MessagePreviewBinding

class MsgAdapter(
    private val onMsgItemClick: (List<String>) -> Unit
): RecyclerView.Adapter<MsgAdapter.MsgViewHolder>() {
    private val list = mutableListOf<MsgPreview>()

    inner class MsgViewHolder(
        private val binding: MessagePreviewBinding,
        private val onMsgItemClick: (List<String>) -> Unit
    ): RecyclerView.ViewHolder(binding.root) {
        fun bind(data: MsgPreview) = with(binding){
            messageSender.text = data.sender
            messageBody.text = data.lastMsg
            binding.root.setOnClickListener {
                onMsgItemClick(data.msges)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MsgViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MessagePreviewBinding.inflate(inflater, parent, false)
        return MsgViewHolder(binding, onMsgItemClick)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: MsgViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun submitList(list: List<MsgPreview>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }
}