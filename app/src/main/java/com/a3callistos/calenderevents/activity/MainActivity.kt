package com.a3callistos.calenderevents.activity

import android.content.pm.PackageManager
import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.a3callistos.calenderevents.R
import com.imanoweb.calendarview.CustomCalendarView
import com.imanoweb.calendarview.DayDecorator
import com.imanoweb.calendarview.DayView
import java.util.*
import kotlin.collections.ArrayList
import android.graphics.Typeface
import android.support.annotation.MainThread
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import com.a3callistos.calenderevents.model.EventModel
import com.a3callistos.calenderevents.rest.Api
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.jar.Manifest


/**
 * Created by Bibesh on 8/7/17.
 */

var calendar: Calendar = Calendar.getInstance();

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Api.getInstance().makeApi()
    }

    override fun onStart() {
        super.onStart()
        EventBus.getDefault().register(this)
        println(EventBus.getDefault().isRegistered(this))
    }

    @Subscribe
    fun getData(response: List<EventModel>) {
        for (res in response){
            println(res.getEventName())
        }
    }
}
