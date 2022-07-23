package com.gautam.myapplication.modal

import android.os.Parcel
import android.os.Parcelable
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

):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(name)
        parcel.writeString(email)
        parcel.writeString(contact)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<User> {
        override fun createFromParcel(parcel: Parcel): User {
            return User(parcel)
        }

        override fun newArray(size: Int): Array<User?> {
            return arrayOfNulls(size)
        }
    }
}
