package com.yourssu.yls.app.response

// 확정 필요
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
