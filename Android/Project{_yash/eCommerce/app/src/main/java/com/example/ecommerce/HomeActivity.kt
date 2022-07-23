package com.example.ecommerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.fragment.app.Fragment
import com.example.ecommerce.databinding.ActivityHomeBinding
import com.example.ecommerce.fragment.AccountFragment
import com.example.ecommerce.fragment.BagFragment
import com.example.ecommerce.fragment.CategoryFragment
import com.example.ecommerce.fragment.HomeFragment

class HomeActivity : AppCompatActivity() {

    lateinit var binding:ActivityHomeBinding
    //lateinit var toggle:ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //toggle = ActionBarDrawerToggle(this,binding.navView,R.string.open,R.string.close)

        addFragment(HomeFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            return@setOnItemSelectedListener when(it.itemId){
                R.id.home -> {
                    addFragment(HomeFragment())
                    true
                }
                R.id.categories -> {
                    addFragment(CategoryFragment())
                    true
                }
                R.id.account -> {
                    addFragment(AccountFragment())
                    true
                }
                R.id.bag -> {
                    addFragment(BagFragment())
                    true
                }
                else -> false
            }
        }

    }

    /*override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.item_menu,menu)
        return true
    }*/

  /*  override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.search-> {
                true
            } R.id.shop-> {
                Toast.makeText(this,"Notification", Toast.LENGTH_SHORT).show()
                true
            } R.id.like-> {
                Toast.makeText(this,"Like Items", Toast.LENGTH_SHORT).show()
                true
            }
            else -> return false
        }
    }*/

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()

    }

}
