package com.yourssu.yls.entity

import com.yourssu.yls.common.EventVO
import com.yourssu.yls.dto.LogDTO
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.annotation.Id
import java.util.*

@Document(indexName = "logs")
class Log(
    @Id
    val id: String,
    val user: String,
    val timestamp: String,
    val event: EventVO
) {
    companion object {
        fun from(dto: LogDTO): Log {
            return Log(
                id = UUID.randomUUID().toString(),
                user = dto.user,
                timestamp = dto.timestamp,
                event = EventVO.from(dto.event)
            )
        }

        fun toDto(log: Log): LogDTO {
            return LogDTO(
                user = log.user,
                timestamp = log.timestamp,
                event = EventVO.toDto(log.event)
            )
        }
    }
}
