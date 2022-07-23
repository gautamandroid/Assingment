package com.example.ecommerce.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerce.R
import com.example.ecommerce.adapter.CatAdapter
import com.example.ecommerce.databinding.FragmentCategoryBinding
import com.example.ecommerce.model.CatItem

class CategoryFragment : Fragment() {

    lateinit var binding:FragmentCategoryBinding
    lateinit var adapter:CatAdapter
    var list = mutableListOf<CatItem>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =FragmentCategoryBinding.inflate(layoutInflater, container, false)

        list.add(CatItem(R.drawable.menn))
        list.add(CatItem(R.drawable.womenn))
        list.add(CatItem(R.drawable.beautyy))
        list.add(CatItem(R.drawable.stylec))
        list.add(CatItem(R.drawable.homee))
        list.add(CatItem(R.drawable.kidss))

        adapter = CatAdapter(requireContext(),list)
        binding.rcvCat.layoutManager = LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
        binding.rcvCat.adapter = adapter
        return binding.root
    }

}