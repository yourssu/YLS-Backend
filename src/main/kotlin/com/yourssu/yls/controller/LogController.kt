package com.yourssu.yls.controller

import com.yourssu.yls.dto.LogDTO
import com.yourssu.yls.reqeust.LogRequest
import com.yourssu.yls.service.LogService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
class LogController(
    private val logService: LogService
) {
    @GetMapping("/logs")
    fun getLogs(
        @RequestParam(defaultValue = "0") page: Int,
        @RequestParam(defaultValue = "10") size: Int
    ): ResponseEntity<List<LogDTO>> {
        val logs = logService.getLogs(page, size)
        return ResponseEntity.ok(logs)
    }

    @PostMapping("/logs")
    fun saveLog(
        @RequestBody logRequest: LogRequest
    ) {
        val logDTO = LogDTO.from(logRequest)
        logService.saveLog(logDTO)
    }
}