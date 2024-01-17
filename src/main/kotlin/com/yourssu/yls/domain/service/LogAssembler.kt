package com.yourssu.yls.domain.service

import com.yourssu.yls.application.request.LoggingRequest
import com.yourssu.yls.application.response.EventResponse
import com.yourssu.yls.application.response.LoggingResponse
import com.yourssu.yls.domain.model.document.LogDocument
import com.yourssu.yls.domain.model.nested.EventVO

object LogAssembler {
    fun writeDto(logDocument: LogDocument): LoggingResponse {
        val eventDocument = logDocument.event
        val eventRequest =
            EventResponse(
                platform = eventDocument.platform,
                screen = eventDocument.screen,
                name = eventDocument.name,
                keyword = eventDocument.keyword,
                resultID = eventDocument.resultID,
            )

        return LoggingResponse(
            user = logDocument.user,
            timestamp = logDocument.timestamp,
            event = eventRequest,
        )
    }

    fun writeDocument(loggingRequest: LoggingRequest): LogDocument {
        val requestEvent = loggingRequest.event
        val eventVO =
            EventVO(
                platform = requestEvent.platform,
                screen = requestEvent.screen,
                name = requestEvent.name,
                keyword = requestEvent.keyword,
                resultID = requestEvent.resultID,
            )

        return LogDocument(
            user = loggingRequest.user,
            timestamp = loggingRequest.timestamp,
            event = eventVO,
        )
    }
}
