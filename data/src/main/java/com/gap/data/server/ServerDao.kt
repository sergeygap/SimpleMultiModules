package com.gap.data.server

import retrofit2.http.GET

interface ServerDao {


    @GET("api/random")
    suspend fun loadQuote(): AnimeQuoteDto

}