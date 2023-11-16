package com.katja.codefolio

import android.content.Context

class AllmightyPresenter(private val context: Context) {
    fun createPortfolioList(): ArrayList<PortfolioItem> {
        val portfolioList = ArrayList<PortfolioItem>()
        var itemNumber = 0

        // Keep adding portfolio items until there are no more image resources
        while (true) {
            // Construct the image resource name
            val imageName = "im_" + itemNumber + "_0"
            val titleResourceName = "title" + itemNumber
            val shortDescriptionResourceName = "shortDescription" + itemNumber
            val descriptionResourceName = "description" + itemNumber
            val imageResourceId = context.resources.getIdentifier(
                imageName,
                "drawable",
                context.packageName
            )

            // Check if the resource exists, if not, break the loop
            if (imageResourceId == 0) {
                break
            }

            // Get and set the name and description strings using the resource names, add portfolio item to list
            val titleResId = context.resources.getIdentifier(
                titleResourceName,
                "string",
                context.packageName
            )
            val shortDescriptionResId = context.resources.getIdentifier(
                shortDescriptionResourceName,
                "string",
                context.packageName
            )
            val descriptionResId = context.resources.getIdentifier(
                descriptionResourceName,
                "string",
                context.packageName
            )

            val imagesSrc = ArrayList<Int>()
            var imageNumber = 1

            // Keep adding image items until there are no more image resources for the selected portfolio item
            while (true) {
                // Construct the image resource name for the selected portfolio item
                val imageForListName = "im_" + itemNumber + "_" + imageNumber
                val imageResourceIdforList = context.resources.getIdentifier(
                    imageForListName, "drawable", context.packageName
                )

                // Check if the resource exists, if not, break the loop
                if (imageResourceIdforList == 0) {
                    break
                }

                imagesSrc.add(imageResourceIdforList)

                // Debug statement to print course information
                println("ImageListDebug: Added Image item: " + imageName)

                // Increment to check for the next image resource for the selected portfolio item
                imageNumber++
            }

                val title = if (titleResId != 0) context.getString(titleResId) else ""
                val shortDescription =
                    if (shortDescriptionResId != 0) context.getString(shortDescriptionResId) else ""
                val description =
                    if (descriptionResId != 0) context.getString(descriptionResId) else ""

                val portfolioItem = PortfolioItem(
                    title, shortDescription, description, imageResourceId,
                    imagesSrc
                )
                portfolioList.add(portfolioItem)

                // Debug statement to print course information
                println("PortfolioListDebug: Added Portfolio item: " + title)

                // Increment int to add next resource
                itemNumber++
            }

            return portfolioList
        }

}