package com.yourssu.yls.global.dto

class ResponseDto<T>(
    val success: Boolean,
    val result: T?,
) {
    companion object {
        fun <T> success(result: T): ResponseDto<T> {
            return ResponseDto(
                success = true,
                result = result,
            )
        }

        fun <T> success(): ResponseDto<T> {
            return ResponseDto(
                success = true,
                result = null,
            )
        }

        fun <T> fail(result: T): ResponseDto<T> {
            return ResponseDto(
                success = false,
                result = result,
            )
        }

        fun <T> fail(): ResponseDto<T> {
            return ResponseDto(
                success = false,
                result = null,
            )
        }
    }
}
