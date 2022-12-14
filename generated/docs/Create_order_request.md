
# CreateOrderRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**authorization_token** | **kotlin.String** | Authorization token. |  [optional]
**auto_capture** | **kotlin.Boolean** | Allow merchant to trigger auto capturing. |  [optional]
**billing_address** | [**Address**](Address.md) | Provide the billing address of the customer, if you have collected already. If not, then Klarna will collect the details inside the iFrame before authorization. |  [optional]
**custom_payment_method_ids** | **kotlin.Array&lt;kotlin.String&gt;** | Promo codes - The array could be used to define which of the configured payment options within a payment category (pay_later, pay_over_time, etc.) should be shown for this purchase. Discuss with the delivery manager to know about the promo codes that will be configured for your account. The feature could also be used to provide promotional offers to specific customers (eg: 0% financing). Please be informed that the usage of this feature can have commercial implications.  |  [optional]
**customer** | [**Customer**](Customer.md) | Object to provide the details of the customer making the payment. |  [optional]
**locale** | **kotlin.String** | Used to define the language and region of the customer. The locale follows the format of RFC 1766, meaning language-country The following values are applicable:  AT: \&quot;de-AT\&quot;, \&quot;de-DE\&quot;, \&quot;en-DE\&quot; BE: \&quot;be-BE\&quot;, \&quot;nl-BE\&quot;, \&quot;fr-BE\&quot;, \&quot;en-BE\&quot; CH: \&quot;it-CH\&quot;, \&quot;de-CH\&quot;, \&quot;fr-CH\&quot;, \&quot;en-CH\&quot; DE: \&quot;de-DE\&quot;, \&quot;de-AT\&quot;, \&quot;en-DE\&quot; DK: \&quot;da-DK\&quot;, \&quot;en-DK\&quot; ES: \&quot;es-ES\&quot;, \&quot;ca-ES\&quot;, \&quot;en-ES\&quot; FI: \&quot;fi-FI\&quot;, \&quot;sv-FI\&quot;, \&quot;en-FI\&quot; GB: \&quot;en-GB\&quot; IT: \&quot;it-IT\&quot;, \&quot;en-IT\&quot; NL: \&quot;nl-NL\&quot;, \&quot;en-NL\&quot; NO: \&quot;nb-NO\&quot;, \&quot;en-NO\&quot; PL: \&quot;pl-PL\&quot;, \&quot;en-PL\&quot; SE: \&quot;sv-SE\&quot;, \&quot;en-SE\&quot; US: \&quot;en-US\&quot; | 
**merchant_data** | **kotlin.String** | Pass through field to send any information about the order to be used later for reference while retrieving the order details (max 6000 characters) |  [optional]
**merchant_reference1** | **kotlin.String** | Used for storing merchant&#39;s internal order number or other reference. If set, will be shown on the confirmation page as \&quot;order number\&quot; and send to the customer in the confirmation mail after a successful direct bank transfer payment. It will also be included in the payments description in the customer&#39;s bank account and settlement files to the merchant (max 255 characters). |  [optional]
**merchant_reference2** | **kotlin.String** | Used for storing merchant&#39;s internal order number or other reference. The value is available in the settlement files. (max 255 characters). |  [optional]
**merchant_urls** | [**MerchantUrls**](MerchantUrls.md) | Used to send in the different merchant URLs that Klarna needs at different stages of the process. |  [optional]
**order_amount** | **kotlin.Long** | Total amount of the order including tax and any available discounts. The value should be in non-negative minor units. Eg: 25 Euros should be 2500. | 
**order_lines** | [**kotlin.Array&lt;OrderLine&gt;**](OrderLine.md) | The array containing list of line items that are part of this order. Maximum of 1000 line items could be processed in a single order. | 
**order_tax_amount** | **kotlin.Long** | Total tax amount of the order. The value should be in non-negative minor units. Eg: 25 Euros should be 2500. |  [optional]
**payment_method_categories** | [**kotlin.Array&lt;PaymentMethodCategory&gt;**](PaymentMethodCategory.md) | Available payment method categories |  [optional]
**purchase_country** | **kotlin.String** | The purchase country of the customer. The billing country always overrides purchase country if the values are different. Formatted according to ISO 3166 alpha-2 standard, e.g. GB, SE, DE, US, etc. | 
**purchase_currency** | **kotlin.String** | The purchase currency of the order. Formatted according to ISO 4217 standard, e.g. USD, EUR, SEK, GBP, etc. | 
**shipping_address** | [**Address**](Address.md) | The shipping address of the consumer. Please note that this is not needed unless the customer has explicitly chosen to enter a separate shipping address. Otherwise the billing address will be automatically cloned. |  [optional]
**status** | [**inline**](#StatusEnum) | The current status of the session. Possible values: &#39;complete&#39;, &#39;incomplete&#39; where &#39;complete&#39; is set when the order has been placed. |  [optional]


<a name="StatusEnum"></a>
## Enum: status
Name | Value
---- | -----
status | complete, incomplete



