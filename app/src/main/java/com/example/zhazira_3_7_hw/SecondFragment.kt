package com.example.zhazira_3_7_hw

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.zhazira_3_7_hw.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = SongAdapter(songList, this::onClick)
        binding.rvSongs.adapter = adapter
    }

    private fun onClick(position: Int){
        val song = songList[position].name
        val intent = Intent(activity, DetailActivity:: class.java)
        intent.putExtra("song",song)
    }


    private val songList = listOf(
        Song("1", "Taylor Swift", "Blank Space", "01:26"),
        Song("2", "Adele", "Set Fire To The Rain", "01:26"),
        Song("3", "Alan Walker", "Faded Mashup", "01:26"),
        Song("4", "Bruno mars", "Grenade", "01:26"),
        Song("5", "The Weeknd", "Save Your Tears", "01:26"),
        Song("6", "Dua Lipa", "New Rules", "01:26"),
        Song("7", "David Kushner", "Daylight", "01:26"),
        Song("8", "Murat Gogebakan", "Vurgunum", "01:26"),
        Song("9", "Micheal Buble", "Sway", "01:26"),
        Song("10", "Modern Talking", "Cheri Lady", "01:26")
    )

}