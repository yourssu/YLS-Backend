package com.yourssu.yls.domain.model.document

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = "logs")
class LogDocument(
    @Id
    private val id: String? = null,
    val user: String,
    val timestamp: String,
    @Field(type = FieldType.Nested)
    val event: Map<String, String>,
)
