package com.gautam.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import com.gautam.myapplication.Database.AppDatabase
import com.gautam.myapplication.databinding.ActivityUserBinding
import com.gautam.myapplication.modal.User
import java.util.regex.Pattern

class UserActivity : AppCompatActivity() {
    lateinit var binding: ActivityUserBinding
    lateinit var db: AppDatabase
    var user: User? = null


    private fun ValidEmail(email: String): Boolean {

        val EMAIL_ADDRESS_PATTERN = Pattern.compile(
            "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                    "\\@" +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                    "(" +
                    "\\." +
                    "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                    ")+"
        )
        return EMAIL_ADDRESS_PATTERN.matcher(email).matches()
    }

    private fun ValidContact(contact: String): Boolean {
        val PHONE_NUMBER = Pattern.compile(
            "^[+]?[0-9]{10,13}\$"
        )
        return PHONE_NUMBER.matcher(contact).matches()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        user = intent.getParcelableExtra("USER")

        if (user != null) {
            binding.etName.setText(user!!.name)
            binding.etEmail.setText(user!!.email)
            binding.etContact.setText(user!!.contact)
            binding.btnInsert.text = "Update"
        }


        db = Room.databaseBuilder(applicationContext, AppDatabase::class.java, "tops")
            .allowMainThreadQueries()
            .build()

        binding.btnInsert.setOnClickListener {

            var name = binding.etName.text.toString().trim()
            var email = binding.etEmail.text.toString().trim()
            var contact = binding.etContact.text.toString().trim()


            if (!ValidEmail(email) && !ValidContact(contact)) {
                Toast.makeText(applicationContext, "please enter valid input", Toast.LENGTH_SHORT).show()
            }
            else{
                if (user == null)
                    insertRecourd(name, email, contact)
                else
                    updateRecord(name, email, contact)

                startActivity(Intent(this, HomeActivity::class.java))
                finish()
            }
        }
        binding.btnCancel.setOnClickListener {
            finish()
        }
    }

    private fun updateRecord(name: String, email: String, contact: String) {

        user?.apply {
            this.name = name
            this.email = email
            this.contact = contact
        }
        user?.let { db.userDAO().updateUser(it) }
        Toast.makeText(this, "Record updated", Toast.LENGTH_SHORT).show()
    }

    private fun insertRecourd(name: String, email: String, contact: String) {
        var user = User(name = name, email = email, contact = contact)
        db.userDAO().insertRecord(user)
        Toast.makeText(this, "person add sucessfully", Toast.LENGTH_SHORT).show()
    }
}