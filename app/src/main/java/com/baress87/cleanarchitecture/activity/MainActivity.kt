package com.baress87.cleanarchitecture.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baress87.cleanarchitecture.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}