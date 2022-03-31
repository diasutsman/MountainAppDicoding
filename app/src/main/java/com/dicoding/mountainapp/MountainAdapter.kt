package com.dicoding.mountainapp

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MountainAdapter(private val listData: ArrayList<Mountain>) :
    RecyclerView.Adapter<MountainAdapter.MountainViewHolder>() {
    class MountainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.tv_row_name)
        val tvDetail: TextView = itemView.findViewById(R.id.tv_row_detail)
        val imgData: ImageView = itemView.findViewById(R.id.img_row_data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MountainViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.row_data_mountain, parent, false)
        return MountainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MountainViewHolder, position: Int) {
        val mountain = listData[position]
        holder.apply {
            tvName.text = mountain.name
            tvDetail.text = mountain.detail
            imgData.setImageResource(mountain.img)
        }
        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, DetailActivity::class.java)
            intent.putExtra(DetailActivity.MOUNTAIN_NAME, mountain.name)
            intent.putExtra(DetailActivity.MOUNTAIN_DETAIL, mountain.detail)
            intent.putExtra(DetailActivity.MOUNTAIN_IMG, mountain.img)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listData.size
}