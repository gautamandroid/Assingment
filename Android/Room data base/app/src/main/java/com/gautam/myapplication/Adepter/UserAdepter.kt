package com.app.sqlitedatabaseexample.adapter

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.gautam.myapplication.Database.AppDatabase
import com.gautam.myapplication.UserActivity
import com.gautam.myapplication.databinding.UserLayoutBinding
import com.gautam.myapplication.modal.User

class UserAdepter(val context: Context, var uList: MutableList<User>) : RecyclerView.Adapter<UserAdepter.MyViewHolder>() {

    lateinit var database: AppDatabase
    class MyViewHolder(val binding: UserLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(
            UserLayoutBinding.inflate(LayoutInflater.from(context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        database = Room.databaseBuilder(context, AppDatabase::class.java, "tops").allowMainThreadQueries().build()

        var user = uList[position]
        holder.binding.moreButton.setOnClickListener {
            val builder = AlertDialog.Builder(context)
            builder.setTitle("Confirm")
            builder.setMessage("Selected Record will be deleted, confirm ? ")

            builder.setPositiveButton("Yes") { dialog, which ->
                database.userDAO().deleteUser(uList[position])
                notifyItemRemoved(position)
                uList.remove(uList[position])
            }.setNegativeButton("no",DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })
            builder.show()
        }
        holder.binding.tvName.text = "${user.name}"
        holder.binding.tvEmail.text = "${user.email}"
        holder.binding.tvContact.text = "${user.contact}"

        holder.binding.iteamParent.setOnClickListener {
            var intent=Intent(context,UserActivity::class.java)
            intent.putExtra("USER",user)
            context.startActivity(intent)

        }

    }

    override fun getItemCount(): Int = uList.size

    fun setItems(userList: MutableList<User>) {
        this.uList = userList
        notifyDataSetChanged()      // refresh recyclerview list item
    }
}