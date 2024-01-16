package com.yourssu.yls.repository

import com.yourssu.yls.entity.Log
import org.springframework.data.domain.Pageable
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface LogRepository: ElasticsearchRepository<Log, String>, CrudRepository<Log, String> {
}