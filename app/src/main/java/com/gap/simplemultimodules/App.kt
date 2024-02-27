package com.gap.simplemultimodules

import android.app.Application
import com.gap.data.RepositoryImpl
import com.gap.domain.AnimeRepository
import com.gap.presentation.MainViewModel
import com.gap.presentation.ProvideViewModel

class App: Application(), ProvideViewModel {

    private lateinit var viewModel: MainViewModel
    override fun onCreate() {
        super.onCreate()
        val repository: AnimeRepository = RepositoryImpl()
        viewModel = MainViewModel(repository)
    }

    override fun viewModel(): MainViewModel {
        return viewModel
    }

}