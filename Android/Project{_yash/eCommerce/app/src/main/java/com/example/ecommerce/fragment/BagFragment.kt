package com.example.ecommerce.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecommerce.R
import com.example.ecommerce.databinding.FragmentBagBinding


class BagFragment : Fragment() {

    lateinit var binding:FragmentBagBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentBagBinding.inflate(layoutInflater, container, false)


        return binding.root
    }

}