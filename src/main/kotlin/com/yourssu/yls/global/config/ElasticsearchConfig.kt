package com.yourssu.yls.global.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Configuration
@EnableElasticsearchRepositories
class ElasticsearchConfig(
    @Value("\${es.id}")
    val user: String,
    @Value("\${es.password}")
    val password: String,
    @Value("\${es.endpoint}")
    val endpoint: String,
) : ElasticsearchConfiguration() {
    override fun clientConfiguration(): ClientConfiguration {
        return ClientConfiguration
            .builder()
            .connectedTo(endpoint)
            .withBasicAuth(user, password)
            .build()
    }
}
