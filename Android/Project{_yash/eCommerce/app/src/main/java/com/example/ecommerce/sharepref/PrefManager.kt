package com.example.ecommerce.sharepref

import android.content.Context
import android.content.SharedPreferences

class PrefManager(context:Context) {

    var PREF_NAME="my-Pref"
    val KEY_STATUS="isLogin"
    val KEY_INTRO = "isIntro"

    var sharePref:SharedPreferences = context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE)
    var editor:SharedPreferences.Editor=  sharePref.edit()


    fun setLoginStatus(status:Boolean){
        editor.putBoolean(KEY_STATUS,status)
        editor.commit()
    }

    fun getLoginStatus():Boolean{
        return sharePref.getBoolean(KEY_STATUS,false)
    }

    fun setIntroStatus(status: Boolean){
        editor.putBoolean(KEY_INTRO, status)
        editor.commit()
    }

    fun getIntroStatus(): Boolean{
        return sharePref.getBoolean(KEY_INTRO, false)
    }

    fun logout(){
        editor.remove(KEY_STATUS)
        editor.commit()
    }
}