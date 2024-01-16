package com.yourssu.yls.config

import org.elasticsearch.client.RestHighLevelClient
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.RestClients
import org.springframework.data.elasticsearch.core.ElasticsearchOperations
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate

@Configuration
class ElasticsearchConfig {
    @Value("\${spring.elasticsearch.rest.uris}")
    private val elasticUrl: String? = null
    @Bean(destroyMethod = "close")
    fun client(): RestHighLevelClient {
        val clientConfiguration = ClientConfiguration.builder()
            .connectedTo(elasticUrl)
            .build()

        return RestClients.create(clientConfiguration).rest()
    }

    @Bean
    fun elasticsearchTemplate(): ElasticsearchOperations {
        return ElasticsearchRestTemplate(client())
    }
}
