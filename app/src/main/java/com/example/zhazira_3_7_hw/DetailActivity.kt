package com.example.zhazira_3_7_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zhazira_3_7_hw.databinding.ActivityDetailBinding
import com.example.zhazira_3_7_hw.databinding.FragmentDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getData = intent.getStringExtra("song")
        binding.tvSongName.text = getData
    }
}