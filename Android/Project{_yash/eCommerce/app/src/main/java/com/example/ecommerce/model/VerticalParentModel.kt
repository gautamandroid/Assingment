package com.example.facebookrecyclerview.model

import android.os.Parcel
import android.os.Parcelable


data class VerticalParentModel(
    val title:String,
    val list: MutableList<VerticalChildModel>

) : Parcelable {



    constructor(parcel: Parcel) : this(
        parcel.readString().toString(),
        parcel.createTypedArrayList(VerticalChildModel.CREATOR)!! as MutableList<VerticalChildModel>
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeTypedList(this.list)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<VerticalParentModel> {
        override fun createFromParcel(parcel: Parcel): VerticalParentModel {
            return VerticalParentModel(parcel)
        }

        override fun newArray(size: Int): Array<VerticalParentModel?> {
            return arrayOfNulls(size)
        }
    }
}