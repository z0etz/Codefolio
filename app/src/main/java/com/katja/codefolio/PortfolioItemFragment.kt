package com.katja.codefolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.katja.codefolio.databinding.FragmentPortfolioItemBinding

class PortfolioItemFragment : Fragment() {

    lateinit var binding: FragmentPortfolioItemBinding
    lateinit var rvImages: RecyclerView
    lateinit var portfolioItemAdapter: PortfolioItemImageAdapter
    lateinit var portfolioItem: PortfolioItem
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPortfolioItemBinding.inflate(layoutInflater, container, false)
        val args = arguments
        portfolioItem = args?.getSerializable("portfolioItem") as PortfolioItem

        binding.itemTitle.text = portfolioItem.title
        binding.itemDescription.text = portfolioItem.description

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(requireContext())
        rvImages = binding.rvPortfolioItems
        rvImages.layoutManager = layoutManager

        val imagesList = portfolioItem.imagesSrc

        // Initialize the adapter with the portfolio list
        portfolioItemAdapter = PortfolioItemImageAdapter(imagesList)

        // Set the adapter to the RecyclerView
        rvImages.adapter = portfolioItemAdapter
    }
}