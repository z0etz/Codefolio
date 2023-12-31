package com.katja.codefolio

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.katja.codefolio.databinding.PortfolioItemBinding


class PortfolioItemImageAdapter(
    var portfolioItemImageList: ArrayList<Int>
) : RecyclerView.Adapter<PortfolioItemImageAdapter.ViewHolder>() {

    class ViewHolder(binding: PortfolioItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val imImage: ImageView = binding.portfolioItemImage

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            PortfolioItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return portfolioItemImageList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentImageItem = portfolioItemImageList[position]
        holder.imImage.setImageResource(currentImageItem)
    }
}
