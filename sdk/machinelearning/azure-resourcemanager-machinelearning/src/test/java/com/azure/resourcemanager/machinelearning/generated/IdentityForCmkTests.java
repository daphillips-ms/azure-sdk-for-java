// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.IdentityForCmk;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class IdentityForCmkTests {
    @Test
    public void testDeserialize() {
        IdentityForCmk model =
            BinaryData.fromString("{\"userAssignedIdentity\":\"hanufhfcbjysagi\"}").toObject(IdentityForCmk.class);
        Assertions.assertEquals("hanufhfcbjysagi", model.userAssignedIdentity());
    }

    @Test
    public void testSerialize() {
        IdentityForCmk model = new IdentityForCmk().withUserAssignedIdentity("hanufhfcbjysagi");
        model = BinaryData.fromObject(model).toObject(IdentityForCmk.class);
        Assertions.assertEquals("hanufhfcbjysagi", model.userAssignedIdentity());
    }
}