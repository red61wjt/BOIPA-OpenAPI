/*
 * EVO Payments
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.2.3
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using NUnit.Framework;

using System;
using System.Linq;
using System.IO;
using System.Collections.Generic;
using Com.Evopayments.Api;
using Com.Evopayments.Model;
using Com.Evopayments.Client;
using System.Reflection;
using Newtonsoft.Json;

namespace Com.Evopayments.Test
{
    /// <summary>
    ///  Class for testing BaseResponse
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the model.
    /// </remarks>
    public class BaseResponseTests
    {
        // TODO uncomment below to declare an instance variable for BaseResponse
        //private BaseResponse instance;

        /// <summary>
        /// Setup before each test
        /// </summary>
        [SetUp]
        public void Init()
        {
            // TODO uncomment below to create an instance of BaseResponse
            //instance = new BaseResponse();
        }

        /// <summary>
        /// Clean up after each test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of BaseResponse
        /// </summary>
        [Test]
        public void BaseResponseInstanceTest()
        {
            // TODO uncomment below to test "IsInstanceOf" BaseResponse
            //Assert.IsInstanceOf(typeof(BaseResponse), instance);
        }

        /// <summary>
        /// Test deserialize a ResponseNotProcessed from type BaseResponse
        /// </summary>
        [Test]
        public void ResponseNotProcessedDeserializeFromBaseResponseTest()
        {
            // TODO uncomment below to test deserialize a ResponseNotProcessed from type BaseResponse
            //Assert.IsInstanceOf(typeof(BaseResponse), JsonConvert.DeserializeObject<BaseResponse>(new ResponseNotProcessed().ToJson()));
        }
        /// <summary>
        /// Test deserialize a TokenResponseProcessed from type BaseResponse
        /// </summary>
        [Test]
        public void TokenResponseProcessedDeserializeFromBaseResponseTest()
        {
            // TODO uncomment below to test deserialize a TokenResponseProcessed from type BaseResponse
            //Assert.IsInstanceOf(typeof(BaseResponse), JsonConvert.DeserializeObject<BaseResponse>(new TokenResponseProcessed().ToJson()));
        }

        /// <summary>
        /// Test the property 'Result'
        /// </summary>
        [Test]
        public void ResultTest()
        {
            // TODO unit test for the property 'Result'
        }

    }

}
