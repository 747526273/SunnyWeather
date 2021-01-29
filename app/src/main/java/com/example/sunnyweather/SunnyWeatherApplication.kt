package com.example.sunnyweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 *@package:com.example.sunnyweather
 *@filename:SunnyWeatherApplication
 *@date on 21.1.29  16:18
 *author  create by lucy
 *@email 747526273@qq.com
 */
class SunnyWeatherApplication : Application() {
    companion object{
        const val TOKEN = "023umTsHoKiy4QGT"
        @SuppressLint("StaticFieldLeak")
        lateinit var context:Context
    }
    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}