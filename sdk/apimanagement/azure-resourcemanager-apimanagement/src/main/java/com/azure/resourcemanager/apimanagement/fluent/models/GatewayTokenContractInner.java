// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Gateway access token. */
@Fluent
public final class GatewayTokenContractInner {
    /*
     * Shared Access Authentication token value for the Gateway.
     */
    @JsonProperty(value = "value")
    private String value;

    /**
     * Get the value property: Shared Access Authentication token value for the Gateway.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Shared Access Authentication token value for the Gateway.
     *
     * @param value the value value to set.
     * @return the GatewayTokenContractInner object itself.
     */
    public GatewayTokenContractInner withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
