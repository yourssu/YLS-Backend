package com.yourssu.yls.domain.service

import com.yourssu.yls.application.request.LogListRequest
import com.yourssu.yls.application.request.LoggingRequest
import com.yourssu.yls.application.response.LoggingResponse
import com.yourssu.yls.domain.model.document.LogDocument
import com.yourssu.yls.domain.model.repository.LoggingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LoggingService(
    private val loggingRepository: LoggingRepository,
) {
    @Transactional
    fun writeLog(request: LoggingRequest): LoggingResponse {
        val logDocument: LogDocument = LogAssembler.writeDocument(request)
        val savedLogDocument = loggingRepository.save(logDocument)
        return LogAssembler.writeDto(savedLogDocument)
    }

    @Transactional
    fun writeLogUsingList(request: LogListRequest) {
        val logDocumentList: List<LogDocument> =
            request
                .logRequestList
                .map { LogAssembler.writeDocument(it) }
                .toList()

        loggingRepository.saveAll(logDocumentList)
    }
}
