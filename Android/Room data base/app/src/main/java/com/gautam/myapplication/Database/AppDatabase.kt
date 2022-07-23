package com.gautam.myapplication.Database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.app.sqlitedatabaseexample.dao.UserDao
import com.gautam.myapplication.modal.User



@Database(entities = [User::class], version = 1)
 abstract class AppDatabase:RoomDatabase() {

     abstract fun  userDAO(): UserDao


}