// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The grounding enhancement that returns the bounding box of the objects detected in the image.
 */
@Immutable
public final class AzureGroundingEnhancement {

    /*
     * The lines of text detected by the grounding enhancement.
     */
    @Generated
    @JsonProperty(value = "lines")
    private final List<AzureGroundingEnhancementLine> lines;

    /**
     * Creates an instance of AzureGroundingEnhancement class.
     *
     * @param lines the lines value to set.
     */
    @Generated
    @JsonCreator
    private AzureGroundingEnhancement(@JsonProperty(value = "lines") List<AzureGroundingEnhancementLine> lines) {
        this.lines = lines;
    }

    /**
     * Get the lines property: The lines of text detected by the grounding enhancement.
     *
     * @return the lines value.
     */
    @Generated
    public List<AzureGroundingEnhancementLine> getLines() {
        return this.lines;
    }
}
