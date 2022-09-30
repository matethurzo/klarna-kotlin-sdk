
# MerchantUrls

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**confirmation** | **kotlin.String** | URL of the merchant confirmation page. The consumer will be redirected back to the confirmation page if the consumer is sent to the redirect URL after placing the order. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL(max 2000 characters). |  [optional]
**notification** | **kotlin.String** | URL for notifications on pending orders. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL (max 2000 characters). |  [optional]
**push** | **kotlin.String** | URL that will be requested when an order is completed. Should be different than checkout and confirmation URLs. Insert {session.id} and/or {order.id} as placeholder to connect either of those IDs to the URL (max 2000 characters). |  [optional]
**authorization** | **kotlin.String** | URL for receiving the authorization token when payment is completed. Used for Authorization Callback. |  [optional]



