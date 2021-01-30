package com.example.sunnyweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sunnyweather.databinding.ActivityMainBinding
import com.hi.dhl.binding.viewbind

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by viewbind()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
