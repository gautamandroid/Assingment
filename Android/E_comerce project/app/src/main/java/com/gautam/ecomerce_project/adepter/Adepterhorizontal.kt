package com.gautam.onbinding.adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gautam.ecomerce_project.databinding.ActivityHorizontalBinding
import com.gautam.onbinding.modal.modal2

class Adepterhorizontal (val context: Context,val list: MutableList<modal2>):RecyclerView.Adapter<Adepterhorizontal.MyViewholder>() {

    lateinit var binding: ActivityHorizontalBinding

    class MyViewholder(binding: ActivityHorizontalBinding) : RecyclerView.ViewHolder(binding.root) {
        var bind = binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewholder {
            binding=ActivityHorizontalBinding.inflate(LayoutInflater.from(context),parent,false)
          return MyViewholder(binding)

    }

    override fun onBindViewHolder(holder: MyViewholder, position: Int) {

         var modal2=list[position]
        holder.bind.bookWorldpower.text=modal2.detail
        holder.bind.tvReding.text=modal2.detail
        holder.bind.ivImage.setImageResource(modal2.image)


    }

    override fun getItemCount(): Int {
        return list.size
    }
}