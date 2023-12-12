// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties of network group.
 */
@Fluent
public final class NetworkGroupProperties {
    /*
     * A description of the network group.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The provisioning state of the scope assignment resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Unique identifier for this resource.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * Creates an instance of NetworkGroupProperties class.
     */
    public NetworkGroupProperties() {
    }

    /**
     * Get the description property: A description of the network group.
     * 
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description of the network group.
     * 
     * @param description the description value to set.
     * @return the NetworkGroupProperties object itself.
     */
    public NetworkGroupProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the scope assignment resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGuid property: Unique identifier for this resource.
     * 
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
