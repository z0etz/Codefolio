package com.katja.codefolio;

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.katja.codefolio.databinding.PortfolioItemBinding

//
//class PortfolioAdapter(val portfolioItemList: List<PortfolioItem>) :
//    RecyclerView.Adapter<PortfolioAdapter.ViewHolder() {
//
//    class ViewHolder(binding: PortfolioItemBinding) : RecyclerView.ViewHolder(binding.root) {
//        val cardView: CardView = binding.root
//        val tvTitle: TextView = binding.???
//        val tvDescription: TextView = binding.???
//        val imImage: ImageView = binding.???
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val binding = PortfolioItemBinding.inflate(LayoutInflater.from(parent.context),parent, false)
//        return ViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: PortfolioAdapter.ViewHolder, position: Int) {
//        val currentPortfolioItem = portfolioItemList[position]
//        holder.tvTitle.text = currentPortfolioItem.title
//        holder.tvDescription.text = currentPortfolioItem.description
//        holder.imImage.setImageResource(currentPortfolioItem.imgSrc)
//        holder.cardView.setOnClickListener{
//            Toast.makeText(holder.cardView.context, "Clicked on item: ${currentPortfolioItem.title}",
//                Toast.LENGTH_SHORT).show()
//        }
//    }
//
//    override fun getItemCount(): Int {
//        return portfolioItemList.size
//    }
//
//}