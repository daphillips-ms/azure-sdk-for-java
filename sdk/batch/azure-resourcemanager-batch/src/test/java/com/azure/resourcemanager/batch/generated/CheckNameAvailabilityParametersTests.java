// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batch.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.batch.models.CheckNameAvailabilityParameters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class CheckNameAvailabilityParametersTests {
    @Test
    public void testDeserialize() {
        CheckNameAvailabilityParameters model =
            BinaryData.fromString("{\"name\":\"oczvy\"}").toObject(CheckNameAvailabilityParameters.class);
        Assertions.assertEquals("oczvy", model.name());
    }

    @Test
    public void testSerialize() {
        CheckNameAvailabilityParameters model = new CheckNameAvailabilityParameters().withName("oczvy");
        model = BinaryData.fromObject(model).toObject(CheckNameAvailabilityParameters.class);
        Assertions.assertEquals("oczvy", model.name());
    }
}