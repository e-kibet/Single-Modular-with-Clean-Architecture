package com.example.viewanddatabindingandroidmvvm.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.viewanddatabindingandroidmvvm.R
import com.example.viewanddatabindingandroidmvvm.databinding.FragmentViewBindingBinding

class ViewBindingFragment : Fragment() {
    private var _binding: FragmentViewBindingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentViewBindingBinding.inflate(inflater, container, false)
        val view = binding.root
        binding.continueButton.setOnClickListener{
            val developerEmail = binding.developerEmail.text.toString().trim()
            var storyPoint = binding.storyPoint.text.toString().trim()
            if(developerEmail.isBlank() || storyPoint.isBlank()){
                Toast.makeText(requireContext(), "Please enter all the fields", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(requireContext(), "Developer Email: ${developerEmail} && Story Point ${storyPoint}", Toast.LENGTH_SHORT).show()
            }
        }

        binding.remindMeLater.setOnClickListener {
            it.findNavController().navigate(R.id.dataBindingFragment)
        }
        return view
    }
}