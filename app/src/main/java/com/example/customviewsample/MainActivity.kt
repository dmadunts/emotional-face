package com.example.customviewsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.customviewsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.happyButton.setOnClickListener {
            binding.emotionalFaceView.happinessState = EmotionalFaceView.HAPPY
        }

        binding.sadButton.setOnClickListener {
            binding.emotionalFaceView.happinessState = EmotionalFaceView.SAD
        }

        setContentView(binding.root)
    }
}