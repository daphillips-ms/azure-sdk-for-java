// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.Transformation;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class TransformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Transformation model = BinaryData.fromString(
            "{\"name\":\"fgkuh\",\"description\":\"whvuldbkk\",\"dataset\":{\"referenceName\":\"jkjigawgaz\",\"parameters\":{\"aahzbhuroolkol\":\"dataqifhujjsbcml\",\"gfjzcvaax\":\"datarhhmojusu\",\"ahfxwccok\":\"dataia\",\"c\":\"dataxkukm\"}},\"linkedService\":{\"referenceName\":\"nuhhoqeqshav\",\"parameters\":{\"yrqolnthbbnkgz\":\"datak\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"drnzkjthf\",\"datasetParameters\":\"datayjncjm\",\"parameters\":{\"pfiddhl\":\"datayfj\",\"ocuselqk\":\"dataufzcqyjmqrfu\",\"sjmrkkhm\":\"datasazrhxuddqmdtff\",\"jawh\":\"datadmdlgyqixokw\"},\"\":{\"qdlcvmyolc\":\"datanqf\",\"tvsnvl\":\"dataymjc\",\"atuwqkokbc\":\"dataqdnzyza\",\"msn\":\"dataothymgobl\"}}}")
            .toObject(Transformation.class);
        Assertions.assertEquals("fgkuh", model.name());
        Assertions.assertEquals("whvuldbkk", model.description());
        Assertions.assertEquals("jkjigawgaz", model.dataset().referenceName());
        Assertions.assertEquals("nuhhoqeqshav", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("drnzkjthf", model.flowlet().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Transformation model = new Transformation().withName("fgkuh")
            .withDescription("whvuldbkk")
            .withDataset(new DatasetReference().withReferenceName("jkjigawgaz")
                .withParameters(mapOf("aahzbhuroolkol", "dataqifhujjsbcml", "gfjzcvaax", "datarhhmojusu", "ahfxwccok",
                    "dataia", "c", "dataxkukm")))
            .withLinkedService(new LinkedServiceReference().withReferenceName("nuhhoqeqshav")
                .withParameters(mapOf("yrqolnthbbnkgz", "datak")))
            .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                .withReferenceName("drnzkjthf")
                .withDatasetParameters("datayjncjm")
                .withParameters(mapOf("pfiddhl", "datayfj", "ocuselqk", "dataufzcqyjmqrfu", "sjmrkkhm",
                    "datasazrhxuddqmdtff", "jawh", "datadmdlgyqixokw"))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(Transformation.class);
        Assertions.assertEquals("fgkuh", model.name());
        Assertions.assertEquals("whvuldbkk", model.description());
        Assertions.assertEquals("jkjigawgaz", model.dataset().referenceName());
        Assertions.assertEquals("nuhhoqeqshav", model.linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.flowlet().type());
        Assertions.assertEquals("drnzkjthf", model.flowlet().referenceName());
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
