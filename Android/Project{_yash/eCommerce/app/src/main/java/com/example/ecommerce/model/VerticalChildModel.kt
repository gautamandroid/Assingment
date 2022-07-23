package com.example.facebookrecyclerview.model

import android.os.Parcel
import android.os.Parcelable

data class VerticalChildModel(

    val image:Int,
    val name:String,
    val discount:String,
    val id:Int,
    var temp:Boolean = false
) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readByte() != 0.toByte()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(image)
        parcel.writeString(name)
        parcel.writeString(discount)
        parcel.writeInt(id)
        parcel.writeByte(if (temp) 1 else 0)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<VerticalChildModel> {
        override fun createFromParcel(parcel: Parcel): VerticalChildModel {
            return VerticalChildModel(parcel)
        }

        override fun newArray(size: Int): Array<VerticalChildModel?> {
            return arrayOfNulls(size)
        }
    }
}