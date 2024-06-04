package com.example.zhazira_3_7_hw

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.zhazira_3_7_hw.databinding.ItemSongsBinding
import kotlin.reflect.KFunction1

class SongAdapter(val songList: List<Song>, private val onClick: (position: Int) -> Unit) :
    RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemSongsBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return songList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(songList[position])
        holder.itemView.setOnClickListener {
            onClick(position)
        }
    }
}

class ViewHolder(val binding: ItemSongsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun onBind(song: Song) {
        binding.songName.text = song.name
        binding.songDuration.text = song.duration
        binding.authorName.text = song.author
        binding.songNumber.text = song.number
    }
}