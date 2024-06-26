// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.PostgreSqlTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PostgreSqlTableDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PostgreSqlTableDataset model = BinaryData.fromString(
            "{\"type\":\"fdyfao\",\"typeProperties\":{\"tableName\":\"datahfxa\",\"table\":\"datayihjcwwvaosckfa\",\"schema\":\"datakhpspww\"},\"description\":\"ng\",\"structure\":\"datanrdpuzlaihsujt\",\"schema\":\"dataybsz\",\"linkedServiceName\":{\"referenceName\":\"mijxejpd\",\"parameters\":{\"rnhhjtvh\":\"dataqwzutiye\",\"toqwrnfc\":\"datasznsyovqmqcud\",\"awfubkngejjxu\":\"datajthlokmx\"}},\"parameters\":{\"drsjtmn\":{\"type\":\"String\",\"defaultValue\":\"datajmoozmxuk\"},\"w\":{\"type\":\"Object\",\"defaultValue\":\"datao\"},\"tia\":{\"type\":\"String\",\"defaultValue\":\"datafdt\"}},\"annotations\":[\"datarnuhcfhepisqbc\",\"datalr\",\"datai\",\"datammemsoqgblcye\"],\"folder\":{\"name\":\"bobaqca\"},\"\":{\"wnlpjcxbjg\":\"datackcesrsi\"}}")
            .toObject(PostgreSqlTableDataset.class);
        Assertions.assertEquals("ng", model.description());
        Assertions.assertEquals("mijxejpd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("drsjtmn").type());
        Assertions.assertEquals("bobaqca", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PostgreSqlTableDataset model = new PostgreSqlTableDataset().withDescription("ng")
            .withStructure("datanrdpuzlaihsujt")
            .withSchema("dataybsz")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("mijxejpd")
                .withParameters(mapOf("rnhhjtvh", "dataqwzutiye", "toqwrnfc", "datasznsyovqmqcud", "awfubkngejjxu",
                    "datajthlokmx")))
            .withParameters(mapOf("drsjtmn",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datajmoozmxuk"), "w",
                new ParameterSpecification().withType(ParameterType.OBJECT).withDefaultValue("datao"), "tia",
                new ParameterSpecification().withType(ParameterType.STRING).withDefaultValue("datafdt")))
            .withAnnotations(Arrays.asList("datarnuhcfhepisqbc", "datalr", "datai", "datammemsoqgblcye"))
            .withFolder(new DatasetFolder().withName("bobaqca"))
            .withTableName("datahfxa")
            .withTable("datayihjcwwvaosckfa")
            .withSchemaTypePropertiesSchema("datakhpspww");
        model = BinaryData.fromObject(model).toObject(PostgreSqlTableDataset.class);
        Assertions.assertEquals("ng", model.description());
        Assertions.assertEquals("mijxejpd", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.STRING, model.parameters().get("drsjtmn").type());
        Assertions.assertEquals("bobaqca", model.folder().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
