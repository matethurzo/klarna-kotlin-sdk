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

import org.oasis.klarnasdk.kotlin.model.Address
import org.oasis.klarnasdk.kotlin.model.Customer

import com.squareup.moshi.Json
/**
 * 
 * @param billing_address Once the customer has provided any data, updates to this object will be ignored (without generating an error).
 * @param customer Information about the liable customer of the order.
 * @param description Description of the purpose of the token.
 * @param intended_use Intended use for the token.
 * @param locale RFC 1766 customer's locale.
 * @param purchase_country ISO 3166 alpha-2 purchase country.
 * @param purchase_currency ISO 4217 purchase currency.
 */
data class CustomerTokenCreationRequest (
    /* Description of the purpose of the token. */
    val description: kotlin.String,
    /* Intended use for the token. */
    val intended_use: CustomerTokenCreationRequest.IntendedUse,
    /* RFC 1766 customer's locale. */
    val locale: kotlin.String,
    /* ISO 3166 alpha-2 purchase country. */
    val purchase_country: kotlin.String,
    /* ISO 4217 purchase currency. */
    val purchase_currency: kotlin.String,
    /* Once the customer has provided any data, updates to this object will be ignored (without generating an error). */
    val billing_address: Address? = null,
    /* Information about the liable customer of the order. */
    val customer: Customer? = null
) {

    /**
    * Intended use for the token.
    * Values: sUBSCRIPTION
    */
    enum class IntendedUse(val value: kotlin.String){
    
        @Json(name = "SUBSCRIPTION") sUBSCRIPTION("SUBSCRIPTION");
    
    }

}

