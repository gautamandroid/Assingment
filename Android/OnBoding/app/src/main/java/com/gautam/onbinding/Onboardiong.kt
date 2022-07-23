package com.gautam.onbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.viewpager.widget.ViewPager
import com.gautam.onbinding.adepter.Adepteronboarding
import com.gautam.onbinding.databinding.ActivityOnboardiongBinding
import com.gautam.onbinding.modal.iteam

class Onboardiong : AppCompatActivity() {
    private lateinit var binding:ActivityOnboardiongBinding
    private var iteams= mutableListOf<iteam>()
    private lateinit var adapter:Adepteronboarding
    private var index =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityOnboardiongBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iteams.add(iteam(R.drawable.img0,"E-commerce of online shoping","purchase"))
        iteams.add(iteam(R.drawable.img_1,"purchasing of online shoping","payment"))
        iteams.add(iteam(R.drawable.img_2,"time to time delivery","delivers"))

        adapter=Adepteronboarding(this,iteams)
        binding.viewPager.adapter=adapter
        binding.btnRight.setImageResource(R.drawable.ic_baseline_arrow_forward_ios_24)
        binding.btnLeft.setImageResource(R.drawable.ic_baseline_arrow_back_ios_24)

        if(binding.viewPager.currentItem==0)
            binding.btnLeft.visibility=View.INVISIBLE

        binding.viewPager.addOnPageChangeListener(object:ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                if (position==0){
                    binding.btnLeft.visibility=View.INVISIBLE
                }else{
                    binding.btnLeft.visibility=View.VISIBLE
                }
                if (position==adapter.count-1){
//                    binding.btnRight.visibility=View.INVISIBLE
                }else{
                    binding.btnRight.visibility=View.VISIBLE
                }
            }

            override fun onPageSelected(position: Int) {
                if (index==0){
                    binding.btnLeft.visibility=View.INVISIBLE
                }else{
                    binding.btnLeft.visibility=View.VISIBLE
                }
                if (position==adapter.count-1){
//                    binding.btnRight.visibility=View.INVISIBLE
                }else{
                    binding.btnRight.visibility=View.VISIBLE
                }
            }

            override fun onPageScrollStateChanged(state: Int) {}

        })



        binding.btinSkip.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
       binding.btnLeft.setOnClickListener{
           if (index>0)
           {
               index--
               binding.viewPager.currentItem=index
           }
       }
         binding.btnRight.setOnClickListener{

           if (index<adapter.count-1)
           {
               index++
               binding.viewPager.currentItem=index
           }else{
               startActivity(Intent(this,LoginActivity::class.java))

               finish()
           }
       }
    }
}