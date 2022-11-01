package com.heeyjinny.widgetsratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.heeyjinny.widgetsratingbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.ratingBar.setOnRatingBarChangeListener { ratingBar, fl, b ->
            binding.textView.text="$fl"
        }
        
    }
}