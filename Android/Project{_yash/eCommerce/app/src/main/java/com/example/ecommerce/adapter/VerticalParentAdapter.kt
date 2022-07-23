package com.example.facebookrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerce.databinding.CatViewListLayoutBinding
import com.example.facebookrecyclerview.model.VerticalChildModel
import com.example.facebookrecyclerview.model.VerticalParentModel

class VerticalParentAdapter(val context: Context, val pList:MutableList<VerticalParentModel>):RecyclerView.Adapter<VerticalParentAdapter.MyViewHolder>() {


     //lateinit var listner:ItemClickListner

   /* interface ItemClickListner{

        fun onViewClicked(pos:Int,title:String)
        fun onChildViewClicked(view: View, childModel: VerticalChildModel)
    }

    fun OnItemClickListner(listner:ItemClickListner){
        this.listner = listner
    }*/

    class MyViewHolder(val binding:CatViewListLayoutBinding):RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       return MyViewHolder(
           CatViewListLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
       )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var list = pList[position]

        holder.binding.tvCat.setText(list.title)

        var adapter = VerticalChildAdapter(context,list.list)
        holder.binding.rcvCat.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        holder.binding.rcvCat.adapter = adapter

       /* holder.binding.btnViewAll.setOnClickListener {

            listner.onViewClicked(position,list.title)

        }*/

    }

    override fun getItemCount(): Int  = pList.size


}