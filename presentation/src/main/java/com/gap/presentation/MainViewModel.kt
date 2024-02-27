package com.gap.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gap.domain.AnimeRepository
import com.gap.domain.LoadQuoteUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val repository: AnimeRepository
) : ViewModel() {

    private val loadQuoteUseCase = LoadQuoteUseCase(repository)

    private val _quoteLiveData = MutableLiveData<String>()
    val quoteLiveData = _quoteLiveData
    fun loadData() {
        viewModelScope.launch {
            val quote = loadQuoteUseCase.loadQuote().second
            _quoteLiveData.value = quote
        }
    }


}