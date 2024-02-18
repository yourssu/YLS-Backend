package com.yourssu.yls.global.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class SwaggerConfig(
    @Value("\${springdoc.version}")
    private val version: String,
) {
    @Bean
    fun openAPI(): OpenAPI {
        val info =
            Info()
                .title("Yourssu Logging System API")
                .version(version)
                .description("Yourssu Logging System API 문서입니다.")

        return OpenAPI()
            .info(info)
    }
}
