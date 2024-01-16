package com.yourssu.yls.service

import com.yourssu.yls.common.CommonException
import com.yourssu.yls.common.LogDto
import com.yourssu.yls.entity.Log
import com.yourssu.yls.repository.LogRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.security.SecureRandom

@Service
class LogService (
    private val logRepository: LogRepository
) {
    @Transactional
    fun searchById(id: Long): LogDto {
        val log = logRepository.findByIdOrNull(id) ?: throw CommonException("ex")
        return LogDto(log.id, log.user, log.timestamp, log.event)
    }

    @Transactional
    fun saveLog(log: Log): LogDto {
        var randomId: Long
        do {
            randomId = SecureRandom().nextLong()
        } while(randomId<=0)
        val saveLog = logRepository.save(Log(randomId, log.user, log.timestamp, log.event))
        return LogDto(saveLog.id, saveLog.user, saveLog.timestamp, saveLog.event)
    }
}