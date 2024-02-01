package com.yourssu.yls.application.controller

import com.yourssu.yls.application.request.LogListRequest
import com.yourssu.yls.application.request.LoggingRequest
import com.yourssu.yls.application.response.LoggingResponse
import com.yourssu.yls.domain.service.LoggingService
import com.yourssu.yls.global.dto.ResponseDto
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/log")
class LoggingController(
    private val loggingService: LoggingService,
) {
    @PutMapping
    fun writeLog(
        @RequestBody @Valid request: LoggingRequest,
    ): ResponseDto<LoggingResponse> {
        return ResponseDto.success(loggingService.writeLog(request))
    }

    @PutMapping("/list")
    fun writeLogUsingList(
        @RequestBody @Valid request: LogListRequest,
    ): ResponseDto<Void> {
        loggingService.writeLogUsingList(request)
        return ResponseDto.success()
    }
}
