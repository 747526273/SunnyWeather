package com.example.sunnyweather.ui.place

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.example.sunnyweather.logic.Repository
import com.example.sunnyweather.logic.model.Place

/**
 *@package:com.example.sunnyweather.ui.place
 *@filename:PlaceViewModel
 *@date on 21.1.29  21:26
 *author  create by lucy
 *@email 747526273@qq.com
 */
class PlaceViewModel:ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    val placeList  =ArrayList<Place>()
    val placeLiveData =Transformations.switchMap(searchLiveData){query->
        Repository.searchPlaces(query)
    }
    fun searchPlaces(query:String){
        searchLiveData.value = query
    }
}