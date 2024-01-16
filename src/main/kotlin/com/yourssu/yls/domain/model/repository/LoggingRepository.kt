package com.yourssu.yls.domain.model.repository

import com.yourssu.yls.domain.model.document.LogDocument
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface LoggingRepository : ElasticsearchRepository<LogDocument, String>
