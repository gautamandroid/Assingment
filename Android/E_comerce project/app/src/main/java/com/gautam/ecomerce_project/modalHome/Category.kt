package com.gautam.onbinding.modalHome

import android.icu.text.CaseMap

data class Category (

              var id:Int,
              var title:String,
              var Iteamlist:MutableList<Subcategory>
        )