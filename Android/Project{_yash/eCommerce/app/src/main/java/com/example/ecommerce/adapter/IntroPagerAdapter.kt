package com.example.ecommerce.adapter

import android.content.ClipData
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.ecommerce.databinding.OnboardingBinding
import com.example.ecommerce.model.Item


class IntroPagerAdapter(val context: Context,val itemList:MutableList<Item>):PagerAdapter() {

        lateinit var binding:OnboardingBinding


    override fun getCount(): Int  = itemList.size


    override fun isViewFromObject(view:View,`object`: Any): Boolean = view ==`object`

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

  binding = OnboardingBinding.inflate(LayoutInflater.from(context),container,false)
        val list = itemList[position]
        binding.ivThumbnail.setImageResource(list.image)
        binding.tvDesc.text = list.desc
        binding.tvTitle.text = list.title
        container.addView(binding.root)
        return binding.root
    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }


}