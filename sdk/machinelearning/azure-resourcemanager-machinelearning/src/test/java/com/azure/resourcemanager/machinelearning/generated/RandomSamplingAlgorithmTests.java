// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.machinelearning.models.RandomSamplingAlgorithm;
import com.azure.resourcemanager.machinelearning.models.RandomSamplingAlgorithmRule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class RandomSamplingAlgorithmTests {
    @Test
    public void testDeserialize() {
        RandomSamplingAlgorithm model =
            BinaryData
                .fromString("{\"samplingAlgorithmType\":\"Random\",\"rule\":\"Random\",\"seed\":1677252615}")
                .toObject(RandomSamplingAlgorithm.class);
        Assertions.assertEquals(RandomSamplingAlgorithmRule.RANDOM, model.rule());
        Assertions.assertEquals(1677252615, model.seed());
    }

    @Test
    public void testSerialize() {
        RandomSamplingAlgorithm model =
            new RandomSamplingAlgorithm().withRule(RandomSamplingAlgorithmRule.RANDOM).withSeed(1677252615);
        model = BinaryData.fromObject(model).toObject(RandomSamplingAlgorithm.class);
        Assertions.assertEquals(RandomSamplingAlgorithmRule.RANDOM, model.rule());
        Assertions.assertEquals(1677252615, model.seed());
    }
}