package com.gautam.onbinding.Utils

import android.icu.number.NumberFormatter
import android.util.Patterns
import java.text.DecimalFormat
import java.text.NumberFormat
import java.util.regex.Pattern
import java.util.regex.Pattern.compile

class Util {

    companion object {

        fun isValidContact(contact: String): Boolean {
            return contact.length == 10
        }

        fun isValidEmail(email: String): Boolean {
            return compile(
                "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                        "\\@" +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                        "(" +
                        "\\." +
                        "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                        ")+"
            ).matcher(email).matches() && email.isNotEmpty()
        }

        fun isValidpassword(passworld: String): Boolean {
            var regex = ("^(?=.*[0-9])"
                    + "(?=.*[a-z])(?=.*[A-Z])"
                    + "(?=.*[@#$%^&+=])"
                    + "(?=\\S+$).{8,20}$")
            return compile(regex).matcher(passworld).matches()
        }

        fun getFormattedNumber(number:Int):String{
            val formatter =DecimalFormat("00")
            return formatter.format(number)


        }
    }
 }