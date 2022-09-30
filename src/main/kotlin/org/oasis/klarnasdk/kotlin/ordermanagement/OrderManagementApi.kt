package org.oasis.klarnasdk.kotlin.ordermanagement

import org.oasis.klarnasdk.kotlin.KlarnaConfiguration

interface OrderManagementApi {
    fun getOrder(
        orderId: String,
        configLambda: () -> KlarnaConfiguration
    )
}

class OrderManagementApiImpl: OrderManagementApi {

    override fun getOrder(orderId: String, configLambda: () -> KlarnaConfiguration) {
        TODO("Not yet implemented")
    }

}