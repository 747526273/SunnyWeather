package com.example.sunnyweather.ui.wether

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Location

/**
 *@package:com.example.sunnyweather.ui.wether
 *@filename:WeatherViewModel
 *@date on 21.2.1  16:09
 *author  create by lucy
 *@email 747526273@qq.com
 */
class WeatherViewModel:ViewModel() {
    private val locationLiveData = MutableLiveData<Location>()
    var locationLng = ""
    var locationLat = ""
    var placeName = ""
    val weatherLiveData = Transformations.switchMap(locationLiveData){
        location->Repository.refeshWeather(location.lng,location.lat)
    }
    fun refreshWeather(lng:String,lat:String){
        locationLiveData.value = Location(lng, lat)
    }
}