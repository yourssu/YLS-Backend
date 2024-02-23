package com.yourssu.yls.global.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

    @Value("${server.baseUrl}")
    private final String YLS_URL = "";

    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(YLS_URL)
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("**")
                .allowCredentials(true);
    }
}
