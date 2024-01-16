package com.yourssu.yls.global.dto

class ResponseDTO<T>(
    val success: Boolean,
    val message: String?,
    val result: T?,
) {
    companion object {
        fun <T> success(
            message: String,
            result: T,
        ): ResponseDTO<T> {
            return ResponseDTO(
                success = true,
                message = message,
                result = result,
            )
        }

        fun <T> success(message: String): ResponseDTO<T> {
            return ResponseDTO(
                success = true,
                message = message,
                result = null,
            )
        }

        fun <T> success(result: T): ResponseDTO<T> {
            return ResponseDTO(
                success = true,
                message = null,
                result = result,
            )
        }

        fun <T> fail(
            message: String,
            result: T,
        ): ResponseDTO<T> {
            return ResponseDTO(
                success = false,
                message = message,
                result = result,
            )
        }

        fun <T> fail(message: String): ResponseDTO<T> {
            return ResponseDTO(
                success = false,
                message = message,
                result = null,
            )
        }

        fun <T> fail(result: T): ResponseDTO<T> {
            return ResponseDTO(
                success = false,
                message = null,
                result = result,
            )
        }
    }
}
