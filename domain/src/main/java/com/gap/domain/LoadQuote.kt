package com.gap.domain

class LoadQuote(
    private val repository: Repository
) {
    suspend fun loadQuote(): Pair<Boolean, String> {
        return repository.loadQuote()

    }
}