// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.fluent.models.AmlOperationInner;
import com.azure.resourcemanager.machinelearning.models.AmlOperationDisplay;
import org.junit.jupiter.api.Assertions;

public final class AmlOperationInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AmlOperationInner model =
            BinaryData
                .fromString(
                    "{\"name\":\"siznto\",\"display\":{\"provider\":\"a\",\"resource\":\"ajpsquc\",\"operation\":\"o\",\"description\":\"dkfo\"},\"isDataAction\":false}")
                .toObject(AmlOperationInner.class);
        Assertions.assertEquals("siznto", model.name());
        Assertions.assertEquals("a", model.display().provider());
        Assertions.assertEquals("ajpsquc", model.display().resource());
        Assertions.assertEquals("o", model.display().operation());
        Assertions.assertEquals("dkfo", model.display().description());
        Assertions.assertEquals(false, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AmlOperationInner model =
            new AmlOperationInner()
                .withName("siznto")
                .withDisplay(
                    new AmlOperationDisplay()
                        .withProvider("a")
                        .withResource("ajpsquc")
                        .withOperation("o")
                        .withDescription("dkfo"))
                .withIsDataAction(false);
        model = BinaryData.fromObject(model).toObject(AmlOperationInner.class);
        Assertions.assertEquals("siznto", model.name());
        Assertions.assertEquals("a", model.display().provider());
        Assertions.assertEquals("ajpsquc", model.display().resource());
        Assertions.assertEquals("o", model.display().operation());
        Assertions.assertEquals("dkfo", model.display().description());
        Assertions.assertEquals(false, model.isDataAction());
    }
}
