package com.yourssu.yls.application.response

class LoggingResponse(
    val user: String,
    val timestamp: String,
    val event: EventResponse,
)

class EventResponse(
    val platform: String,
    val screen: String,
    val name: String,
    val keyword: String,
    val resultID: String,
)
