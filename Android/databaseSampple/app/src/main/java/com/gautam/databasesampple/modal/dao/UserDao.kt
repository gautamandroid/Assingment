package com.app.sqlitedatabaseexample.dao

import androidx.room.*

import com.gautam.myapplication.modal.User

@Dao
interface UserDao {

    @Insert
    fun insertRecord(user:User)

    @Query("select * from User")
    fun getUserList() : List<User>

    @Query("select * from User where id =:uid")
    fun getUser(uid:Int) : User

    @Delete
    fun deleteUser(user:User)

    @Update
    fun updateUser(user: User)

}