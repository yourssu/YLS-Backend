package com.yourssu.yls.dto

import com.yourssu.yls.reqeust.LogRequest

data class LogDTO(
    val user: String,
    val timestamp: String,
    val event: EventDTO
) {
    companion object {
        fun from(logRequest: LogRequest): LogDTO {
            val event = logRequest.event
            return LogDTO(
                user = logRequest.user,
                timestamp = logRequest.timestamp,
                event = EventDTO.from(event)
            )
        }
    }
}