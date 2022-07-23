package com.example.ecommerce.fragment

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerce.R
import com.example.ecommerce.adapter.ListAdapter
import com.example.ecommerce.adapter.ViewPagerAdapter
import com.example.ecommerce.databinding.FragmentHomeBinding
import com.example.ecommerce.model.ListItem
import com.example.ecommerce.model.ViewPagerModel
import com.example.facebookrecyclerview.adapter.VerticalParentAdapter
import com.example.facebookrecyclerview.model.VerticalChildModel
import com.example.facebookrecyclerview.model.VerticalParentModel
import java.util.*


class HomeFragment : Fragment() {

    lateinit var binding:FragmentHomeBinding
    lateinit var listAdapter:ListAdapter
    lateinit var viewAdapter:ViewPagerAdapter
    lateinit var viewAllListAdapter:VerticalParentAdapter
    lateinit var timer: Timer

    var listItem  = mutableListOf<ListItem>()
    var imageSliderItem  = mutableListOf<ViewPagerModel>()
    var catPList  = mutableListOf<VerticalParentModel>()
    var catCList  = mutableListOf<VerticalChildModel>()
    var pos = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        listData()
        listAdapter = ListAdapter(requireContext(),listItem)
        binding.rcvList.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.HORIZONTAL,false)
        binding.rcvList.adapter = listAdapter

        viewPagerData()
        viewAdapter = ViewPagerAdapter(requireContext(),imageSliderItem)
        binding.viewPager.adapter = viewAdapter
        createSlideShow()

        data()
        viewAllListAdapter = VerticalParentAdapter(requireContext(),catPList)
        binding.rvCat.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.rvCat.adapter = viewAllListAdapter
        return binding.root
    }


    private fun listData() {
        listItem.add(ListItem("Accessories",R.drawable.accessories1))
        listItem.add(ListItem("Beauty",R.drawable.beauty))
        listItem.add(ListItem("Footwear",R.drawable.footwear))
        listItem.add(ListItem("Home & Lives",R.drawable.home1))
        listItem.add(ListItem("Jewellery",R.drawable.jewellery))
        listItem.add(ListItem("Kid",R.drawable.kid))
        listItem.add(ListItem("Men",R.drawable.men))
        listItem.add(ListItem("Style",R.drawable.style))
        listItem.add(ListItem("Women",R.drawable.women))
    }

    fun data(){
        catCList.add(VerticalChildModel(R.drawable.ts1,"Men Top Wear","From $3",0,false))
        catCList.add(VerticalChildModel(R.drawable.ts2,"Electronics","From $2",1,false))
        catPList.add((VerticalParentModel("Top-Selling",catCList)))

        catCList.add(VerticalChildModel(R.drawable.td1,"Footwear","From $3",0,false))
        catCList.add(VerticalChildModel(R.drawable.td2,"Electronics","From $2",1,false))
        catPList.add((VerticalParentModel("Top-Demand",catCList)))

        catCList.add(VerticalChildModel(R.drawable.tn1,"Summer Wear","From $3",0,false))
        catCList.add(VerticalChildModel(R.drawable.tn2,"Festival Collection","From $2",1,false))
        catPList.add((VerticalParentModel("Trending Now",catCList)))
    }
    private fun viewPagerData(){

        imageSliderItem.add(ViewPagerModel(R.drawable.view1))
        imageSliderItem.add(ViewPagerModel(R.drawable.view2))
        imageSliderItem.add(ViewPagerModel(R.drawable.view3))
        imageSliderItem.add(ViewPagerModel(R.drawable.view4))
    }

    //auto slider
    fun createSlideShow() {
        var handler = Handler()
        var run = Runnable {
            if (pos == viewAdapter.count) {
                pos = 0
                binding.viewPager.setCurrentItem(pos++, true)
            }else{
                binding.viewPager.setCurrentItem(pos++, true)
            }
        }
        timer = Timer()
        timer.schedule(object : TimerTask() {
            override fun run() {
                handler.post(run)
            }

        }, 250, 2500)
    }

}