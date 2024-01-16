package com.yourssu.yls.domain.model.document

import com.yourssu.yls.domain.model.nested.EventVO
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

//    @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssZ", timezone = "GMT+8")
//    @JsonSerialize(using = LocalDateTimeSerializer::class)
//    @JsonDeserialize(using = LocalDateTimeDeserializer::class)

@Document(indexName = "logs")
class LogDocument(
    @Id
    private val id: String? = null,
    val user: String,
//    @Field(type = FieldType.Date, format = [DateFormat.date_time])
    val timestamp: String,
    @Field(type = FieldType.Nested)
    val event: EventVO,
)
