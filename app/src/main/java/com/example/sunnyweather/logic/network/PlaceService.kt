package com.example.sunnyweather.logic.network

import com.example.sunnyweather.SunnyWeatherApplication
import com.example.sunnyweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 *@package:com.example.sunnyweather.logic.network
 *@filename:PlaceService
 *@date on 21.1.29  16:35
 *author  create by lucy
 *@email 747526273@qq.com
 */
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query")query:String):Call<PlaceResponse>


}