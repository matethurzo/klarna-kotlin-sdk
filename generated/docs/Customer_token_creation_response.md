
# CustomerTokenCreationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billing_address** | [**Address**](Address.md) | Provide the billing address of the customer, if you have collected already. If not, then Klarna will collect the details inside the iFrame before authorization. |  [optional]
**customer** | [**Customer**](Customer.md) | Object to provide the details of the customer making the payment. |  [optional]
**payment_method_reference** | **kotlin.String** | Used to connect customers with payment method when it is present. |  [optional]
**redirect_url** | **kotlin.String** | URL to redirect the customer to after placing the order. This is a Klarna URL where Klarna will place a cookie in the customer’s browser (if redirected) and redirect the customer back to the confirmation URL provided by the merchant. This is not a mandatory step but a recommended one to improve the returning customer’s experience. | 
**token_id** | **kotlin.String** | Generated customer token. This token will be used to create a new order for the subscription using the Create a New order using token API. | 



