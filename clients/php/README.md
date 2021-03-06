# EvoPayments

No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)


## Installation & Usage

### Requirements

PHP 7.3 and later.
Should also work with PHP 8.0 but has not been tested.

### Composer

To install the bindings via [Composer](https://getcomposer.org/), add the following to `composer.json`:

```json
{
  "repositories": [
    {
      "type": "vcs",
      "url": "https://github.com/GIT_USER_ID/GIT_REPO_ID.git"
    }
  ],
  "require": {
    "GIT_USER_ID/GIT_REPO_ID": "*@dev"
  }
}
```

Then run `composer install`

### Manual Installation

Download the files and include `autoload.php`:

```php
<?php
require_once('/path/to/EvoPayments/vendor/autoload.php');
```

## Getting Started

Please follow the [installation procedure](#installation--usage) and then run the following:

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');




$apiInstance = new OpenAPI\Client\Api\PaymentApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$merchant_id = 56; // int
$token = 'token_example'; // string
$action = 'action_example'; // string

try {
    $result = $apiInstance->capturePayment($merchant_id, $token, $action);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling PaymentApi->capturePayment: ', $e->getMessage(), PHP_EOL;
}

```

## API Endpoints

All URIs are relative to *https://apiuat.test.boipapaymentgateway.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentApi* | [**capturePayment**](docs/Api/PaymentApi.md#capturepayment) | **POST** /payments | 
*TokenApi* | [**getSessionToken**](docs/Api/TokenApi.md#getsessiontoken) | **POST** /token | 

## Models

- [BaseResponse](docs/Model/BaseResponse.md)
- [ResponseNotProcessed](docs/Model/ResponseNotProcessed.md)
- [TokenResponseProcessed](docs/Model/TokenResponseProcessed.md)

## Authorization
All endpoints do not require authorization.
## Tests

To run the tests, use:

```bash
composer install
vendor/bin/phpunit
```

## Author



## About this package

This PHP package is automatically generated by the [OpenAPI Generator](https://openapi-generator.tech) project:

- API version: `1.2.3`
- Build package: `org.openapitools.codegen.languages.PhpClientCodegen`
