package com.app.sqlitedatabaseexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.app.sqlitedatabaseexample.adapter.UserAdapter
import com.gautam.databasesampple.databinding.ActivityHomeBinding
import com.gautam.myapplication.Database.AppDatabase
import com.gautam.myapplication.UserActivity
import com.gautam.myapplication.modal.User

class HomeActivity : AppCompatActivity() {


    lateinit var binding: ActivityHomeBinding
    lateinit var adapter:UserAdapter
    private var userList = mutableListOf<User>()
    private lateinit var db: AppDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "tops").allowMainThreadQueries().build()

        initRecycler()

        binding.btnAdd.setOnClickListener {
            startActivity(Intent(this, UserActivity::class.java))
        }

    }

    private fun initRecycler() {

        adapter = UserAdapter(this, userList)
        binding.recyclerItem.layoutManager = LinearLayoutManager(this)
        binding.recyclerItem.adapter = adapter

        readData()

    }

    private fun readData() {
        userList = db.userDAO().getUserList() as MutableList<User>

        // update list
        adapter.setItems(userList)

    }
}