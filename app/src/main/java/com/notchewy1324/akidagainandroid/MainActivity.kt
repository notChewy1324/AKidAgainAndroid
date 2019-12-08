package com.notchewy1324.akidagainandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Takes us to login page
        button.setOnClickListener {
            setContentView(R.layout.activity_login)
        }
        //Takes us to signup page
        button2.setOnClickListener {
            setContentView(R.layout.activity_signup)
        }
    }
}
