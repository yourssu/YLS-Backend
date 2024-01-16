package com.yourssu.yls.app.controller

import com.yourssu.yls.app.request.LoggingRequest
import com.yourssu.yls.domain.service.LoggingService
import com.yourssu.yls.global.dto.ResponseDTO
import jakarta.validation.Valid
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/log")
class LoggingController(
    private val loggingService: LoggingService,
) {
    @PostMapping("/write")
    fun writeLog(
        @RequestBody @Valid request: LoggingRequest,
    ): ResponseDTO<Void> {
        loggingService.writeLog(request)

        return ResponseDTO.success("logging 저장 성공: 성공적으로 저장되었습니다.")
    }
}
