package com.yourssu.yls.domain.model.document

import com.yourssu.yls.domain.model.nested.EventVO
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
