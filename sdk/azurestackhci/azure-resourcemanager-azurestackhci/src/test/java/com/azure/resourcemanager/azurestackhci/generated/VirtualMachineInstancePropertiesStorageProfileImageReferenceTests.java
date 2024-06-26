// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.azurestackhci.models.VirtualMachineInstancePropertiesStorageProfileImageReference;
import org.junit.jupiter.api.Assertions;

public final class VirtualMachineInstancePropertiesStorageProfileImageReferenceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VirtualMachineInstancePropertiesStorageProfileImageReference model =
            BinaryData
                .fromString("{\"id\":\"rcrgvx\"}")
                .toObject(VirtualMachineInstancePropertiesStorageProfileImageReference.class);
        Assertions.assertEquals("rcrgvx", model.id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VirtualMachineInstancePropertiesStorageProfileImageReference model =
            new VirtualMachineInstancePropertiesStorageProfileImageReference().withId("rcrgvx");
        model =
            BinaryData.fromObject(model).toObject(VirtualMachineInstancePropertiesStorageProfileImageReference.class);
        Assertions.assertEquals("rcrgvx", model.id());
    }
}
