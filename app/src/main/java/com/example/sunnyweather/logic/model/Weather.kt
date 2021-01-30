package com.example.sunnyweather.logic.model

/**
 *@package:com.example.sunnyweather.logic.model
 *@filename:Weather
 *@date on 21.1.30  17:18
 *author  create by lucy
 *@email 747526273@qq.com
 */
data class Weather(val realtime:RealtimeResponse.Realtime,val daily:DailyResponse.Daily)
