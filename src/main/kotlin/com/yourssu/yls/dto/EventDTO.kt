package com.yourssu.yls.dto

import com.yourssu.yls.reqeust.EventRequest

data class EventDTO(
    val platform: String,
    val screen: String,
    val name: String,
    val keyword: String,
    val resultID: String
) {
    companion object {
        fun from(eventRequest: EventRequest): EventDTO {
            return EventDTO(
                platform = eventRequest.platform,
                screen = eventRequest.screen,
                name = eventRequest.name,
                keyword = eventRequest.keyword,
                resultID = eventRequest.resultID
            )
        }
    }
}