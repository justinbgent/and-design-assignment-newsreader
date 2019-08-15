package com.example.wireframeproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wireframeproject.model.Data
import kotlinx.android.synthetic.main.news_item.view.*

class NewsListAdapter(private val data: MutableList<Data>) : RecyclerView.Adapter<NewsListAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.newsTitle.text = data[position].newsTitle
        holder.newsBody.text = data[position].newsBody
        holder.newPicture.setImageDrawable(data[position].image)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val newsTitle: TextView = view.title_text
        val newPicture: ImageView = view.image_view
        val newsBody: TextView = view.body_text
    }
}