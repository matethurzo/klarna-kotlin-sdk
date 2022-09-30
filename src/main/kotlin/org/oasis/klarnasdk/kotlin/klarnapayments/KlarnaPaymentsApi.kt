package org.oasis.klarnasdk.kotlin.klarnapayments

import com.squareup.moshi.adapter
import okhttp3.MediaType
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.RequestBody.Companion.toRequestBody
import org.oasis.klarnasdk.kotlin.ErrorMessage
import org.oasis.klarnasdk.kotlin.KlarnaConfiguration
import org.oasis.klarnasdk.kotlin.KlarnaResult
import org.oasis.klarnasdk.kotlin.ResultCode.*
import org.oasis.klarnasdk.kotlin.model.MerchantSession
import org.oasis.klarnasdk.kotlin.model.Session
import org.oasis.klarnasdk.kotlin.util.HttpClientProvider
import org.oasis.klarnasdk.kotlin.util.MoshiProvider
import org.oasis.klarnasdk.kotlin.util.basicAuth
import org.oasis.klarnasdk.kotlin.util.klarnaHeaders

interface KlarnaPaymentsApi {
    fun createCreditSession(
        createSessionRequest: Session,
        configLambda: () -> KlarnaConfiguration
    ): KlarnaResult<MerchantSession>

    fun readCreditSession(
        sessionId: String,
        configLambda: () -> KlarnaConfiguration
    ): KlarnaResult<Session>
}

class KlarnaPaymentsApiImpl: KlarnaPaymentsApi {

    @OptIn(ExperimentalStdlibApi::class)
    override fun createCreditSession(
        createSessionRequest: Session,
        configLambda: () -> KlarnaConfiguration
    ): KlarnaResult<MerchantSession> {
        val config = configLambda.invoke()

        val adapter = MoshiProvider.get().adapter<Session>()
        val bodyJson = adapter.toJson(createSessionRequest)

        val request = Request.Builder()
            .post(bodyJson.toRequestBody("application/json".toMediaType()))
            .url("${config.klarnaEndpoint()}/payments/v1/sessions")
            .klarnaHeaders()
            .basicAuth(config.credentials.first, config.credentials.second)
            .build()

        val response = HttpClientProvider
            .get()
            .newCall(request)
            .execute()

        return response.let {
            when (it.code) {
                200 -> {
                    response.body?.let { body ->
                        val adapter = MoshiProvider.get().adapter<MerchantSession>()
                        KlarnaResult(resultCode = SUCCESS, result = adapter.fromJson(body.string()))
                    } ?: KlarnaResult(resultCode = GENERIC_ERROR, message = "Call from response was empty")
                }
                else -> {
                    KlarnaResult(resultCode = GENERIC_ERROR, message = "")
                }
            }
        }
    }

    @OptIn(ExperimentalStdlibApi::class)
    override fun readCreditSession(
        sessionId: String,
        configLambda: () -> KlarnaConfiguration
    ): KlarnaResult<Session> {
        val config = configLambda.invoke()

        val request = Request.Builder()
            .get()
            .url("${config.klarnaEndpoint()}/payments/v1/sessions/$sessionId")
            .klarnaHeaders()
            .basicAuth(config.credentials.first, config.credentials.second)
            .build()

        val response = HttpClientProvider
            .get()
            .newCall(request)
            .execute()

        return response.let {
            when (it.code) {
                200 -> {
                    response.body?.let { body ->
                        val adapter = MoshiProvider.get().adapter<Session>()
                        KlarnaResult(resultCode = SUCCESS, result = adapter.fromJson(body.string()))
                    }?: KlarnaResult(resultCode = GENERIC_ERROR, message = "Call response was empty")
                }
                403 -> KlarnaResult(resultCode = NOT_AUTHORIZED)
                404 -> KlarnaResult(resultCode = NOT_FOUND)
                else -> KlarnaResult(resultCode = GENERIC_ERROR, message = "Call response was empty")
            }
        }
    }

}