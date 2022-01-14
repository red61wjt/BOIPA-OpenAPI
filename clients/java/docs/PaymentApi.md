# PaymentApi

All URIs are relative to *https://apiuat.test.boipapaymentgateway.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**capturePayment**](PaymentApi.md#capturePayment) | **POST** /payments | 


<a name="capturePayment"></a>
# **capturePayment**
> BaseResponse capturePayment(merchantId, token, action).execute();



Process payment

### Example
```java
// Import classes:
import com.evopayments.ApiClient;
import com.evopayments.ApiException;
import com.evopayments.Configuration;
import com.evopayments.models.*;
import com.evopayments.api.PaymentApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://apiuat.test.boipapaymentgateway.com");

    PaymentApi apiInstance = new PaymentApi(defaultClient);
    Integer merchantId = 56; // Integer | 
    String token = "token_example"; // String | 
    String action = "action_example"; // String | 
    try {
      BaseResponse result = apiInstance.capturePayment(merchantId, token, action)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentApi#capturePayment");
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
 **token** | **String**|  |
 **action** | **String**|  |

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

