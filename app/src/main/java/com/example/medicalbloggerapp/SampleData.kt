package com.example.medicalbloggerapp

import com.example.medicalbloggerapp.Images.POSTER_BASE_URL
import com.example.medicalbloggerapp.home.models.PostCollectionModel
import com.example.medicalbloggerapp.home.models.PostModel
import com.example.medicalbloggerapp.network.models.CategoryModel

object SampleData {

    private val postModels= listOf(
        PostModel(Images.imageUrl0),
        PostModel(Images.imageUrl1),
        PostModel(Images.imageUrl2),
        PostModel(Images.imageUrl3),
        PostModel(Images.imageUrl4),
        PostModel(Images.imageUrl5),
        PostModel(Images.imageUrl6),
        PostModel(Images.imageUrl7),
        PostModel(Images.imageUrl8),
        PostModel(Images.imageUrl9)
    )

    val collections = listOf(
        PostCollectionModel("All Movie" , postModels),
        PostCollectionModel("Want to see" , postModels.reversed()),
        PostCollectionModel("Popular Movie" , postModels.shuffled()),
        PostCollectionModel("Top Rated Movie" , postModels)

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

object FakeData{

    const val POSTER_BASE_URL = "https://image.tmdb.org/t/p/w342/"

    val collections = listOf(
        PostModel(Images.POSTER_BASE_URL + "kjFDIlUCJkcpFxYKtE6OsGcAfQQ.jpg"),
        PostModel(Images.POSTER_BASE_URL + "bQXAqRx2Fgc46uCVWgoPz5L5Dtr.jpg"),
        PostModel(Images.POSTER_BASE_URL + "pTxw4GFE3ZfzJfvuUsPyD5njAuI.jpg"),
        PostModel(Images.POSTER_BASE_URL + "pGx6O6IwqADOsgmqWzPysmWnOyr.jpg"),
        PostModel(Images.POSTER_BASE_URL + "aGBuiirBIQ7o64FmJxO53eYDuro.jpg"),
        PostModel(Images.POSTER_BASE_URL + "spCAxD99U1A6jsiePFoqdEcY0dG.jpg"),
        PostModel(Images.POSTER_BASE_URL + "7ze7YNmUaX81ufctGqt0AgHxRtL.jpg"),
        PostModel(Images.POSTER_BASE_URL + "gb6rq2nD0jRrN0dCzigg2MxXNsB.jpg"),
        PostModel(Images.POSTER_BASE_URL + "pHkKbIRoCe7zIFvqan9LFSaQAde.jpg"),
        PostModel(Images.POSTER_BASE_URL + "rFljUdOozFEv6HDHIFpFvcYW0ec.jpg"),


    )
}