// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.fluent.models.IotFhirDestinationInner;
import com.azure.resourcemanager.healthcareapis.models.IotIdentityResolutionType;
import com.azure.resourcemanager.healthcareapis.models.IotMappingProperties;
import org.junit.jupiter.api.Assertions;

public final class IotFhirDestinationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IotFhirDestinationInner model = BinaryData.fromString(
            "{\"properties\":{\"resourceIdentityResolutionType\":\"Lookup\",\"fhirServiceResourceId\":\"us\",\"fhirMapping\":{\"content\":\"datatouwaboekqv\"},\"provisioningState\":\"Verifying\"},\"location\":\"mvb\",\"etag\":\"yjsflhhcaalnji\",\"id\":\"isxyawjoyaqcslyj\",\"name\":\"kiidzyex\",\"type\":\"nelixhnrztfo\"}")
            .toObject(IotFhirDestinationInner.class);
        Assertions.assertEquals("yjsflhhcaalnji", model.etag());
        Assertions.assertEquals("mvb", model.location());
        Assertions.assertEquals(IotIdentityResolutionType.LOOKUP, model.resourceIdentityResolutionType());
        Assertions.assertEquals("us", model.fhirServiceResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IotFhirDestinationInner model = new IotFhirDestinationInner().withEtag("yjsflhhcaalnji")
            .withLocation("mvb")
            .withResourceIdentityResolutionType(IotIdentityResolutionType.LOOKUP)
            .withFhirServiceResourceId("us")
            .withFhirMapping(new IotMappingProperties().withContent("datatouwaboekqv"));
        model = BinaryData.fromObject(model).toObject(IotFhirDestinationInner.class);
        Assertions.assertEquals("yjsflhhcaalnji", model.etag());
        Assertions.assertEquals("mvb", model.location());
        Assertions.assertEquals(IotIdentityResolutionType.LOOKUP, model.resourceIdentityResolutionType());
        Assertions.assertEquals("us", model.fhirServiceResourceId());
    }
}
