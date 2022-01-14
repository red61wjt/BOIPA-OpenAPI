#!/bin/bash -e
rm -rf clients
docker run --user $UID --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/openapi.yaml \
    -g java \
    --library okhttp-gson \
    --artifact-id api-client \
    --group-id com.evopayments \
    --api-package com.evopayments.api \
    --model-package com.evopayments.model \
    --additional-properties=disallowAdditionalPropertiesIfNotPresent=true \
    -o /local/clients/java

docker run --user $UID --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/openapi.yaml \
    -g php \
    --additional-properties=packageName=EvoPayments \
    -o /local/clients/php

docker run --user $UID --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/openapi.yaml \
    -g csharp \
    --additional-properties=packageName=Com.Evopayments \
    -o /local/clients/csharp

pushd clients/java
rm -rf *gradle*
mvn clean install
popd
pushd examples/java-client-example/
mvn clean install
popd
