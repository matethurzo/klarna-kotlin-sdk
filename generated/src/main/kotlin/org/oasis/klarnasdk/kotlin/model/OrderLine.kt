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

import org.oasis.klarnasdk.kotlin.model.ProductIdentifiers
import org.oasis.klarnasdk.kotlin.model.Subscription

/**
 * 
 * @param image_url URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters).  A minimum of 250x250 px resolution is recommended for the image to look good in the Klarna app, and below 50x50 px won't even show. We recommend using a good sized image (650x650 px or more), however the file size must not exceed 12MB.
 * @param merchant_data Used for storing merchant's internal order number or other reference. Pass through field. (max 1024 characters)
 * @param name Descriptive name of the order line item.
 * @param product_identifiers Additional information identifying the order line item.
 * @param product_url URL to the product in the merchant’s webshop that can be later used in communications between Klarna and the customer. (max 1024 characters)
 * @param quantity Quantity of the order line item. Must be a non-negative number.
 * @param quantity_unit Unit used to describe the quantity, e.g. kg, pcs, etc. If defined the value has to be 1-8 characters.
 * @param reference Client facing article number, SKU or similar. Max length is 256 characters.
 * @param tax_rate Tax rate of the order line. Non-negative value. The percentage value is represented with two implicit decimals. I.e 1900 = 19%.
 * @param total_amount Total amount of the order line. Must be defined as non-negative minor units. Includes tax and discount. Eg: 2500=25 euros Value = (quantity x unit_price) - total_discount_amount.  (max value: 100000000)
 * @param total_discount_amount Non-negative minor units. Includes tax. Eg: 500=5 euros
 * @param total_tax_amount Total tax amount of the order line. Must be within ±1 of total_amount - total_amount 10000 / (10000 + tax_rate). Negative when type is discount.
 * @param type Type of the order line item. The possible values are:  physical discount shipping_fee sales_tax digital gift_card store_credit surcharge
 * @param unit_price Price for a single unit of the order line. Non-negative minor units. Includes tax, excludes discount. (max value: 100000000)
 * @param subscription Subscription details
 */
data class OrderLine (
    /* Descriptive name of the order line item. */
    val name: kotlin.String,
    /* Quantity of the order line item. Must be a non-negative number. */
    val quantity: kotlin.Long,
    /* Total amount of the order line. Must be defined as non-negative minor units. Includes tax and discount. Eg: 2500=25 euros Value = (quantity x unit_price) - total_discount_amount.  (max value: 100000000) */
    val total_amount: kotlin.Long,
    /* Price for a single unit of the order line. Non-negative minor units. Includes tax, excludes discount. (max value: 100000000) */
    val unit_price: kotlin.Long,
    /* URL to an image that can be later embedded in communications between Klarna and the customer. (max 1024 characters).  A minimum of 250x250 px resolution is recommended for the image to look good in the Klarna app, and below 50x50 px won't even show. We recommend using a good sized image (650x650 px or more), however the file size must not exceed 12MB. */
    val image_url: kotlin.String? = null,
    /* Used for storing merchant's internal order number or other reference. Pass through field. (max 1024 characters) */
    val merchant_data: kotlin.String? = null,
    /* Additional information identifying the order line item. */
    val product_identifiers: ProductIdentifiers? = null,
    /* URL to the product in the merchant’s webshop that can be later used in communications between Klarna and the customer. (max 1024 characters) */
    val product_url: kotlin.String? = null,
    /* Unit used to describe the quantity, e.g. kg, pcs, etc. If defined the value has to be 1-8 characters. */
    val quantity_unit: kotlin.String? = null,
    /* Client facing article number, SKU or similar. Max length is 256 characters. */
    val reference: kotlin.String? = null,
    /* Tax rate of the order line. Non-negative value. The percentage value is represented with two implicit decimals. I.e 1900 = 19%. */
    val tax_rate: kotlin.Long? = null,
    /* Non-negative minor units. Includes tax. Eg: 500=5 euros */
    val total_discount_amount: kotlin.Long? = null,
    /* Total tax amount of the order line. Must be within ±1 of total_amount - total_amount 10000 / (10000 + tax_rate). Negative when type is discount. */
    val total_tax_amount: kotlin.Long? = null,
    /* Type of the order line item. The possible values are:  physical discount shipping_fee sales_tax digital gift_card store_credit surcharge */
    val type: kotlin.String? = null,
    /* Subscription details */
    val subscription: Subscription? = null
) {

}

