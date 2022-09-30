package com.oasis.klarnasdk.kotlin

import org.junit.jupiter.api.Test
import org.oasis.klarnasdk.kotlin.Klarna
import org.oasis.klarnasdk.kotlin.Region.Companion.eu
import kotlin.test.assertEquals

internal class KlarnaPaymentsApiTest {

    @Test
    fun `test payment api`() {
        assertEquals(1, 1)
    }

    @Test
    fun `test read an existing credit session happy path`() {
        val session = Klarna {
            configuration {
                credentials {
                    "username" to "password"
                }
                region {
                    eu
                }
                testMode {
                    true
                }
            }
        }.readCreditSession("43b81eb8-bc23-48bf-8922-40d21c27e7dd")

        session.result?.let {
            println(it.expires_at)
            println(it.merchant_reference1)
        }
    }
}