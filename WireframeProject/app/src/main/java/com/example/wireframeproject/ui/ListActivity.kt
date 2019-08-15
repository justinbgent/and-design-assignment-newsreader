package com.example.wireframeproject.ui

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
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

        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.abstract_abstract_expressionism_art_2505693)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.aerial_photography_aerial_shot_aerial_view_2583847)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.adventure_automobile_classic_2533092)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.afterglow_beach_cliff_2555285)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.alley_architecture_buildings_2526517)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.architectural_design_architecture_bridge_2540653)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.beautiful_breathtaking_canada_day_2526105)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.bloom_blossom_flora_2567011)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.close_up_colorful_colors_2529148)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.clouds_coconut_trees_daylight_2486168)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.colorful_colourful_houses_2501965)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))
        newsArticles.add(Data(ContextCompat.getDrawable(this, R.drawable.wallpaper_astronomy_astrophotography_2538107)!!, "Flowers Gone Crazy", " is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley "))

        news_articles.setHasFixedSize(true)
        val manager = StaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
//        val manager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        val adapter = NewsListAdapter(newsArticles)
        news_articles.layoutManager = manager
        news_articles.adapter = adapter
    }
}
