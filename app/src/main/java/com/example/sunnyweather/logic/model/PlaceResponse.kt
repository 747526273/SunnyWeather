package com.example.sunnyweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 *@package:com.example.sunnyweather.logic.model
 *@filename:PlaceResponse
 *@date on 21.1.29  16:27
 *author  create by lucy
 *@email 747526273@qq.com
 */
data class PlaceResponse(val status:String, val places: List<Place>)
data class Place(
    val name: String,
    val location: Location,
    @SerializedName("formatted_address") val addresss: String
)

data class Location(val lng: String, val lat: String)