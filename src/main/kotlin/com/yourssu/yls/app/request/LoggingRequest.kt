package com.yourssu.yls.app.request

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

class LoggingRequest(
    @field:NotBlank
    val user: String,
    @field:NotNull
    val event: EventRequest,
)

class EventRequest(
    @field:NotBlank
    val platform: String,
    @field:NotBlank
    val screen: String,
    @field:NotBlank
    val name: String,
    @field:NotBlank
    val keyword: String,
    @field:NotBlank
    val resultID: String,
)
