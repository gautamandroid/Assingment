package com.gautam.onbinding.adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gautam.ecomerce_project.databinding.ActivityRecyclerverticalBinding
import com.gautam.onbinding.modal.modal1

class  Adeptervertical  (val context: Context, val list: MutableList<modal1>):RecyclerView.Adapter<Adeptervertical.MyViewHolder>(){

    lateinit var binding: ActivityRecyclerverticalBinding

    class MyViewHolder(binding: ActivityRecyclerverticalBinding):RecyclerView.ViewHolder(binding.root){
         var bind=binding
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

              binding=ActivityRecyclerverticalBinding.inflate(LayoutInflater.from(context),parent,false)
            return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var modal1=list[position]
        holder.bind.tvTitle.text=modal1.detail
        holder.bind.tvType.text=modal1.information
        holder.bind.ivThumbnail.setImageResource(modal1.image)


    }

    override fun getItemCount(): Int {
        return list.size
    }
}