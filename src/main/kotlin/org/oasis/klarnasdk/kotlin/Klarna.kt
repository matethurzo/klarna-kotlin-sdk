package org.oasis.klarnasdk.kotlin

import org.oasis.klarnasdk.kotlin.klarnapayments.KlarnaPaymentsApi
import org.oasis.klarnasdk.kotlin.klarnapayments.KlarnaPaymentsApiImpl
import org.oasis.klarnasdk.kotlin.model.MerchantSession
import org.oasis.klarnasdk.kotlin.model.Session
import org.oasis.klarnasdk.kotlin.ordermanagement.OrderManagementApi
import org.oasis.klarnasdk.kotlin.ordermanagement.OrderManagementApiImpl

fun Klarna(init: Klarna.() -> Unit): Klarna {
    val klarna = Klarna(KlarnaPaymentsApiImpl(), OrderManagementApiImpl())
    klarna.init()
    return klarna
}

class Klarna(
    kpApi: KlarnaPaymentsApi,
    omApi: OrderManagementApi
) : KlarnaPaymentsApi by kpApi, OrderManagementApi by omApi {

    private lateinit var config: KlarnaConfiguration
    private val kpApi: KlarnaPaymentsApi
    private val omApi: OrderManagementApi

    init {
        this.kpApi = kpApi
        this.omApi = omApi
    }

    fun configuration(init: KlarnaConfiguration.() -> Unit) {
        val config = KlarnaConfiguration()
        config.init()

        this.config = config
    }

    fun createCreditSession(
        createSessionRequest: Session
    ): KlarnaResult<MerchantSession> =
        kpApi.createCreditSession(createSessionRequest) {
            this.config
        }

    override fun createCreditSession(
        createSessionRequest: Session,
        configLambda: () -> KlarnaConfiguration
    ): KlarnaResult<MerchantSession> =
        kpApi.createCreditSession(createSessionRequest) {
            configLambda.invoke().let {
                this.config.mergeConfiguration(it)
            }
        }

    fun readCreditSession(
        sessionId: String
    ): KlarnaResult<Session> =
        kpApi.readCreditSession(sessionId) {
            this.config
        }

    override fun readCreditSession(
        sessionId: String,
        configLambda: () -> KlarnaConfiguration
    ): KlarnaResult<Session> =
        kpApi.readCreditSession(sessionId) {
            configLambda.invoke().let {
                this.config.mergeConfiguration(it)
            }
        }

}