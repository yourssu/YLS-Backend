package com.yourssu.yls.reqeust

data class LogRequest(
    val user: String,
    val timestamp: String,
    val event: EventRequest
)