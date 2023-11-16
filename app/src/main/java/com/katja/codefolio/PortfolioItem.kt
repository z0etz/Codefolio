package com.katja.codefolio

import java.io.Serializable

data class PortfolioItem(val title : String, val short_description: String, val description: String, val imgSrc: Int, val imgSrc1: Int?, val imgSrc2: Int?, val imgSrc3: Int?) : Serializable {
}