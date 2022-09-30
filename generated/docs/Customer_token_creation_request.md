
# CustomerTokenCreationRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**billing_address** | [**Address**](Address.md) | Once the customer has provided any data, updates to this object will be ignored (without generating an error). |  [optional]
**customer** | [**Customer**](Customer.md) | Information about the liable customer of the order. |  [optional]
**description** | **kotlin.String** | Description of the purpose of the token. | 
**intended_use** | [**inline**](#Intended_useEnum) | Intended use for the token. | 
**locale** | **kotlin.String** | RFC 1766 customer&#39;s locale. | 
**purchase_country** | **kotlin.String** | ISO 3166 alpha-2 purchase country. | 
**purchase_currency** | **kotlin.String** | ISO 4217 purchase currency. | 


<a name="Intended_useEnum"></a>
## Enum: intended_use
Name | Value
---- | -----
intended_use | SUBSCRIPTION



