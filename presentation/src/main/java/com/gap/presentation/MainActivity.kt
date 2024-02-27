package com.gap.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gap.presentation.databinding.ActivityMainBinding
import java.util.zip.Inflater

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val viewModel = (application as ProvideViewModel).viewModel()
        viewModel.loadData()
        viewModel.quoteLiveData.observe(this) {
            binding.tvQuote.text = it
        }

    }
}