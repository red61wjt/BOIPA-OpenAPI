# Com.Evopayments.Api.PaymentApi

All URIs are relative to *https://apiuat.test.boipapaymentgateway.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CapturePayment**](PaymentApi.md#capturepayment) | **POST** /payment | 



## CapturePayment

> BaseResponse CapturePayment (int merchantId, string token, string action)



Process payment

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Com.Evopayments.Api;
using Com.Evopayments.Client;
using Com.Evopayments.Model;

namespace Example
{
    public class CapturePaymentExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://apiuat.test.boipapaymentgateway.com";
            var apiInstance = new PaymentApi(Configuration.Default);
            var merchantId = 56;  // int | 
            var token = token_example;  // string | 
            var action = action_example;  // string | 

            try
            {
                BaseResponse result = apiInstance.CapturePayment(merchantId, token, action);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling PaymentApi.CapturePayment: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **int**|  | 
 **token** | **string**|  | 
 **action** | **string**|  | 

### Return type

[**BaseResponse**](BaseResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/x-www-form-urlencoded
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |

[[Back to top]](#)
[[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

