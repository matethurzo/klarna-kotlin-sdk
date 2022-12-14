/**
* Klarna Payments API V1
* API spec
*
* OpenAPI spec version: 1.0.0
* 
*
* NOTE: This class is auto generated by the swagger code generator program.
* https://github.com/swagger-api/swagger-codegen.git
* Do not edit the class manually.
*/
package org.oasis.klarnasdk.kotlin.model

import org.oasis.klarnasdk.kotlin.model.PaymentMethodCategory

/**
 * 
 * @param client_token Client token to be passed to the JS client while initializing the JS SDK in the next step.
 * @param payment_method_categories Available payment method categories for this particular session
 * @param session_id ID of the created session. Please use this ID to share with Klarna for identifying any issues during integration.
 */
data class MerchantSession (
    /* Client token to be passed to the JS client while initializing the JS SDK in the next step. */
    val client_token: kotlin.String,
    /* ID of the created session. Please use this ID to share with Klarna for identifying any issues during integration. */
    val session_id: kotlin.String,
    /* Available payment method categories for this particular session */
    val payment_method_categories: kotlin.Array<PaymentMethodCategory>? = null
) {

}

