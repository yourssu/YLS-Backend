package com.yourssu.yls.controller

import com.yourssu.yls.common.LogDto
import com.yourssu.yls.entity.Log
import com.yourssu.yls.service.LogService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/log")
class LogController(
    private val logService: LogService
) {
    @GetMapping
    fun getLog(@RequestParam id: Long): LogDto {
        return logService.searchById(id)
    }

    @PutMapping
    fun addLog(@RequestBody log: Log): LogDto {
        return logService.saveLog(log)
    }
}