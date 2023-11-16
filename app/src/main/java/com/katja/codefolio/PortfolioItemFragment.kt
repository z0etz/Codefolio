package com.katja.codefolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.katja.codefolio.databinding.FragmentPortfolioItemBinding

class PortfolioItemFragment : Fragment() {

    lateinit var binding: FragmentPortfolioItemBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPortfolioItemBinding.inflate(layoutInflater, container,false)
        return binding.root
    }
}