package com.triad.testlist.view.main

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.triad.testlist.R
import com.triad.testlist.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {

    companion object {

        lateinit var context: Context

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        context = this

    }

}