// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.fluent.models.DeploymentInfoResponseInner;
import org.junit.jupiter.api.Test;

public final class DeploymentInfoResponseInnerTests {
    @Test
    public void testDeserialize() {
        DeploymentInfoResponseInner model =
            BinaryData
                .fromString(
                    "{\"status\":\"Unhealthy\",\"version\":\"dtqajzyulpkudj\",\"memoryCapacity\":\"lkhbz\",\"diskCapacity\":\"epgzgqexz\"}")
                .toObject(DeploymentInfoResponseInner.class);
    }

    @Test
    public void testSerialize() {
        DeploymentInfoResponseInner model = new DeploymentInfoResponseInner();
        model = BinaryData.fromObject(model).toObject(DeploymentInfoResponseInner.class);
    }
}