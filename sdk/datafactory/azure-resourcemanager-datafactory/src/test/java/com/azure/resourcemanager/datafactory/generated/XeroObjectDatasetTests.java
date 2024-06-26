// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.XeroObjectDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class XeroObjectDatasetTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        XeroObjectDataset model = BinaryData.fromString(
            "{\"type\":\"rcifflxqqn\",\"typeProperties\":{\"tableName\":\"datacowken\"},\"description\":\"tcuyuwgnyjdiuj\",\"structure\":\"datacwmlfz\",\"schema\":\"dataibfmcoxbktu\",\"linkedServiceName\":{\"referenceName\":\"jkuf\",\"parameters\":{\"mnobbai\":\"datadgnmei\",\"zaisfofg\":\"datacfbfy\",\"ifmyzb\":\"datamrkm\"}},\"parameters\":{\"lptbdponhblqi\":{\"type\":\"SecureString\",\"defaultValue\":\"datahcmt\"},\"bpcwtwtrchkcmru\":{\"type\":\"Array\",\"defaultValue\":\"datauqfpzjz\"}},\"annotations\":[\"dataesqsqmie\",\"dataxipwqchfpt\",\"datakkvjjl\"],\"folder\":{\"name\":\"cu\"},\"\":{\"xpxxizchmbuzg\":\"dataqokbgumuej\",\"fsu\":\"datanrkjkng\",\"zlsbufn\":\"dataaybh\",\"zmzuicsggsxznbp\":\"databvcntpoeeytrsl\"}}")
            .toObject(XeroObjectDataset.class);
        Assertions.assertEquals("tcuyuwgnyjdiuj", model.description());
        Assertions.assertEquals("jkuf", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("lptbdponhblqi").type());
        Assertions.assertEquals("cu", model.folder().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        XeroObjectDataset model = new XeroObjectDataset().withDescription("tcuyuwgnyjdiuj")
            .withStructure("datacwmlfz")
            .withSchema("dataibfmcoxbktu")
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("jkuf")
                .withParameters(mapOf("mnobbai", "datadgnmei", "zaisfofg", "datacfbfy", "ifmyzb", "datamrkm")))
            .withParameters(mapOf("lptbdponhblqi",
                new ParameterSpecification().withType(ParameterType.SECURE_STRING).withDefaultValue("datahcmt"),
                "bpcwtwtrchkcmru",
                new ParameterSpecification().withType(ParameterType.ARRAY).withDefaultValue("datauqfpzjz")))
            .withAnnotations(Arrays.asList("dataesqsqmie", "dataxipwqchfpt", "datakkvjjl"))
            .withFolder(new DatasetFolder().withName("cu"))
            .withTableName("datacowken");
        model = BinaryData.fromObject(model).toObject(XeroObjectDataset.class);
        Assertions.assertEquals("tcuyuwgnyjdiuj", model.description());
        Assertions.assertEquals("jkuf", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("lptbdponhblqi").type());
        Assertions.assertEquals("cu", model.folder().name());
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
