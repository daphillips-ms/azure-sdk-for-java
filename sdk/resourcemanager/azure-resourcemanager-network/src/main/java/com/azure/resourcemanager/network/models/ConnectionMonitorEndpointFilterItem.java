// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the connection monitor endpoint filter item. */
@Fluent
public final class ConnectionMonitorEndpointFilterItem {
    /*
     * The type of item included in the filter. Currently only 'AgentAddress'
     * is supported.
     */
    @JsonProperty(value = "type")
    private ConnectionMonitorEndpointFilterItemType type;

    /*
     * The address of the filter item.
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * Get the type property: The type of item included in the filter. Currently only 'AgentAddress' is supported.
     *
     * @return the type value.
     */
    public ConnectionMonitorEndpointFilterItemType type() {
        return this.type;
    }

    /**
     * Set the type property: The type of item included in the filter. Currently only 'AgentAddress' is supported.
     *
     * @param type the type value to set.
     * @return the ConnectionMonitorEndpointFilterItem object itself.
     */
    public ConnectionMonitorEndpointFilterItem withType(ConnectionMonitorEndpointFilterItemType type) {
        this.type = type;
        return this;
    }

    /**
     * Get the address property: The address of the filter item.
     *
     * @return the address value.
     */
    public String address() {
        return this.address;
    }

    /**
     * Set the address property: The address of the filter item.
     *
     * @param address the address value to set.
     * @return the ConnectionMonitorEndpointFilterItem object itself.
     */
    public ConnectionMonitorEndpointFilterItem withAddress(String address) {
        this.address = address;
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
