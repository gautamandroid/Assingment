package com.gautam.onbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.gautam.onbinding.Fragment.*
import com.gautam.onbinding.adepter.Adepterhorizontal
import com.gautam.onbinding.adepter.Adeptervertical
import com.gautam.onbinding.databinding.ActivityMainBinding
import com.gautam.onbinding.modal.modal1
import com.gautam.onbinding.modal.modal2

class MainActivity : AppCompatActivity() {

      lateinit var binding:ActivityMainBinding
      var caluth= mutableListOf<modal2>()
      var teshert = mutableListOf<modal1>()
       lateinit var adapter:Adeptervertical
       lateinit var adapter1:Adepterhorizontal
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
           setSupportActionBar(binding.toolbar)


        addFragment(searchFragment(),"Search")
  caluth.add(modal2(R.drawable.ecomerc5,"shart","shoping of online"))
  caluth.add(modal2(R.drawable.ecomerce2,"book","writing of pepole"))
  caluth.add(modal2(R.drawable.ecomerce4,"botale","botale of good"))
  caluth.add(modal2(R.drawable.ecomerce3,"keybord","hp companiy"))
  caluth.add(modal2(R.drawable.ecomerce_1,"book","importent book"))
  caluth.add(modal2(R.drawable.ecommerce6,"power bank","toshiba companiy"))


        adapter1=Adepterhorizontal(this,caluth)
        binding.recyclerHorizontal.layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        binding.recyclerHorizontal.adapter=adapter1


        addFragment(searchFragment(),"Search")
teshert.add(modal1(R.drawable.caluth1,"t_shert","not high price"))
teshert.add(modal1(R.drawable.caluth2,"yellow","not smal price"))
teshert.add(modal1(R.drawable.caluth3,"fashion ","high renge"))
teshert.add(modal1(R.drawable.caluth4,"shert of new","not solution"))
teshert.add(modal1(R.drawable.caluth5,"high rengh","branted teshert"))


            adapter=Adeptervertical(this,teshert)
        binding.recyclerVertical.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.recyclerVertical.adapter=adapter


        binding.bottemNavigationView.setOnItemSelectedListener {
            return@setOnItemSelectedListener when(it.itemId){

                R.id.action_home->{
                       addFragment(Homefragment(),"HOME")
                       true
                }
                R.id.action_search->{
                    addFragment(searchFragment(),"Search")
                    true
                }
                R.id.action_notification->{
                    addFragment(NotificationFragment(),"Notification")
                    true
                }
                R.id.actoin_profile->{
                    addFragment(ProfileFragment(),"Profile")
                    true
                }
                R.id.action_balance->{
                    addFragment(BalanceFragment(),"Balance")
                    true
                }

                else -> false
            }
        }






    }

    private fun  addFragment(fragment:Fragment,title:String) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmwnt_contener,fragment)
            .addToBackStack(title)
            .commit()

        binding.toolbar.title=title
    }
}