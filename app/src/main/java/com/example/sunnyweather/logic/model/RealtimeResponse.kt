package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 *@package:com.example.sunnyweather.logic.model
 *@filename:RealtimeResponse
 *@date on 21.1.30  16:37
 *author  create by lucy
 *@email 747526273@qq.com
 */
data class RealtimeResponse(val status:String,val result:Result){
    data class Result(val realtime:Realtime)
    /**由于JSON中一些字段命名可能与Kotlin中命名规范不太一致，@SerializedName注解
     * 来让JSON字段与Kotlin字段之间建立映射关系
    */
    data class Realtime(val skycon:String,val temperature:Float,@SerializedName("air_quality")val airQuality:AirQuality)
    data class AirQuality(val aqi:AQI)
    data class AQI(val chn:Float)
}
