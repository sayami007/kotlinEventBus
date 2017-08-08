package com.a3callistos.calenderevents.rest

import com.a3callistos.calenderevents.model.EventModel
import retrofit2.Call
import retrofit2.http.GET

/**
 * Created by Bibesh on 8/7/17.
 */


interface RestAPI{
    @GET("event")
    fun getEvents(): Call<List<EventModel>>
}