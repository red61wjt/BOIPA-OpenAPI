# OpenAPI\Client\PaymentApi

All URIs are relative to https://apiuat.test.boipapaymentgateway.com.

Method | HTTP request | Description
------------- | ------------- | -------------
[**capturePayment()**](PaymentApi.md#capturePayment) | **POST** /payment | 


## `capturePayment()`

```php
capturePayment($merchant_id, $token, $action): \OpenAPI\Client\Model\BaseResponse
```



Process payment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');



$apiInstance = new OpenAPI\Client\Api\PaymentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$merchant_id = 56; // int
$token = 'token_example'; // string
$action = 'action_example'; // string

try {
    $result = $apiInstance->capturePayment($merchant_id, $token, $action);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->capturePayment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchant_id** | **int**|  |
 **token** | **string**|  |
 **action** | **string**|  |

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
