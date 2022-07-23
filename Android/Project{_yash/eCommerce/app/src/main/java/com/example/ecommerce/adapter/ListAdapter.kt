package com.example.ecommerce.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.databinding.ListLayoutBinding
import com.example.ecommerce.model.ListItem

class ListAdapter(val context: Context, val list:MutableList<ListItem> ):RecyclerView.Adapter<ListAdapter.MyViewHolder>(){

    class MyViewHolder(val binding: ListLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        return MyViewHolder(
            ListLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var list = list[position]
        holder.binding.ivList.setImageResource(list.image)
        holder.binding.tvName.text = list.title
    }

    override fun getItemCount(): Int  = list.size



}