package com.gap.data.server

import com.google.gson.annotations.SerializedName

data class AnimeQuoteDto(
    @SerializedName("quote")
    val quote: String
)
