package com.yourssu.yls.global.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
@EnableWebMvc
class CorsConfig: WebMvcConfigurer {

    @Value("\${server.baseUrl}")
    private val YLS_URL = ""

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
                .allowedOrigins(YLS_URL)
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("**")
                .allowCredentials(false)
    }
}