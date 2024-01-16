package com.yourssu.yls.repository

import com.yourssu.yls.entity.Log
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface LogRepository: ElasticsearchRepository<Log, Long>