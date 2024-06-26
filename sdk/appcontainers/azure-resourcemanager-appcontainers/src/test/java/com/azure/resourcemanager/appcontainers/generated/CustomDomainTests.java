// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.BindingType;
import com.azure.resourcemanager.appcontainers.models.CustomDomain;
import org.junit.jupiter.api.Assertions;

public final class CustomDomainTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CustomDomain model = BinaryData
            .fromString("{\"name\":\"owqkdwytisi\",\"bindingType\":\"Disabled\",\"certificateId\":\"gpikpzimejza\"}")
            .toObject(CustomDomain.class);
        Assertions.assertEquals("owqkdwytisi", model.name());
        Assertions.assertEquals(BindingType.DISABLED, model.bindingType());
        Assertions.assertEquals("gpikpzimejza", model.certificateId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CustomDomain model = new CustomDomain().withName("owqkdwytisi").withBindingType(BindingType.DISABLED)
            .withCertificateId("gpikpzimejza");
        model = BinaryData.fromObject(model).toObject(CustomDomain.class);
        Assertions.assertEquals("owqkdwytisi", model.name());
        Assertions.assertEquals(BindingType.DISABLED, model.bindingType());
        Assertions.assertEquals("gpikpzimejza", model.certificateId());
    }
}
