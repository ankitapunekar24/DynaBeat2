package com.ankitapunekar.dynabeat

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ankitapunekar.dynabeat.databinding.ActivityFavouriteBinding

class favouriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFavouriteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.coolPink)
        binding = ActivityFavouriteBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}