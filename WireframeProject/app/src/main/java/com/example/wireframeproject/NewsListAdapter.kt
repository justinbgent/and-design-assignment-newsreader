package com.example.wireframeproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wireframeproject.model.Data
import kotlinx.android.synthetic.main.news_item.view.*

class NewsListAdapter(val data: MutableList<Data>) : RecyclerView.Adapter<NewsListAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val viewGroup = LayoutInflater.from(parent.context).inflate(R.layout.news_item, parent, false)
        return ViewHolder(viewGroup)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.news_title.text = data[position].newsTitle
        holder.news_body.text = data[position].newsBody
        holder.news_picture.setImageDrawable(data[position].image)
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val news_title = view.title_text
        val news_picture = view.image_view
        val news_body = view.body_text
    }
}