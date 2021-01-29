package com.example.sunnyweather.logic.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *@package:com.example.sunnyweather.logic.network
 *@filename:ServiceCreator
 *@date on 21.1.29  16:56
 *author  create by lucy
 *@email 747526273@qq.com
 */
object ServiceCreator {
    private const val BASE_URL = "https://api.caiyunapp.com/"
    private val retrofit = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun <T>create(serviceClass: Class<T>):T = retrofit.create(serviceClass)
    inline fun <reified T>create():T = create(T::class.java)

}