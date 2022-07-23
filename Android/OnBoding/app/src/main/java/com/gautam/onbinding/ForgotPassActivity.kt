package com.gautam.onbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.EditText
import android.widget.Toast

import com.gautam.onbinding.R
import com.gautam.onbinding.Utils.Util
import com.gautam.onbinding.databinding.ActivityForgetPassBinding


class ForgotPassActivity : AppCompatActivity() {
    private lateinit var binding:ActivityForgetPassBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgetPassBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.btnReset.setOnClickListener{

         var email=binding.etEmail.text.toString().trim()

         validateForm(email)

     }

    }

    private fun validateForm(email:String)
    {
        resetFocus()


        if (!Util.isValidEmail(email)){
            setError(binding.etEmail,"enter valid emailforment")
        }else {
            var  intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    private fun resetFocus(){

        binding.etEmail.setBackgroundResource(R.drawable.et_bacgraund)
        binding.etEmail.clearFocus()
    }
    private fun setError(editText: EditText,message:String){
        editText.setBackgroundResource(R.drawable.et_bacgraund_error)
        editText.requestFocus()
        Toast.makeText(applicationContext,message,Toast.LENGTH_SHORT).show()
    }
}