package com.gautam.startactivitty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContract
import androidx.activity.result.contract.ActivityResultContracts
import com.gautam.startactivitty.databinding.ActivityFristBinding

class FristActivity : AppCompatActivity() {
    lateinit var binding:ActivityFristBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFristBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var contract=registerForActivityResult(ActivityResultContracts.StartActivityForResult(),{
               if (it.resultCode== RESULT_OK){
                   it.data?.let {
                       var name=it.getStringExtra("NAME")
                       var message=it.getStringExtra("MSG")

                       binding.textView.text="$name\n$message"


                   }
               }
        } );

        binding.btnNext.setOnClickListener {

            var intent=Intent(this,SecundindgActivity::class.java)
            intent.putExtra("NAME","welcome tops")
            contract.launch(intent)


        }
    }

  /*  override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)


        if(requestCode==100){

            data?.let {
                var name=it.getStringExtra("NAME")
                var message=it.getStringExtra("MSG")

                binding.textView.text="$name\n$message"


            }

            }
    }*/
}
