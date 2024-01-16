package com.yourssu.yls.domain.service

import com.yourssu.yls.app.request.LoggingRequest
import com.yourssu.yls.domain.model.document.LogDocument
import com.yourssu.yls.domain.model.repository.LoggingRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LoggingService(
    private val loggingRepository: LoggingRepository,
) {
    @Transactional
    fun writeLog(request: LoggingRequest) {
        val logDocument: LogDocument = LogAssembler.writeDocument(request)

        loggingRepository.save(logDocument)
    }
}
