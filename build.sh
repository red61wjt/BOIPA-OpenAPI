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
    
pushd clients/java
mvn clean install
popd
pushd examples/java-client-example/
mvn clean install
popd
