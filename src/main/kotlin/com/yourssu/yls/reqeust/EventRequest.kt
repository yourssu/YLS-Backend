package com.yourssu.yls.reqeust

data class EventRequest(
    val platform: String,
    val screen: String,
    val name: String,
    val keyword: String,
    val resultID: String
)