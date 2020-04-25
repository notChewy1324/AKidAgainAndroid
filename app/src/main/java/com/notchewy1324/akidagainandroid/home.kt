package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class home : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        //Button Links
        momentsButton.setOnClickListener {
            //Fix Link
        }

        chaptersButton.setOnClickListener {
            //Fix Link
        }

        communityButton.setOnClickListener {
            //Fix Link
        }

        historyButton.setOnClickListener {
            //Fix Link
        }
    }
}
