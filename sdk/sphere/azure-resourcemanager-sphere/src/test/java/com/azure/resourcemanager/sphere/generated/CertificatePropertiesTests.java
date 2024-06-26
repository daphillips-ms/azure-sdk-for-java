// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sphere.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.sphere.models.CertificateProperties;

public final class CertificatePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        CertificateProperties model = BinaryData.fromString(
            "{\"certificate\":\"w\",\"status\":\"Revoked\",\"subject\":\"ypl\",\"thumbprint\":\"kbasyypn\",\"expiryUtc\":\"2021-11-02T07:55:59Z\",\"notBeforeUtc\":\"2021-11-25T20:26:44Z\",\"provisioningState\":\"Accepted\"}")
            .toObject(CertificateProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        CertificateProperties model = new CertificateProperties();
        model = BinaryData.fromObject(model).toObject(CertificateProperties.class);
    }
}
