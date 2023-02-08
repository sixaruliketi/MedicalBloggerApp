package com.example.medicalbloggerapp

import com.example.medicalbloggerapp.data.MainModel
import com.example.medicalbloggerapp.data.MovieModel
object SampleData {

    private val movieModel= listOf(
        MovieModel(Images.imageUrl0),
        MovieModel(Images.imageUrl1),
        MovieModel(Images.imageUrl2),
        MovieModel(Images.imageUrl3),
        MovieModel(Images.imageUrl4),
        MovieModel(Images.imageUrl5),
        MovieModel(Images.imageUrl6),
        MovieModel(Images.imageUrl7),
        MovieModel(Images.imageUrl8),
        MovieModel(Images.imageUrl9)
    )

    val collections = listOf(
        MainModel("All Movie" , movieModel),
        MainModel("Want to see" , movieModel.reversed()),
        MainModel("Popular Movie" , movieModel.shuffled()),
        MainModel("Top Rated Movie" , movieModel)

    )
}

object Images {

    const val POSTER_BASE_URL = "https://image.tmdb.org/t/p/w342/"

    const val imageUrl0 = POSTER_BASE_URL + "kjFDIlUCJkcpFxYKtE6OsGcAfQQ.jpg"
    const val imageUrl1 = POSTER_BASE_URL + "bQXAqRx2Fgc46uCVWgoPz5L5Dtr.jpg"
    const val imageUrl2 = POSTER_BASE_URL + "pGx6O6IwqADOsgmqWzPysmWnOyr.jpg"
    const val imageUrl3 = POSTER_BASE_URL + "aGBuiirBIQ7o64FmJxO53eYDuro.jpg"
    const val imageUrl4 = POSTER_BASE_URL + "pTxw4GFE3ZfzJfvuUsPyD5njAuI.jpg"
    const val imageUrl5 = POSTER_BASE_URL + "spCAxD99U1A6jsiePFoqdEcY0dG.jpg"
    const val imageUrl6 = POSTER_BASE_URL + "7ze7YNmUaX81ufctGqt0AgHxRtL.jpg"
    const val imageUrl7 = POSTER_BASE_URL + "gb6rq2nD0jRrN0dCzigg2MxXNsB.jpg"
    const val imageUrl8 = POSTER_BASE_URL + "pHkKbIRoCe7zIFvqan9LFSaQAde.jpg"
    const val imageUrl9 = POSTER_BASE_URL + "rFljUdOozFEv6HDHIFpFvcYW0ec.jpg"

}