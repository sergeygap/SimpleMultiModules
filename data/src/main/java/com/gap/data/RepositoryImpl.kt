package com.gap.data

import com.gap.data.server.ServerDao
import com.gap.domain.AnimeRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepositoryImpl(
    private val serverDao: ServerDao
) : AnimeRepository {

    constructor() : this(
        Retrofit.Builder()
            .baseUrl("https://animechan.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ServerDao::class.java)
    )

    override suspend fun loadQuote(): Pair<Boolean, String> {

        return try {
            val response = serverDao.loadQuote().quote
            Pair(true, response)

        } catch (e: Exception) {
            Pair(false, e.message ?: "error")
        }

    }
}
