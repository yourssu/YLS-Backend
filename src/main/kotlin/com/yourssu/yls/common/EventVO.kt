package com.yourssu.yls.common

import com.yourssu.yls.dto.EventDTO

data class EventVO(
    val platform: String,
    val screen: String,
    val name: String,
    val keyword: String,
    val resultID: String
) {
    companion object {
        fun from(dto: EventDTO): EventVO {
            return EventVO(
                platform = dto.platform,
                screen = dto.screen,
                name = dto.name,
                keyword = dto.keyword,
                resultID = dto.resultID
            )
        }
        fun toDto(vo: EventVO): EventDTO {
            return EventDTO(
                platform = vo.platform,
                screen = vo.screen,
                name = vo.name,
                keyword = vo.keyword,
                resultID = vo.resultID
            )
        }
    }
}