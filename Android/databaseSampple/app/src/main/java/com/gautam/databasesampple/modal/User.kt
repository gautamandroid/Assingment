package com.gautam.myapplication.modal

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/*

@Entity
 data class User (


     var id:Int,
    var name :String,
     var email:String,
      var contect:String

)*/


@Entity
/*(tableName = "")*/
data class User(
    @PrimaryKey(autoGenerate = true)
    var id:Int =0,
    @ColumnInfo(name = "user_name")
    var name:String,
    var email:String,
    var contact:String

)
