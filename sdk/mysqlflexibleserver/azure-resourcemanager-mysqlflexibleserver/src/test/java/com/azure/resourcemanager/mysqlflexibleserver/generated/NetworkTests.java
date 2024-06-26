// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mysqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mysqlflexibleserver.models.EnableStatusEnum;
import com.azure.resourcemanager.mysqlflexibleserver.models.Network;
import org.junit.jupiter.api.Assertions;

public final class NetworkTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Network model =
            BinaryData
                .fromString(
                    "{\"publicNetworkAccess\":\"Disabled\",\"delegatedSubnetResourceId\":\"cpecfvmmcoofs\",\"privateDnsZoneResourceId\":\"zevgb\"}")
                .toObject(Network.class);
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("cpecfvmmcoofs", model.delegatedSubnetResourceId());
        Assertions.assertEquals("zevgb", model.privateDnsZoneResourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Network model =
            new Network()
                .withPublicNetworkAccess(EnableStatusEnum.DISABLED)
                .withDelegatedSubnetResourceId("cpecfvmmcoofs")
                .withPrivateDnsZoneResourceId("zevgb");
        model = BinaryData.fromObject(model).toObject(Network.class);
        Assertions.assertEquals(EnableStatusEnum.DISABLED, model.publicNetworkAccess());
        Assertions.assertEquals("cpecfvmmcoofs", model.delegatedSubnetResourceId());
        Assertions.assertEquals("zevgb", model.privateDnsZoneResourceId());
    }
}
