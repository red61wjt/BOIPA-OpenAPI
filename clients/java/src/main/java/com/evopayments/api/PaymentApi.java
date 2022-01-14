/*
 * EVO Payments
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.evopayments.api;

import com.evopayments.ApiCallback;
import com.evopayments.ApiClient;
import com.evopayments.ApiException;
import com.evopayments.ApiResponse;
import com.evopayments.Configuration;
import com.evopayments.Pair;
import com.evopayments.ProgressRequestBody;
import com.evopayments.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.evopayments.model.BaseResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PaymentApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PaymentApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PaymentApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for capturePayment
     * @param merchantId  (required)
     * @param token  (required)
     * @param action  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call capturePaymentCall(Integer merchantId, String token, String action, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/payment";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarFormParams.put("merchantId", merchantId);
        }

        if (token != null) {
            localVarFormParams.put("token", token);
        }

        if (action != null) {
            localVarFormParams.put("action", action);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarHeaderParams != null && localVarContentTypes != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call capturePaymentValidateBeforeCall(Integer merchantId, String token, String action, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId' when calling capturePayment(Async)");
        }
        
        // verify the required parameter 'token' is set
        if (token == null) {
            throw new ApiException("Missing the required parameter 'token' when calling capturePayment(Async)");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new ApiException("Missing the required parameter 'action' when calling capturePayment(Async)");
        }
        

        okhttp3.Call localVarCall = capturePaymentCall(merchantId, token, action, _callback);
        return localVarCall;

    }

    /**
     * 
     * Process payment
     * @param merchantId  (required)
     * @param token  (required)
     * @param action  (required)
     * @return BaseResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
     </table>
     */
    public BaseResponse capturePayment(Integer merchantId, String token, String action) throws ApiException {
        ApiResponse<BaseResponse> localVarResp = capturePaymentWithHttpInfo(merchantId, token, action);
        return localVarResp.getData();
    }

    /**
     * 
     * Process payment
     * @param merchantId  (required)
     * @param token  (required)
     * @param action  (required)
     * @return ApiResponse&lt;BaseResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BaseResponse> capturePaymentWithHttpInfo(Integer merchantId, String token, String action) throws ApiException {
        okhttp3.Call localVarCall = capturePaymentValidateBeforeCall(merchantId, token, action, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Process payment
     * @param merchantId  (required)
     * @param token  (required)
     * @param action  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call capturePaymentAsync(Integer merchantId, String token, String action, final ApiCallback<BaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = capturePaymentValidateBeforeCall(merchantId, token, action, _callback);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
