package com.example.viewanddatabindingandroidmvvm.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewanddatabindingandroidmvvm.databinding.FragmentDataBindingBinding

class DataBindingFragment : Fragment() {

    lateinit var binding: FragmentDataBindingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentDataBindingBinding.inflate(inflater, container, false)
        return  binding.root
    }
}