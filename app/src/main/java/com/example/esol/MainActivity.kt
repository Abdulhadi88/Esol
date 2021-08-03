package com.example.esol

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.esol.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webView.loadUrl("http://rsdhia.esolution-tech.com/mobile/mobile_reg/")
        binding.webView.settings.javaScriptEnabled = true
    }
}