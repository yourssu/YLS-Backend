package com.yourssu.yls.entity

import com.yourssu.yls.common.EventVO
import com.yourssu.yls.common.Indexes
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document

@Document(indexName = Indexes.TEST_INDEX)
data class Log(
    @field:Id
    val id: Long,
    val user: String,
    val timestamp: String,
    val event: EventVO
)