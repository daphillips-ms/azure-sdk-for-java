// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterAvailableUpgradeInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterAvailableUpgradeList;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterAvailableUpgradeProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterAvailableUpgradeListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAvailableUpgradeList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"upgradeType\":\"ClusterAvailableUpgradeProperties\"},\"id\":\"zovawjvz\",\"name\":\"nluthnnp\",\"type\":\"nxipeil\"},{\"properties\":{\"upgradeType\":\"ClusterAvailableUpgradeProperties\"},\"id\":\"uaejxdultsk\",\"name\":\"bbtdzumvee\",\"type\":\"gpw\"},{\"properties\":{\"upgradeType\":\"ClusterAvailableUpgradeProperties\"},\"id\":\"hkfpbs\",\"name\":\"yofd\",\"type\":\"luu\"},{\"properties\":{\"upgradeType\":\"ClusterAvailableUpgradeProperties\"},\"id\":\"touwaboekqv\",\"name\":\"elnsmvbxw\",\"type\":\"jsflhhcaalnjix\"}],\"nextLink\":\"xyawj\"}")
            .toObject(ClusterAvailableUpgradeList.class);
        Assertions.assertEquals("xyawj", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAvailableUpgradeList model = new ClusterAvailableUpgradeList()
            .withValue(Arrays.asList(
                new ClusterAvailableUpgradeInner().withProperties(new ClusterAvailableUpgradeProperties()),
                new ClusterAvailableUpgradeInner().withProperties(new ClusterAvailableUpgradeProperties()),
                new ClusterAvailableUpgradeInner().withProperties(new ClusterAvailableUpgradeProperties()),
                new ClusterAvailableUpgradeInner().withProperties(new ClusterAvailableUpgradeProperties())))
            .withNextLink("xyawj");
        model = BinaryData.fromObject(model).toObject(ClusterAvailableUpgradeList.class);
        Assertions.assertEquals("xyawj", model.nextLink());
    }
}
