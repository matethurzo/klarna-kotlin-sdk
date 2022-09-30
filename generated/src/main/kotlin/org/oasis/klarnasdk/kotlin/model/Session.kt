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
import org.oasis.klarnasdk.kotlin.model.Attachment
import org.oasis.klarnasdk.kotlin.model.Customer
import org.oasis.klarnasdk.kotlin.model.MerchantUrls
import org.oasis.klarnasdk.kotlin.model.Options
import org.oasis.klarnasdk.kotlin.model.OrderLine
import org.oasis.klarnasdk.kotlin.model.PaymentMethodCategory

import com.squareup.moshi.Json
/**
 * 
 * @param acquiring_channel The acquiring channel in which the session takes place. Ecommerce is default unless specified. Any other values should be defined in the agreement.
 * @param attachment Extra Merchant Data (additional information) required for additional risk check. The required parameters will be described in the appendix of contract agreement.
 * @param authorization_token Authorization token.
 * @param billing_address Provide the billing address of the customer, if you have collected already. If not, then Klarna will collect the details inside the iFrame before authorization.
 * @param client_token Token to be passed to the JS client
 * @param custom_payment_method_ids Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications. 
 * @param customer Object to provide the details of the customer making the payment.
 * @param design Design package to use in the session. This can only by used if a custom design has been implemented for Klarna Payments and agreed upon in the agreement. It might have a financial impact. Delivery manager will provide the value for the parameter.
 * @param expires_at Session expiration date
 * @param locale Used to define the language and region of the customer. The locale follows the format of RFC 1766, meaning language-country The following values are applicable:  AT: \"de-AT\", \"de-DE\", \"en-DE\" BE: \"be-BE\", \"nl-BE\", \"fr-BE\", \"en-BE\" CH: \"it-CH\", \"de-CH\", \"fr-CH\", \"en-CH\" DE: \"de-DE\", \"de-AT\", \"en-DE\" DK: \"da-DK\", \"en-DK\" ES: \"es-ES\", \"ca-ES\", \"en-ES\" FI: \"fi-FI\", \"sv-FI\", \"en-FI\" GB: \"en-GB\" IT: \"it-IT\", \"en-IT\" NL: \"nl-NL\", \"en-NL\" NO: \"nb-NO\", \"en-NO\" PL: \"pl-PL\", \"en-PL\" SE: \"sv-SE\", \"en-SE\" US: \"en-US\"
 * @param merchant_data Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters)
 * @param merchant_reference1 Used for storing merchant's internal order number or other reference. If set, will be shown on the confirmation page as \"order number\" and send to the customer in the confirmation mail after a successful direct bank transfer payment. It will also be included in the payments description in the customer's bank account and settlement files to the merchant (max 255 characters).
 * @param merchant_reference2 Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters).
 * @param merchant_urls Used to send in the different merchant URLs that Klarna needs at different stages of the process.
 * @param options Design customization options for the Klarna Payments iframe. The design options are limited to changing colors. It is not possible to change the font or other designs at the moment.
 * @param order_amount Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
 * @param order_lines The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order.
 * @param order_tax_amount Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500.
 * @param payment_method_categories Available payment method categories
 * @param purchase_country The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc.
 * @param purchase_currency The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc.
 * @param shipping_address The shipping address of the consumer. Please note that this is not needed unless the customer has explicitly chosen to enter a separate shipping address. Otherwise the billing address will be automatically cloned.
 * @param status The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed.
 */
