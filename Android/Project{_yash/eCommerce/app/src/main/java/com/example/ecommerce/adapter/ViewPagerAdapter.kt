package com.example.ecommerce.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.ecommerce.databinding.ViewPagerBinding
import com.example.ecommerce.model.ViewPagerModel
import kotlin.math.sign

class ViewPagerAdapter(var context: Context, var itemList: MutableList<ViewPagerModel>) : PagerAdapter() {

    private lateinit var binding: ViewPagerBinding

    var customPosition=0
    override fun getCount(): Int {
        return Int.MAX_VALUE
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        binding = ViewPagerBinding.inflate(LayoutInflater.from(context), container, false)

        if(customPosition>2){
            customPosition=0
        }

        var item = itemList[customPosition]
        customPosition++

        binding.ivViewPager.setImageResource(item.image)
        container.addView(binding.root)         // add every view to container
        return binding.root
    }



    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View?)
    }
}








/*
override fun getCount(): Int  = itemList.size


override fun isViewFromObject(view: View, `object`: Any): Boolean = view ==`object`

override fun instantiateItem(container: ViewGroup, position: Int): Any {

    binding = ViewPagerBinding.inflate(LayoutInflater.from(context),container,false)
    val list = itemList[position]
    binding.ivViewpager.setImageResource(list.image)
    container.addView(binding.root)
    return binding.root
}


override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
    container.removeView(`object` as View?)
}
*/
