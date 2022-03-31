package com.nbd.recyclercrunchy

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.nbd.recyclercrunchy.databinding.ItemVideoCrunchyBinding
import org.json.JSONObject

class MainAdapter(private val videos:Array<JSONObject>):RecyclerView.Adapter<MainAdapter.MainHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainAdapter.MainHolder {
        val binding= ItemVideoCrunchyBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MainHolder(binding)
    }

    override fun onBindViewHolder(holder: MainAdapter.MainHolder, position: Int) {
        holder.render(videos[position] )
    }

    override fun getItemCount(): Int =videos.size

    class MainHolder(val binding:ItemVideoCrunchyBinding):RecyclerView.ViewHolder(binding.root){
        fun render(video:JSONObject){
            binding.tvTitle.setText(video.getString("title"))
            binding.tvKind.setText(video.getString("kind"))
            binding.tvLanguage.setText(video.getString("language"))
            binding.ivVideoThumbnail.setImageResource(R.drawable.video_placeholder)
        }
    }
}