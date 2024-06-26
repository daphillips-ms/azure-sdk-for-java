// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SapTablePartitionSettings;
import com.azure.resourcemanager.datafactory.models.SapTableSource;

public final class SapTableSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SapTableSource model = BinaryData.fromString(
            "{\"type\":\"pubsdinfauyt\",\"rowCount\":\"dataql\",\"rowSkips\":\"datarhctbrvegdamoy\",\"rfcTableFields\":\"datafjpkezqjizbyczme\",\"rfcTableOptions\":\"dataacgvlnpjjb\",\"batchSize\":\"datayrktuvdestarulnh\",\"customRfcReadTableFunctionModule\":\"datatvyhsxhcrf\",\"sapDataColumnDelimiter\":\"dataxexupcuizvx\",\"partitionOption\":\"datavzhlkeotdscqkxzr\",\"partitionSettings\":{\"partitionColumnName\":\"dataqzmvemli\",\"partitionUpperBound\":\"datadfqfnftrrhhgwaw\",\"partitionLowerBound\":\"datah\",\"maxPartitionsNumber\":\"datavcfxdvk\"},\"queryTimeout\":\"dataxultxhqqvdhdyy\",\"additionalColumns\":\"datatx\",\"sourceRetryCount\":\"datavsdyqyjkmfo\",\"sourceRetryWait\":\"datamxedlcxm\",\"maxConcurrentConnections\":\"datatpbapojknvxantlp\",\"disableMetricsCollection\":\"dataiipfgdnqpkvvrho\",\"\":{\"uexhskh\":\"dataqdvnruo\",\"xhegc\":\"dataqlvocrdd\",\"unqwcrkkabyx\":\"datalhqzcklq\"}}")
            .toObject(SapTableSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SapTableSource model = new SapTableSource().withSourceRetryCount("datavsdyqyjkmfo")
            .withSourceRetryWait("datamxedlcxm")
            .withMaxConcurrentConnections("datatpbapojknvxantlp")
            .withDisableMetricsCollection("dataiipfgdnqpkvvrho")
            .withQueryTimeout("dataxultxhqqvdhdyy")
            .withAdditionalColumns("datatx")
            .withRowCount("dataql")
            .withRowSkips("datarhctbrvegdamoy")
            .withRfcTableFields("datafjpkezqjizbyczme")
            .withRfcTableOptions("dataacgvlnpjjb")
            .withBatchSize("datayrktuvdestarulnh")
            .withCustomRfcReadTableFunctionModule("datatvyhsxhcrf")
            .withSapDataColumnDelimiter("dataxexupcuizvx")
            .withPartitionOption("datavzhlkeotdscqkxzr")
            .withPartitionSettings(new SapTablePartitionSettings().withPartitionColumnName("dataqzmvemli")
                .withPartitionUpperBound("datadfqfnftrrhhgwaw")
                .withPartitionLowerBound("datah")
                .withMaxPartitionsNumber("datavcfxdvk"));
        model = BinaryData.fromObject(model).toObject(SapTableSource.class);
    }
}
