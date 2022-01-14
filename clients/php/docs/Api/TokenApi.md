# OpenAPI\Client\TokenApi

All URIs are relative to https://apiuat.test.boipapaymentgateway.com.

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSessionToken()**](TokenApi.md#getSessionToken) | **POST** /token | 


## `getSessionToken()`

```php
getSessionToken($merchant_id, $password, $action, $timestamp, $allow_origin_url, $amount, $original_tx_id, $original_merchant_tx_id, $agent_id): \OpenAPI\Client\Model\BaseResponse
```



Fetch session token

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\TokenApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$merchant_id = 56; // int
$password = 'password_example'; // string
$action = 'action_example'; // string
$timestamp = 56; // int
$allow_origin_url = 'allow_origin_url_example'; // string
$amount = 3.4; // double
$original_tx_id = 'original_tx_id_example'; // string
$original_merchant_tx_id = 'original_merchant_tx_id_example'; // string
$agent_id = 'agent_id_example'; // string

try {
    $result = $apiInstance->getSessionToken($merchant_id, $password, $action, $timestamp, $allow_origin_url, $amount, $original_tx_id, $original_merchant_tx_id, $agent_id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TokenApi->getSessionToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchant_id** | **int**|  |
 **password** | **string**|  |
 **action** | **string**|  |
 **timestamp** | **int**|  |
 **allow_origin_url** | **string**|  |
 **amount** | **double**|  |
 **original_tx_id** | **string**|  | [optional]
 **original_merchant_tx_id** | **string**|  | [optional]
 **agent_id** | **string**|  | [optional]

### Return type

[**\OpenAPI\Client\Model\BaseResponse**](../Model/BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: `application/x-www-form-urlencoded`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
