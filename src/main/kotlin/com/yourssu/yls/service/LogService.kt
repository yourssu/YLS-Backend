package com.yourssu.yls.service

import com.yourssu.yls.dto.LogDTO
import com.yourssu.yls.entity.Log
import com.yourssu.yls.repository.LogRepository
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class LogService(
    private val logRepository: LogRepository
) {
    fun getLogs(page: Int, size: Int): List<LogDTO> {
        val pageable = PageRequest.of(page, size)
        val logs = logRepository.findAll(pageable)
        return logs.content.map { Log.toDto(it) }
    }
    @Transactional
    fun saveLog(logDTO: LogDTO) {
        val log = Log.from(logDTO)
        logRepository.save(log)
    }
}