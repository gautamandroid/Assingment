package com.gautam.ecomerce_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import com.gautam.ecomerce_project.R
import com.gautam.ecomerce_project.databinding.ActivityHomeBinding



class HomeActivity : AppCompatActivity(), PopupMenu.OnMenuItemClickListener{
     lateinit var binding:ActivityHomeBinding
     var PREF_PASSWORLD="my_pref"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //sharpref
        readData()
      //  binding.btnRead.setOnClickListener {
     //       readData()
       // }






     setSupportActionBar(binding.toolbar)

     /*   binding.btnPopup.setOnClickListener {
            val popup = PopupMenu(this, it).apply {
                menuInflater.inflate(R.menu.menu, menu)
                setOnMenuItemClickListener(this@HomeActivity)
                show()
            }
        }
*/

        binding.btnPopup.setOnClickListener {
            val popup = PopupMenu(this,it)
            popup.menuInflater.inflate(R.menu.menu,popup.menu)
            popup.setOnMenuItemClickListener(this)
            popup.show()

        }

    }

    private fun readData() {
        try {
            var preferences=getSharedPreferences(PREF_PASSWORLD, MODE_PRIVATE)
            var email=preferences.getString("EMAIL","")
            var password=preferences.getString("PASSWORD","password")

         //   binding.tvResult.text="password:$password \n email:$email"


        }catch (e:Exception){
            e.printStackTrace()
        }
    }


    override fun onCreateOptionsMenu(menu:Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "Item Selected : Settings", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_search -> {
                Toast.makeText(applicationContext, "Item Selected : Search", Toast.LENGTH_SHORT).show()
                true
            }
           /* R.id.action_Help -> {
                Toast.makeText( applicationContext, "Item Selected : Help", Toast.LENGTH_SHORT).show()
                true
            }*/
            R.id.action_logout -> {
                 startActivity(Intent(this,LoginActivity::class.java))
                Toast.makeText(applicationContext, "Item : logout sucessfully", Toast.LENGTH_SHORT).show()
//
                true
            }
            R.id.action_networkseting -> {
                Toast.makeText(applicationContext, "Item Selected : networkseting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_hotspot -> {
                Toast.makeText(applicationContext , "Item Selected : hotspot", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_sound
            -> {
                Toast.makeText(applicationContext, "Item Selected : sound", Toast.LENGTH_SHORT).show()
                true

            }
            else -> super.onOptionsItemSelected(item)

        }
    }

    override fun onMenuItemClick(p0: MenuItem?): Boolean {
        return when (p0?.itemId) {

            R.id.action_settings -> {
                Toast.makeText(applicationContext, "Item Selected : Settings", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_search -> {
                Toast.makeText(applicationContext, "Item Selected : Search", Toast.LENGTH_SHORT).show()
                true
            }
        /*    R.id.action_Help -> {
                Toast.makeText( applicationContext, "Item Selected : Help", Toast.LENGTH_SHORT).show()
                true
            }*/
            R.id.action_logout -> {


                startActivity(Intent(this, LoginActivity::class.java))
                Toast.makeText(applicationContext, "Item : logout sucessfully", Toast.LENGTH_SHORT).show()

                true
            }
            R.id.action_networkseting -> {
                Toast.makeText(applicationContext, "Item Selected : networkseting", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_hotspot -> {
                Toast.makeText(applicationContext, "Item Selected : hotspot", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.action_sound
            -> {
                Toast.makeText(applicationContext, "Item Selected : sound", Toast.LENGTH_SHORT).show()
                true

            }
            else -> return false

        }

    }


}