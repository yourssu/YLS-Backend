package com.yourssu.yls.config

import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories


@Configuration
//@EnableElasticsearchRepositories
class ElasticSearchConfig : ElasticsearchConfiguration() {

    private val elasticUrl = "localhost:9200"

    override fun clientConfiguration(): ClientConfiguration {
        return ClientConfiguration.builder()
                .connectedTo(elasticUrl)
                .build()
    }

}