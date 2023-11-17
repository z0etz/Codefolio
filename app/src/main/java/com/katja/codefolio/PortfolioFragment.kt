package com.katja.codefolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.katja.codefolio.databinding.FragmentPortfolioBinding


class PortfolioFragment: Fragment() {

    lateinit var binding: FragmentPortfolioBinding
    lateinit var rvPortfolio: RecyclerView
    lateinit var portfolioAdapter: PortfolioAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPortfolioBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = GridLayoutManager(requireContext(), 3)
        rvPortfolio = binding.rvPortfolio
        rvPortfolio.layoutManager = layoutManager

        // Access the presenter method to get the portfolio list
        val presenter = AllmightyPresenter(requireContext())
        val portfolioList = presenter.createPortfolioList()

        // Initialize the adapter with the portfolio list
        portfolioAdapter = PortfolioAdapter(requireActivity().supportFragmentManager, portfolioList)

        // Set the adapter to the RecyclerView
        rvPortfolio.adapter = portfolioAdapter

    }

}
