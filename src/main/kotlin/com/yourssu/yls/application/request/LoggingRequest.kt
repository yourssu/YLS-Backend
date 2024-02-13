package com.yourssu.yls.application.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class LoggingRequest(
    @field:NotBlank
    val hashedID: String,
    @field:NotNull
    val timestamp: String,
    @field:NotNull
    val event: Map<String, String>,
)
