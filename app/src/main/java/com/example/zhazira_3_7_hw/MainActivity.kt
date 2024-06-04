package com.example.zhazira_3_7_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.zhazira_3_7_hw.databinding.ActivityMainBinding
import com.example.zhazira_3_7_hw.databinding.FragmentFirstBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().add(R.id.frame_one, FirstFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.frame_two, SecondFragment()).commit()
    }
}