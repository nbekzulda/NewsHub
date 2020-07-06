package com.example.newshub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var tabLayoutNews: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewPager_id)
        tabLayoutNews = findViewById(R.id.tabNews)

        val fragmentAdapter = MyPagerAdapter(supportFragmentManager)

        viewPager.adapter = fragmentAdapter

        tabLayoutNews.setupWithViewPager(viewPager)

    }
}
