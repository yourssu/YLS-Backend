package com.yourssu.yls.entity

import com.yourssu.yls.common.EventVO
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = "logs")
class Log(
    private val user: String,
    private val timestamp: String,
    @Field(type = FieldType.Nested)
    private val event: EventVO,
)
