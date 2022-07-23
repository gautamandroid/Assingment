package com.example.ecommerce.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.databinding.ItemListBinding
import com.example.ecommerce.model.CatItem

class CatAdapter(val context: Context, val list:MutableList<CatItem> ):RecyclerView.Adapter<CatAdapter.MyViewHolder>(){

    class MyViewHolder(val binding: ItemListBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            ItemListBinding.inflate(LayoutInflater.from(context),parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var list = list[position]
        holder.binding.ivList.setImageResource(list.image)
    }

    override fun getItemCount(): Int  = list.size
}