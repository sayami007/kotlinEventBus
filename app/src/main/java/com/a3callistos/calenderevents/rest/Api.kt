package com.a3callistos.calenderevents.rest

import android.util.Log
import android.widget.Toast
import com.a3callistos.calenderevents.app.Constant
import com.a3callistos.calenderevents.model.EventModel
import org.greenrobot.eventbus.EventBus
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by Bibesh on 8/7/17.
 */

class Api {

    var restApi: RestAPI? = null

    companion object {
        var api: Api? = null
        fun getInstance(): Api {
            if (api == null) {
                api = Api()
            }
            return api as Api
        }
    }

    fun makeApi() {
        var retroFit: Retrofit = Retrofit.Builder()
                .baseUrl(Constant.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        var restApi: RestAPI = retroFit.create(RestAPI::class.java)
        var model: Call<List<EventModel>> = restApi.getEvents();

        model.enqueue(object : Callback<List<EventModel>> {
            override fun onResponse(call: Call<List<EventModel>>, response: Response<List<EventModel>>) {
                println("RES")
                EventBus.getDefault().post(response.body())
            }

            override fun onFailure(call: Call<List<EventModel>>, t: Throwable) {
                println("ERROR")
                EventBus.getDefault().post(t.message)
            }
        })
    }

}