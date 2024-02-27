package com.gap.domain

class LoadQuoteUseCase(
    private val animeRepository: AnimeRepository
) {
    suspend fun loadQuote(): Pair<Boolean, String> {
        return animeRepository.loadQuote()

    }
}