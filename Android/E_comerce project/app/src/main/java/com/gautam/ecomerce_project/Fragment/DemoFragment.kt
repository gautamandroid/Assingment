package com.gautam.ecomerce_project.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gautam.ecomerce_project.R
import com.gautam.ecomerce_project.databinding.FragmentDemoBinding


class DemoFragment : Fragment() {

lateinit var binding:FragmentDemoBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDemoBinding.inflate(layoutInflater, container, false)



        return binding.root
    }


}