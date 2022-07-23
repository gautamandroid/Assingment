package com.app.sqlitedatabaseexample.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gautam.databasesampple.databinding.UserLayoutBinding
import com.gautam.myapplication.modal.User

class UserAdapter(val context: Context, var uList: MutableList<User>) :
    RecyclerView.Adapter<UserAdapter.MyViewHolder>() {


    class MyViewHolder(val binding: UserLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(

            UserLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var user = uList[position]

        holder.binding.tvName.text = "${user.name}"
        holder.binding.tvEmail.text = "${user.email}"
        holder.binding.tvContact.text = "${user.contact}"

    }

    override fun getItemCount(): Int = uList.size

    fun setItems(userList:MutableList<User>)
    {
        this.uList = userList
        notifyDataSetChanged()      // refresh recyclerview list item
    }
}