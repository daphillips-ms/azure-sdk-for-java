// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.TabularSource;

public final class TabularSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TabularSource model = BinaryData.fromString(
            "{\"type\":\"vhfpfsesiywcre\",\"queryTimeout\":\"dataj\",\"additionalColumns\":\"datap\",\"sourceRetryCount\":\"dataphqqozhesbpq\",\"sourceRetryWait\":\"datamfjktd\",\"maxConcurrentConnections\":\"datahlkzt\",\"disableMetricsCollection\":\"datauuupcdaoatzvajw\",\"\":{\"lmazgpqo\":\"dataefmotulh\"}}")
            .toObject(TabularSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TabularSource model = new TabularSource().withSourceRetryCount("dataphqqozhesbpq")
            .withSourceRetryWait("datamfjktd")
            .withMaxConcurrentConnections("datahlkzt")
            .withDisableMetricsCollection("datauuupcdaoatzvajw")
            .withQueryTimeout("dataj")
            .withAdditionalColumns("datap");
        model = BinaryData.fromObject(model).toObject(TabularSource.class);
    }
}
