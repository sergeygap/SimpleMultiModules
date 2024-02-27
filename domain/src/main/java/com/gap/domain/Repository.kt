package com.gap.domain

interface Repository {

    /**
     * Boolean - success
     * String - dataC
     */
    suspend fun loadQuote(): Pair<Boolean, String>

}