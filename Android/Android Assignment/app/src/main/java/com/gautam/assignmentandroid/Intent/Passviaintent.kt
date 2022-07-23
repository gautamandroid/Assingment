package com.gautam.assignmentandroid.Intent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.ContactsContract
import androidx.appcompat.app.AppCompatActivity
import com.gautam.assignmentandroid.databinding.ActivityPassviaintentBinding


class Passviaintent : AppCompatActivity() {
    lateinit var binding:ActivityPassviaintentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityPassviaintentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCall.setOnClickListener{

            val number=binding.etNumber.text.toString()
            val intent = Intent(Intent.ACTION_DIAL)
                intent.data = Uri.parse("tel:$number")
                startActivity(intent)

        }
        binding.btnSMS.setOnClickListener {

            var number = binding.etNumber.text.toString()
            var msg = binding.etSms.text.toString()
            val sIntent = Intent(Intent.ACTION_VIEW)
            sIntent.setData(Uri.parse("sms:"+number))

            sIntent.putExtra("sms_body", msg)
            startActivity(sIntent)
        }


      binding.btnMail.setOnClickListener {
          var email=binding.etEmail.text.toString()
          val intent=Intent(Intent.ACTION_SEND)
          intent.putExtra(Intent.EXTRA_EMAIL,"gautam@gmail.com")
          intent.putExtra(Intent.EXTRA_SUBJECT,"subject")
          intent.putExtra(Intent.EXTRA_TEXT,"text")
          startActivity(intent)
      }



    }
}