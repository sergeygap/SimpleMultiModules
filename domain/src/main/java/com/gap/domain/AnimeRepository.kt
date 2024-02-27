package com.gap.domain

interface AnimeRepository {

    /**
     * Boolean - success
     * String - dataC
     */
    suspend fun loadQuote(): Pair<Boolean, String>

}