/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.evopayments.client;

import com.evopayments.ApiException;
import com.evopayments.api.DefaultApi;
import com.evopayments.model.BaseResponse;
import com.evopayments.model.ResponseNotProcessed;
import com.evopayments.model.TokenResponseProcessed;

/**
 *
 * @author will
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DefaultApi api = new DefaultApi();
        try {
            BaseResponse response = api.tokenPost(167885, "56789", "CAPTURE", 0, "*", 1.0, null, "test", null);
            if(response instanceof TokenResponseProcessed) {
                TokenResponseProcessed responseProcessed = (TokenResponseProcessed) response;
                String token = responseProcessed.getToken();
                System.out.println("Token: " + token);
            }
            else {
                ResponseNotProcessed responseNotProcessed = (ResponseNotProcessed) response;
                System.err.println("ERROR: " + responseNotProcessed);
            }
        }
        catch(ApiException ae) {
            ae.printStackTrace();
        }
    }
    
}
