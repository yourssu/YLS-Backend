package com.yourssu.yls.domain.service

import com.yourssu.yls.app.request.LoggingRequest
import com.yourssu.yls.app.response.EventResponse
import com.yourssu.yls.app.response.LoggingResponse
import com.yourssu.yls.domain.model.document.LogDocument
import com.yourssu.yls.domain.model.nested.EventVO
import java.time.LocalDateTime

class LogAssembler {
    companion object {
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
                timestamp = logDocument.timestamp.toString(),
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
                // 수정
                timestamp = LocalDateTime.now().toString(),
                event = eventVO,
            )
        }
    }
}
