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

public class TokenApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public TokenApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TokenApi(ApiClient apiClient) {
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

    private okhttp3.Call getSessionTokenCall(Integer merchantId, String password, String action, Integer timestamp, String allowOriginUrl, Double amount, String originalTxId, String originalMerchantTxId, String agentId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (merchantId != null) {
            localVarFormParams.put("merchantId", merchantId);
        }

        if (password != null) {
            localVarFormParams.put("password", password);
        }

        if (action != null) {
            localVarFormParams.put("action", action);
        }

        if (timestamp != null) {
            localVarFormParams.put("timestamp", timestamp);
        }

        if (allowOriginUrl != null) {
            localVarFormParams.put("allowOriginUrl", allowOriginUrl);
        }

        if (originalTxId != null) {
            localVarFormParams.put("originalTxId", originalTxId);
        }

        if (originalMerchantTxId != null) {
            localVarFormParams.put("originalMerchantTxId", originalMerchantTxId);
        }

        if (agentId != null) {
            localVarFormParams.put("agentId", agentId);
        }

        if (amount != null) {
            localVarFormParams.put("amount", amount);
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
    private okhttp3.Call getSessionTokenValidateBeforeCall(Integer merchantId, String password, String action, Integer timestamp, String allowOriginUrl, Double amount, String originalTxId, String originalMerchantTxId, String agentId, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'merchantId' is set
        if (merchantId == null) {
            throw new ApiException("Missing the required parameter 'merchantId' when calling getSessionToken(Async)");
        }
        
        // verify the required parameter 'password' is set
        if (password == null) {
            throw new ApiException("Missing the required parameter 'password' when calling getSessionToken(Async)");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new ApiException("Missing the required parameter 'action' when calling getSessionToken(Async)");
        }
        
        // verify the required parameter 'timestamp' is set
        if (timestamp == null) {
            throw new ApiException("Missing the required parameter 'timestamp' when calling getSessionToken(Async)");
        }
        
        // verify the required parameter 'allowOriginUrl' is set
        if (allowOriginUrl == null) {
            throw new ApiException("Missing the required parameter 'allowOriginUrl' when calling getSessionToken(Async)");
        }
        
        // verify the required parameter 'amount' is set
        if (amount == null) {
            throw new ApiException("Missing the required parameter 'amount' when calling getSessionToken(Async)");
        }
        

        okhttp3.Call localVarCall = getSessionTokenCall(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId, _callback);
        return localVarCall;

    }


    private ApiResponse<BaseResponse> getSessionTokenWithHttpInfo(Integer merchantId, String password, String action, Integer timestamp, String allowOriginUrl, Double amount, String originalTxId, String originalMerchantTxId, String agentId) throws ApiException {
        okhttp3.Call localVarCall = getSessionTokenValidateBeforeCall(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId, null);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getSessionTokenAsync(Integer merchantId, String password, String action, Integer timestamp, String allowOriginUrl, Double amount, String originalTxId, String originalMerchantTxId, String agentId, final ApiCallback<BaseResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = getSessionTokenValidateBeforeCall(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId, _callback);
        Type localVarReturnType = new TypeToken<BaseResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIgetSessionTokenRequest {
        private final Integer merchantId;
        private final String password;
        private final String action;
        private final Integer timestamp;
        private final String allowOriginUrl;
        private final Double amount;
        private String originalTxId;
        private String originalMerchantTxId;
        private String agentId;

        private APIgetSessionTokenRequest(Integer merchantId, String password, String action, Integer timestamp, String allowOriginUrl, Double amount) {
            this.merchantId = merchantId;
            this.password = password;
            this.action = action;
            this.timestamp = timestamp;
            this.allowOriginUrl = allowOriginUrl;
            this.amount = amount;
        }

        /**
         * Set originalTxId
         * @param originalTxId  (optional)
         * @return APIgetSessionTokenRequest
         */
        public APIgetSessionTokenRequest originalTxId(String originalTxId) {
            this.originalTxId = originalTxId;
            return this;
        }

        /**
         * Set originalMerchantTxId
         * @param originalMerchantTxId  (optional)
         * @return APIgetSessionTokenRequest
         */
        public APIgetSessionTokenRequest originalMerchantTxId(String originalMerchantTxId) {
            this.originalMerchantTxId = originalMerchantTxId;
            return this;
        }

        /**
         * Set agentId
         * @param agentId  (optional)
         * @return APIgetSessionTokenRequest
         */
        public APIgetSessionTokenRequest agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        /**
         * Build call for getSessionToken
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getSessionTokenCall(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId, _callback);
        }

        /**
         * Execute getSessionToken request
         * @return BaseResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
         </table>
         */
        public BaseResponse execute() throws ApiException {
            ApiResponse<BaseResponse> localVarResp = getSessionTokenWithHttpInfo(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId);
            return localVarResp.getData();
        }

        /**
         * Execute getSessionToken request with HTTP info returned
         * @return ApiResponse&lt;BaseResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<BaseResponse> executeWithHttpInfo() throws ApiException {
            return getSessionTokenWithHttpInfo(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId);
        }

        /**
         * Execute getSessionToken request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<BaseResponse> _callback) throws ApiException {
            return getSessionTokenAsync(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId, _callback);
        }
    }

    /**
     * 
     * Fetch session token
     * @param merchantId  (required)
     * @param password  (required)
     * @param action  (required)
     * @param timestamp  (required)
     * @param allowOriginUrl  (required)
     * @param amount  (required)
     * @return APIgetSessionTokenRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Response </td><td>  -  </td></tr>
     </table>
     */
    public APIgetSessionTokenRequest getSessionToken(Integer merchantId, String password, String action, Integer timestamp, String allowOriginUrl, Double amount) {
        return new APIgetSessionTokenRequest(merchantId, password, action, timestamp, allowOriginUrl, amount);
    }
}
