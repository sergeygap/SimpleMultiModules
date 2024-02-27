package com.gap.domain

class LoadQuote(
    private val animeRepository: AnimeRepository
) {
    suspend fun loadQuote(): Pair<Boolean, String> {
        return animeRepository.loadQuote()

    }
}