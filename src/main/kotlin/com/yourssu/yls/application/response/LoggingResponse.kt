package com.yourssu.yls.application.response

class LoggingResponse(
    val user: String,
    val timestamp: String,
    val event: Map<String, Any>,
)
