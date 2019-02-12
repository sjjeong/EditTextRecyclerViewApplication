package com.googry.edittextrecyclerviewapplication

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.EditText

class EditTextRecycleAdapter : RecyclerView.Adapter<EditTextRecycleAdapter.ViewHolder>() {

    val items = mutableListOf<String>()

    init {
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
        items.add("")
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(parent = parent)

    override fun getItemCount() = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.etContent.setText(items[position])
    }

    override fun onViewRecycled(holder: ViewHolder) {
        super.onViewRecycled(holder)
        holder.etContent.clearFocus()
        val adapterPosition = holder.adapterPosition
        items[adapterPosition] = holder.etContent.text.toString()
        Log.e(EditTextRecycleAdapter::class.java.simpleName, "onViewRecycled $$adapterPosition:${items[adapterPosition]}")
    }

    fun showContent(): String? {
        return items.joinToString()
    }

    inner class ViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.edit_text_recycle_item, parent, false)
    ) {
        val etContent: EditText by lazy { itemView.findViewById<EditText>(R.id.et_content) }
    }
}