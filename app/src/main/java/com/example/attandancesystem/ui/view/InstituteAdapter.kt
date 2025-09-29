package com.example.attandancesystem.ui.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.attandancesystem.R
import com.example.attandancesystem.data.model.Institute

class InstituteAdapter(private var institutes: List<Institute>) :
    RecyclerView.Adapter<InstituteAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val instName: TextView = view.findViewById(R.id.txtInstName)
        val instAddress: TextView = view.findViewById(R.id.txtInstAddress)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_institute, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = institutes.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = institutes[position]
        holder.instName.text = item.instName
        holder.instAddress.text = item.address
    }

    fun updateData(newData: List<Institute>) {
        institutes = newData
        notifyDataSetChanged()
    }
}