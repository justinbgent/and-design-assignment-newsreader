package com.example.wireframeproject.ui

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.wireframeproject.NewsListAdapter
import com.example.wireframeproject.R
import com.example.wireframeproject.model.Data
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        var newsArticles = mutableListOf<Data>()

        newsArticles.add(Data(R.drawable.abstract_abstract_expressionism_art_2505693 as Drawable, "Flowers Gone Crazy", "..."))

        news_articles.setHasFixedSize(true)
        val manager = StaggeredGridLayoutManager(3, RecyclerView.VERTICAL)
//        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = NewsListAdapter(newsArticles)
        news_articles.layoutManager = manager
        news_articles.adapter = adapter
    }
}
