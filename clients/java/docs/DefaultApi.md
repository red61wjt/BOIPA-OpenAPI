# DefaultApi

All URIs are relative to *https://apiuat.test.boipapaymentgateway.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**tokenPost**](DefaultApi.md#tokenPost) | **POST** /token | 


<a name="tokenPost"></a>
# **tokenPost**
> BaseResponse tokenPost(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId)



Fetch session token

### Example
```java
// Import classes:
import com.evopayments.ApiClient;
import com.evopayments.ApiException;
import com.evopayments.Configuration;
import com.evopayments.models.*;
import com.evopayments.api.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiuat.test.boipapaymentgateway.com");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    Integer merchantId = 56; // Integer | 
    String password = "password_example"; // String | 
    String action = "action_example"; // String | 
    Integer timestamp = 56; // Integer | 
    String allowOriginUrl = "allowOriginUrl_example"; // String | 
    Double amount = 3.4D; // Double | 
    String originalTxId = "originalTxId_example"; // String | 
    String originalMerchantTxId = "originalMerchantTxId_example"; // String | 
    String agentId = "agentId_example"; // String | 
    try {
      BaseResponse result = apiInstance.tokenPost(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#tokenPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **merchantId** | **Integer**|  |
 **password** | **String**|  |
 **action** | **String**|  |
 **timestamp** | **Integer**|  |
 **allowOriginUrl** | **String**|  |
 **amount** | **Double**|  |
 **originalTxId** | **String**|  | [optional]
 **originalMerchantTxId** | **String**|  | [optional]
 **agentId** | **String**|  | [optional]

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
**200** | Response |  -  |

