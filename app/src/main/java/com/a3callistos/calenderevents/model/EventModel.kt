package com.a3callistos.calenderevents.model

/**
 * Created by Bibesh on 8/7/17.
 */

class EventModel {

    private var eventId: Int? = null
    private var eventName: String? = null
    private var eventTime: String? = null
    private var postedBy: String? = null
    private var postedTime: String? = null
    private var eventDescription: String? = null

    fun getEventId(): Int? {
        return this.eventId
    }

    fun setEventId(eventId: Int) {
        this.eventId = eventId
    }

    fun getEventName(): String? {
        return this.eventName
    }

    fun setEventName(eventName: String) {
        this.eventName = eventName
    }

    fun getEventTime(): String? {
        return this.eventTime
    }

    fun setEventTime(eventTime: String) {
        this.eventTime = eventTime
    }

    fun getPostedBy(): String? {
        return this.postedBy
    }

    fun setPostedBy(postedBy: String) {
        this.postedBy = postedBy
    }

    fun getPostedTime(): String? {
        return this.postedTime
    }

    fun setPostedTime(postedTime: String) {
        this.postedTime = postedTime
    }

    fun getEventDescription(): String? {
        return this.eventDescription
    }

    fun setEventDescription(eventDescription: String) {
        this.eventDescription = eventDescription
    }
}