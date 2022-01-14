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

import com.evopayments.ApiException;
import com.evopayments.model.BaseResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Fetch session token
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void tokenPostTest() throws ApiException {
        Integer merchantId = null;
        String password = null;
        String action = null;
        Integer timestamp = null;
        String allowOriginUrl = null;
        Double amount = null;
        String originalTxId = null;
        String originalMerchantTxId = null;
        String agentId = null;
                BaseResponse response = api.tokenPost(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId);
        // TODO: test validations
    }
    
}