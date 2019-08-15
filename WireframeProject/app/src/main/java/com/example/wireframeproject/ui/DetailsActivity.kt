package com.example.wireframeproject.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wireframeproject.R
import com.example.wireframeproject.ui.ListActivity.Companion.newsArticles
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        var intent = Intent(this, ListActivity::class.java)
        var index = intent.getIntExtra("data", 1)
        var title = intent.getStringExtra("data1")?: "dsafjkl;asd;gasdl;g"
        var body = intent.getStringExtra("data2")?: "asdfkggggggggggggggggggggggggggggggggggggggggggggggg"
        //newsArticles[index]
        image_details.setImageDrawable(newsArticles[index].image)
        text_title.text = title
        text_body.text = body

    }
}
