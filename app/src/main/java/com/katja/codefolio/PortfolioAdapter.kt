package com.katja.codefolio

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.katja.codefolio.databinding.PortfolioItemBinding


class PortfolioAdapter(private val fragmentManager: FragmentManager,
                       var portfolioItemList: List<PortfolioItem>): RecyclerView.Adapter<PortfolioAdapter.ViewHolder>() {

    class ViewHolder(binding: PortfolioItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val cardView: CardView = binding.root
        val tvTitle: TextView = binding.portfolioItemName
        val tvDescription: TextView = binding.shortDescripton
        val imImage: ImageView = binding.portfolioItemImage

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = PortfolioItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentPortfolioItem = portfolioItemList[position]
        holder.tvTitle.text = currentPortfolioItem.title
        holder.tvDescription.text = currentPortfolioItem.description
        holder.imImage.setImageResource(currentPortfolioItem.imgSrc)
        holder.cardView.setOnClickListener{
            val fragment = PortfolioItemFragment()
            val args = Bundle().apply {
                putSerializable("portfolioItem", currentPortfolioItem)
            }
            fragment.arguments = args

            fragmentManager.commit {
                replace(R.id.frameContent, fragment)
            }
        }
    }

    override fun getItemCount(): Int {
        return portfolioItemList.size
    }

    fun updateData(newPortfolioList: List<PortfolioItem>) {
        portfolioItemList = newPortfolioList
        notifyDataSetChanged()
    }

}
