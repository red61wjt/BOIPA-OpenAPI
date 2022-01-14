/*
 * EVO Payments
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.3
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Com.Evopayments.Client;
using Com.Evopayments.Api;
using Com.Evopayments.Model;

namespace Com.Evopayments.Test
{
    /// <summary>
    ///  Class for testing TokenApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class TokenApiTests
    {
        private TokenApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new TokenApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of TokenApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' TokenApi
            //Assert.IsInstanceOf(typeof(TokenApi), instance);
        }

        
        /// <summary>
        /// Test GetSessionToken
        /// </summary>
        [Test]
        public void GetSessionTokenTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int merchantId = null;
            //string password = null;
            //string action = null;
            //int timestamp = null;
            //string allowOriginUrl = null;
            //double amount = null;
            //string originalTxId = null;
            //string originalMerchantTxId = null;
            //string agentId = null;
            //var response = instance.GetSessionToken(merchantId, password, action, timestamp, allowOriginUrl, amount, originalTxId, originalMerchantTxId, agentId);
            //Assert.IsInstanceOf(typeof(BaseResponse), response, "response is BaseResponse");
        }
        
    }

}