package com.yourssu.yls.application.response

class LoggingResponse(
    val user: String,
    val timestamp: String,
    val version: Int,
    val event: Map<String, Any>,
)
