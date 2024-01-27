package com.yourssu.yls.domain.service

import com.yourssu.yls.application.request.LoggingRequest
import com.yourssu.yls.application.response.LoggingResponse
import com.yourssu.yls.domain.model.document.LogDocument

object LogAssembler {
    fun writeDto(logDocument: LogDocument): LoggingResponse {

        return LoggingResponse(
            user = logDocument.user,
            timestamp = logDocument.timestamp,
            event = logDocument.event,
        )
    }

    fun writeDocument(loggingRequest: LoggingRequest): LogDocument {

        return LogDocument(
            user = loggingRequest.user,
            timestamp = loggingRequest.timestamp,
            event = loggingRequest.event,
        )
    }
}
