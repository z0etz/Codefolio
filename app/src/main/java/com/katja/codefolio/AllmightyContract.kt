package com.katja.codefolio

interface AllmightyContract {
    interface View {
        fun showPortfolio(notes: List<PortfolioItem>?)
    }

    interface Presenter {

        fun createPortfolioList(): ArrayList<PortfolioItem>

    }
}