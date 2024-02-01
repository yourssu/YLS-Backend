package com.yourssu.yls.application.request

import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size

class LogListRequest(
    @NotNull(message = "")
    @Size(min = 1, max = 10, message = "로그 생성 실패: 로그는 한 번에 1개~10개까지만 받을 수 있습니다.")
    val logRequestList: List<LoggingRequest>,
)
