// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Start packet capture parameters on virtual network gateway.
 */
@Fluent
public final class VpnPacketCaptureStartParameters {
    /*
     * Start Packet capture parameters.
     */
    @JsonProperty(value = "filterData")
    private String filterData;

    /**
     * Creates an instance of VpnPacketCaptureStartParameters class.
     */
    public VpnPacketCaptureStartParameters() {
    }

    /**
     * Get the filterData property: Start Packet capture parameters.
     * 
     * @return the filterData value.
     */
    public String filterData() {
        return this.filterData;
    }

    /**
     * Set the filterData property: Start Packet capture parameters.
     * 
     * @param filterData the filterData value to set.
     * @return the VpnPacketCaptureStartParameters object itself.
     */
    public VpnPacketCaptureStartParameters withFilterData(String filterData) {
        this.filterData = filterData;
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
