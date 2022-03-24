// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Bgp Communities sent over ExpressRoute with each route corresponding to a prefix in this VNET. */
@Fluent
public final class VirtualNetworkBgpCommunities {
    /*
     * The BGP community associated with the virtual network.
     */
    @JsonProperty(value = "virtualNetworkCommunity", required = true)
    private String virtualNetworkCommunity;

    /*
     * The BGP community associated with the region of the virtual network.
     */
    @JsonProperty(value = "regionalCommunity", access = JsonProperty.Access.WRITE_ONLY)
    private String regionalCommunity;

    /**
     * Get the virtualNetworkCommunity property: The BGP community associated with the virtual network.
     *
     * @return the virtualNetworkCommunity value.
     */
    public String virtualNetworkCommunity() {
        return this.virtualNetworkCommunity;
    }

    /**
     * Set the virtualNetworkCommunity property: The BGP community associated with the virtual network.
     *
     * @param virtualNetworkCommunity the virtualNetworkCommunity value to set.
     * @return the VirtualNetworkBgpCommunities object itself.
     */
    public VirtualNetworkBgpCommunities withVirtualNetworkCommunity(String virtualNetworkCommunity) {
        this.virtualNetworkCommunity = virtualNetworkCommunity;
        return this;
    }

    /**
     * Get the regionalCommunity property: The BGP community associated with the region of the virtual network.
     *
     * @return the regionalCommunity value.
     */
    public String regionalCommunity() {
        return this.regionalCommunity;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (virtualNetworkCommunity() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property virtualNetworkCommunity in model VirtualNetworkBgpCommunities"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(VirtualNetworkBgpCommunities.class);
}
