package com.gautam.startactivitty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gautam.startactivitty.databinding.ActivitySecundingActivityBinding

class SecundindgActivity : AppCompatActivity() {
  lateinit var binding: ActivitySecundingActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySecundingActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


         var name =intent.getStringExtra("NAME")
        binding.etName.setText(name)

        binding.btnSubmit.setOnClickListener {

            var name=binding.etName.text.toString().trim()
            var message=binding.etMessage.text.toString().trim()

            var intent=Intent()
            intent.putExtra("NAME",name)
            intent.putExtra("MSG",message)


            setResult(RESULT_OK,intent)
            onBackPressed()

        }

    }
}