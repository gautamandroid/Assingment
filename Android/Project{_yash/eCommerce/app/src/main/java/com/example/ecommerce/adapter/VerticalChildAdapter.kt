package com.example.facebookrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.databinding.ChildLayoutBinding
import com.example.facebookrecyclerview.model.VerticalChildModel

//var listner:VerticalParentAdapter.ItemClickListner
class VerticalChildAdapter(val context: Context,val cList:MutableList<VerticalChildModel>):RecyclerView.Adapter<VerticalChildAdapter.MyViewHolder>() {


    class MyViewHolder(val binding:ChildLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

       return MyViewHolder(
           ChildLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
       )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var list = cList[position]
        holder.binding.ivItem.setImageResource(list.image)
        holder.binding.tvName.text = list.name
        holder.binding.tvDiscount.text = list.discount

        holder.binding.ll.setOnClickListener{
            Toast.makeText(context, "layout clicked", Toast.LENGTH_SHORT).show()
        }
/*
        holder.binding.card.setOnClickListener {
            listner.onChildViewClicked(it,list)
        }*/
    }

    override fun getItemCount(): Int  = cList.size


}