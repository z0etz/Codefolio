package com.katja.codefolio

import java.io.Serializable

data class PortfolioItem(val title : String, val description: String, val imgSrc: Int) : Serializable {
}