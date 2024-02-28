package com.yourssu.yls.domain.service

import com.yourssu.yls.application.request.LoggingRequest
import com.yourssu.yls.application.response.LoggingResponse
import com.yourssu.yls.domain.model.document.LogDocument

object LogAssembler {
    fun writeDto(logDocument: LogDocument): LoggingResponse {
        return LoggingResponse(
            user = logDocument.user,
            timestamp = logDocument.timestamp,
            version = logDocument.version,
            event = logDocument.event,
        )
    }

    fun writeDocument(loggingRequest: LoggingRequest): LogDocument {
        return LogDocument(
            user = loggingRequest.hashedID,
            timestamp = loggingRequest.timestamp,
            version = loggingRequest.version,
            event = loggingRequest.event,
        )
    }
}
