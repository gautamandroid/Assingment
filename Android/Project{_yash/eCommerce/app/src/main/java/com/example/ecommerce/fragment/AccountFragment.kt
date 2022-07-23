package com.example.ecommerce.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager.TAG
import com.example.ecommerce.R
import com.example.ecommerce.databinding.FragmentAccountBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class AccountFragment : Fragment() {


lateinit var binding:FragmentAccountBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding  = FragmentAccountBinding.inflate(layoutInflater, container, false)


     /*   binding.btnLogin.setOnClickListener{
                BottomSheetDialogFragment().apply {
                    show(requireContext().,tag)
                }

        }*/



        return binding.root
    }


}