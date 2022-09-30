
# Customer

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**date_of_birth** | **kotlin.String** | Customer’s date of birth. The format is ‘yyyy-mm-dd’ |  [optional]
**gender** | **kotlin.String** | Customer’s gender - ‘male’ or ‘female’ |  [optional]
**last_four_ssn** | **kotlin.String** | Last four digits of the customer&#39;s social security number. This value is available for US customers. |  [optional]
**national_identification_number** | **kotlin.String** | The customer&#39;s national identification number. This value is available for EU customers utilizing national identification numbers. |  [optional]
**organization_entity_type** | [**inline**](#Organization_entity_typeEnum) | Organization entity type. Only applicable for B2B customers. |  [optional]
**organization_registration_id** | **kotlin.String** | Organization registration id. Only applicable for B2B customers. |  [optional]
**title** | **kotlin.String** | Customer’s Title. Allowed values per country: UK - \&quot;Mr\&quot;, \&quot;Ms\&quot; DE - \&quot;Herr\&quot;, \&quot;Frau\&quot; AT: \&quot;Herr, \&quot;Frau\&quot; CH: de-CH: \&quot;Herr, \&quot;Frau\&quot; it-CH: \&quot;Sig.\&quot;, \&quot;Sig.ra\&quot; fr-CH: \&quot;M\&quot;, \&quot;Mme\&quot;  BE: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; NL: \&quot;Dhr.\&quot;, \&quot;Mevr.\&quot; |  [optional]
**type** | **kotlin.String** | Type of customer in the session. If nothing is added, a B2C session will be the default. If it is a b2b-session, you should enter organization to trigger a B2B session. |  [optional]
**vat_id** | **kotlin.String** | VAT ID. Only applicable for B2B customers. |  [optional]


<a name="Organization_entity_typeEnum"></a>
## Enum: organization_entity_type
Name | Value
---- | -----
organization_entity_type | LIMITED_COMPANY, PUBLIC_LIMITED_COMPANY, ENTREPRENEURIAL_COMPANY, LIMITED_PARTNERSHIP_LIMITED_COMPANY, LIMITED_PARTNERSHIP, GENERAL_PARTNERSHIP, REGISTERED_SOLE_TRADER, SOLE_TRADER, CIVIL_LAW_PARTNERSHIP, PUBLIC_INSTITUTION, OTHER



