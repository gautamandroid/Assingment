package com.gautam.ecomerce_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.gautam.ecomerce_project.HomeActivity
import com.gautam.ecomerce_project.R
import com.gautam.ecomerce_project.databinding.ActivityLoginBinding

import com.gautam.onbinding.Utils.Util
import androidx.appcompat.app.AlertDialog as AlertDialog1

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    var PREF_PASSWORD = "my_pref"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /*  binding.btnLogin.setOnClickListener{
              val intent = Intent( this,HomeActivity::class.java)
              startActivity(intent)
          }*/
        binding.btnForget.setOnClickListener {
            val intent = Intent(this, ForgotPassActivity::class.java)
            startActivity(intent)

        }

        binding.btnSingup.setOnClickListener {
            val intent = Intent(this, Singupactivity::class.java)
            startActivity(intent)
        }

        binding.btnLogin.setOnClickListener {

            var email = binding.etlEmail.text.toString().trim()
            var password = binding.etPassword.text.toString().trim()

            //sharepref
            saveData(email, password)

            validateForm(email, password)

            startActivity(Intent(this, HomeActivity::class.java))

        }

    }

    private fun saveData(email: String, password: String) {

        try {
            var preferences = getSharedPreferences(PREF_PASSWORD, MODE_PRIVATE)
            var editor = preferences.edit()
            editor.putString("EMAIL", email)
            editor.putString("PASSWORD", password)
            editor.commit()
            Toast.makeText(this, "Data save successfully", Toast.LENGTH_SHORT).show()

        } catch (e: Exception) {
            e.printStackTrace()
        }

    }

    private fun validateForm(
        email: String,
        password: String

    ) {

        resetFocus()

        if (!Util.isValidEmail(email)) {
            binding.etlEmail.error = "enter valid email"
        } else if (!Util.isValidpassword(password)) {
            binding.etPassword.error = "password wrrong"
        } else {
            var intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

    private fun resetFocus() {
        binding.etlEmail.setBackgroundResource(R.drawable.et_bacgraund)
        binding.etPassword.setBackgroundResource(R.drawable.et_bacgraund)

        binding.etlEmail.clearFocus()
        binding.etPassword.clearFocus()

    }

    private fun setError(editText: EditText, message: String) {
        editText.setBackgroundResource(R.drawable.et_bacgraund_error)
        editText.requestFocus()
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }

    /*  fun OnButtonClick(view: View) {
          when(view.id){
              R.id.btn_login->{
                  showsimpledialog()
              }
          }
      }*/

    /*private fun showsimpledialog() {
       var builder=androidx.appcompat.app.AlertDialog.Builder(this)
      builder.setTitle("conformation")
      builder.setMessage("Are You Want's to Continue?")
      builder.show()

    }*/

}