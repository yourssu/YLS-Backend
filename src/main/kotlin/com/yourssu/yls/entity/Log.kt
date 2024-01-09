package com.yourssu.yls.entity

import com.yourssu.yls.common.EventVO
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = "logs")
class Log(
    val user: String,
    val timestamp: String,
    val event: EventVO
)