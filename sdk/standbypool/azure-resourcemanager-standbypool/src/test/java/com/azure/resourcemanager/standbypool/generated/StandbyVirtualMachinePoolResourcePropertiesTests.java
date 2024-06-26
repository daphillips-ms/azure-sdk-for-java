// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.standbypool.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolElasticityProfile;
import com.azure.resourcemanager.standbypool.models.StandbyVirtualMachinePoolResourceProperties;
import com.azure.resourcemanager.standbypool.models.VirtualMachineState;
import org.junit.jupiter.api.Assertions;

public final class StandbyVirtualMachinePoolResourcePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StandbyVirtualMachinePoolResourceProperties model = BinaryData.fromString(
            "{\"elasticityProfile\":{\"maxReadyCapacity\":6116347242940995661},\"virtualMachineState\":\"Deallocated\",\"attachedVirtualMachineScaleSetId\":\"dkfthwxmnt\",\"provisioningState\":\"Deleting\"}")
            .toObject(StandbyVirtualMachinePoolResourceProperties.class);
        Assertions.assertEquals(6116347242940995661L, model.elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.DEALLOCATED, model.virtualMachineState());
        Assertions.assertEquals("dkfthwxmnt", model.attachedVirtualMachineScaleSetId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StandbyVirtualMachinePoolResourceProperties model = new StandbyVirtualMachinePoolResourceProperties()
            .withElasticityProfile(
                new StandbyVirtualMachinePoolElasticityProfile().withMaxReadyCapacity(6116347242940995661L))
            .withVirtualMachineState(VirtualMachineState.DEALLOCATED)
            .withAttachedVirtualMachineScaleSetId("dkfthwxmnt");
        model = BinaryData.fromObject(model).toObject(StandbyVirtualMachinePoolResourceProperties.class);
        Assertions.assertEquals(6116347242940995661L, model.elasticityProfile().maxReadyCapacity());
        Assertions.assertEquals(VirtualMachineState.DEALLOCATED, model.virtualMachineState());
        Assertions.assertEquals("dkfthwxmnt", model.attachedVirtualMachineScaleSetId());
    }
}
