package com.gautam.onbinding.adepter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.gautam.ecomerce_project.databinding.ActivityOnbindingextraBinding
import com.gautam.onbinding.modal.iteam

class Adepteronboarding(var context: Context,var iteams:MutableList<iteam>): PagerAdapter() {

    lateinit var binding: ActivityOnbindingextraBinding

    override fun getCount(): Int {
        return iteams.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`

    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
      binding= ActivityOnbindingextraBinding.inflate(LayoutInflater.from(context),container,false)


      var iteams=iteams[position]

        binding.tvDetail.text=iteams.detail
        binding.tvTital.text=iteams.titale
        binding.tvThumball.setImageResource(iteams.image)
        container.addView(binding.root)
        return binding.root




    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }

}