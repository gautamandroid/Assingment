package com.gautam.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.room.Room
import com.gautam.myapplication.Database.AppDatabase
import com.gautam.myapplication.databinding.ActivityUserBinding
import com.gautam.myapplication.modal.User

class UserActivity : AppCompatActivity() {
    lateinit var binding:ActivityUserBinding
    lateinit var db:AppDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db=Room.databaseBuilder(this,AppDatabase::class.java,"tops").allowMainThreadQueries().build()

        binding.btnInsert.setOnClickListener{

            var name=binding.etName.text.toString().trim()
            var email=binding.etName.text.toString().trim()
            var contact =binding.etName.text.toString().trim()

                  //Form validation
            
                insertRecourd(name,email,contact)
        }


    }

    private fun insertRecourd(name: String, email: String, contact: String) {

        var user=User(name=name,email=email, contact = contact)
        db.userDAO().insertRecord(user)

        Toast.makeText(this,"person add sucessfully",Toast.LENGTH_SHORT).show()
    }
}