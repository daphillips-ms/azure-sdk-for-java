// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quota.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quota.models.LimitObject;
import com.azure.resourcemanager.quota.models.QuotaLimitTypes;
import org.junit.jupiter.api.Assertions;

public final class LimitObjectTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        LimitObject model
            = BinaryData.fromString("{\"limitObjectType\":\"LimitValue\",\"value\":658406237,\"limitType\":\"Shared\"}")
                .toObject(LimitObject.class);
        Assertions.assertEquals(658406237, model.value());
        Assertions.assertEquals(QuotaLimitTypes.SHARED, model.limitType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        LimitObject model = new LimitObject().withValue(658406237).withLimitType(QuotaLimitTypes.SHARED);
        model = BinaryData.fromObject(model).toObject(LimitObject.class);
        Assertions.assertEquals(658406237, model.value());
        Assertions.assertEquals(QuotaLimitTypes.SHARED, model.limitType());
    }
}
