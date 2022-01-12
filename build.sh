#!/bin/bash -e
docker run --rm -v "${PWD}:/local" openapitools/openapi-generator-cli generate \
    -i /local/openapi.yaml \
    -g java \
    --library okhttp-gson \
    --artifact-id api-client \
    --group-id com.evopayments \
    --api-package com.evopayments.api \
    --model-package com.evopayments.model \
    -o /local/java
    
pushd java
mvn clean install
popd
