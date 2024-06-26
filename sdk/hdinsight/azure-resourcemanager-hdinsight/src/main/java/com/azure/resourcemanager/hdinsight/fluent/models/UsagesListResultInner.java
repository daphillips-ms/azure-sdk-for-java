// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hdinsight.models.Usage;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The response for the operation to get regional usages for a subscription. */
@Fluent
public final class UsagesListResultInner {
    /*
     * The list of usages.
     */
    @JsonProperty(value = "value")
    private List<Usage> value;

    /** Creates an instance of UsagesListResultInner class. */
    public UsagesListResultInner() {
    }

    /**
     * Get the value property: The list of usages.
     *
     * @return the value value.
     */
    public List<Usage> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of usages.
     *
     * @param value the value value to set.
     * @return the UsagesListResultInner object itself.
     */
    public UsagesListResultInner withValue(List<Usage> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