data class Session (
    /* Used to define the language and region of the customer. The locale follows the format of RFC 1766, meaning language-country The following values are applicable:  AT: \"de-AT\", \"de-DE\", \"en-DE\" BE: \"be-BE\", \"nl-BE\", \"fr-BE\", \"en-BE\" CH: \"it-CH\", \"de-CH\", \"fr-CH\", \"en-CH\" DE: \"de-DE\", \"de-AT\", \"en-DE\" DK: \"da-DK\", \"en-DK\" ES: \"es-ES\", \"ca-ES\", \"en-ES\" FI: \"fi-FI\", \"sv-FI\", \"en-FI\" GB: \"en-GB\" IT: \"it-IT\", \"en-IT\" NL: \"nl-NL\", \"en-NL\" NO: \"nb-NO\", \"en-NO\" PL: \"pl-PL\", \"en-PL\" SE: \"sv-SE\", \"en-SE\" US: \"en-US\" */
    val locale: kotlin.String,
    /* Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500. */
    val order_amount: kotlin.Long,
    /* The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order. */
    val order_lines: kotlin.Array<OrderLine>,
    /* The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc. */
    val purchase_country: kotlin.String,
    /* The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc. */
    val purchase_currency: kotlin.String,
    /* The acquiring channel in which the session takes place. Ecommerce is default unless specified. Any other values should be defined in the agreement. */
    val acquiring_channel: Session.AcquiringChannel? = null,
    /* Extra Merchant Data (additional information) required for additional risk check. The required parameters will be described in the appendix of contract agreement. */
    val attachment: Attachment? = null,
    /* Authorization token. */
    val authorization_token: kotlin.String? = null,
    /* Provide the billing address of the customer, if you have collected already. If not, then Klarna will collect the details inside the iFrame before authorization. */
    val billing_address: Address? = null,
    /* Token to be passed to the JS client */
    val client_token: kotlin.String? = null,
    /* Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications.  */
    val custom_payment_method_ids: kotlin.Array<kotlin.String>? = null,
    /* Object to provide the details of the customer making the payment. */
    val customer: Customer? = null,
    /* Design package to use in the session. This can only by used if a custom design has been implemented for Klarna Payments and agreed upon in the agreement. It might have a financial impact. Delivery manager will provide the value for the parameter. */
    val design: kotlin.String? = null,
    /* Session expiration date */
    val expires_at: java.time.LocalDateTime? = null,
    /* Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters) */
    val merchant_data: kotlin.String? = null,
    /* Used for storing merchant's internal order number or other reference. If set, will be shown on the confirmation page as \"order number\" and send to the customer in the confirmation mail after a successful direct bank transfer payment. It will also be included in the payments description in the customer's bank account and settlement files to the merchant (max 255 characters). */
    val merchant_reference1: kotlin.String? = null,
    /* Used for storing merchant's internal order number or other reference. The value is available in the settlement files. (max 255 characters). */
    val merchant_reference2: kotlin.String? = null,
    /* Used to send in the different merchant URLs that Klarna needs at different stages of the process. */
    val merchant_urls: MerchantUrls? = null,
    /* Design customization options for the Klarna Payments iframe. The design options are limited to changing colors. It is not possible to change the font or other designs at the moment. */
    val options: Options? = null,
    /* Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500. */
    val order_tax_amount: kotlin.Long? = null,
    /* Available payment method categories */
    val payment_method_categories: kotlin.Array<PaymentMethodCategory>? = null,
    /* The shipping address of the consumer. Please note that this is not needed unless the customer has explicitly chosen to enter a separate shipping address. Otherwise the billing address will be automatically cloned. */
    val shipping_address: Address? = null,
    /* The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed. */
    val status: Session.Status? = null
) {

    /**
    * The acquiring channel in which the session takes place. Ecommerce is default unless specified. Any other values should be defined in the agreement.
    * Values: eCOMMERCE,iNSTORE,tELESALES
    */
    enum class AcquiringChannel(val value: kotlin.String){
    
        @Json(name = "ECOMMERCE") eCOMMERCE("ECOMMERCE"),
    
        @Json(name = "IN_STORE") iNSTORE("IN_STORE"),
    
        @Json(name = "TELESALES") tELESALES("TELESALES");
    
    }

    /**
    * The current status of the session. Possible values: 'complete', 'incomplete' where 'complete' is set when the order has been placed.
    * Values: complete,incomplete
    */
    enum class Status(val value: kotlin.String){
    
        @Json(name = "complete") complete("complete"),
    
        @Json(name = "incomplete") incomplete("incomplete");
    
    }

}
