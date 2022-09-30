package org.oasis.klarnasdk.kotlin

data class ErrorMessage(
    var errorCode: String? = null,
    var errorMessage: String? = null,
    var errorMessages: List<String?>? = null,
    var correlationId: String? = null,
    var serviceVersion: String? = null
)

enum class ResultCode {
    SUCCESS,
    GENERIC_ERROR,
    NOT_AUTHORIZED,
    NOT_FOUND,
    SESSION_CANNOT_BE_CREATED, // 400 create session
    SESSION_CANNOT_BE_UPDATED, // 400 update session
    AUTHORIZATION_CANCELLED, // 204 delete auth
    TOKEN_CREATED, // 200 create token
    TOKEN_CANNOT_BE_CREATED, // 400 create token
    AUTHORIZATION_NOT_FOUND, // 404 create token
    CREATE_TOKEN_CONFLICT, // 409 create token request data conflicts with session
    CREATE_ORDER_CONFLICT, // 409 create order data conflicts with session
}

class KlarnaResult<T>(
    val resultCode: ResultCode,
    val message: String? = "",
    val result: T? = null
) {

    companion object {

//        fun genericError(errorMessage: String): KlarnaResult =
//            KlarnaResult(ResultCode.GENERIC_ERROR, errorMessage)

    }

}