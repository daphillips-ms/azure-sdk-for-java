// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcomplianceautomation.models.ResourceItem;
import org.junit.jupiter.api.Test;

public final class ResourceItemTests {
    @Test
    public void testDeserialize() {
        ResourceItem model =
            BinaryData
                .fromString(
                    "{\"subscriptionId\":\"zahmgkbrpyydhibn\",\"resourceGroup\":\"qkpikadrgvtqagnb\",\"resourceType\":\"nhijggmebfsi\",\"resourceId\":\"butr\"}")
                .toObject(ResourceItem.class);
    }

    @Test
    public void testSerialize() {
        ResourceItem model = new ResourceItem();
        model = BinaryData.fromObject(model).toObject(ResourceItem.class);
    }
}
