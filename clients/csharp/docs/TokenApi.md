# Com.Evopayments.Api.TokenApi

All URIs are relative to *https://apiuat.test.boipapaymentgateway.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSessionToken**](TokenApi.md#getsessiontoken) | **POST** /token | 



## GetSessionToken

> BaseResponse GetSessionToken (int merchantId, string password, string action, int timestamp, string allowOriginUrl, double amount, string originalTxId = null, string originalMerchantTxId = null, string agentId = null)



Fetch session token

### Example

```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Com.Evopayments.Api;
using Com.Evopayments.Client;
using Com.Evopayments.Model;

namespace Example
{
    public class GetSessionTokenExample
    {
        public static void Main()
        {
            Configuration.Default.BasePath = "https://apiuat.test.boipapaymentgateway.com";
            var apiInstance = new TokenApi(Configuration.Default);
            var merchantId = 56;  // int | 
            var password = password_example;  // string | 
            var action = action_example;  // string | 
            var timestamp = 56;  // int | 
            var allowOriginUrl = allowOriginUrl_example;  // string | 
            var amount = 1.2D;  // double | 
            var originalTxId = originalTxId_example;  // string |  (optional) 
            var originalMerchantTxId = originalMerchantTxId_example;  // string |  (optional) 
            var agentId = agentId_example;  // string |  (optional) 

            try
            {
                BaseResponse result = apiInstance.GetSessionToken(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId);
                Debug.WriteLine(result);
            }
            catch (ApiException e)
            {
                Debug.Print("Exception when calling TokenApi.GetSessionToken: " + e.Message );
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
 **password** | **string**|  | 
 **action** | **string**|  | 
 **timestamp** | **int**|  | 
 **allowOriginUrl** | **string**|  | 
 **amount** | **double**|  | 
 **originalTxId** | **string**|  | [optional] 
 **originalMerchantTxId** | **string**|  | [optional] 
 **agentId** | **string**|  | [optional] 

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

