// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Route Table resource. */
@Fluent
public final class RouteTablePropertiesFormat {
    /*
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "routes")
    private List<RouteInner> routes;

    /*
     * A collection of references to subnets.
     */
    @JsonProperty(value = "subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnets;

    /*
     * Whether to disable the routes learned by BGP on that route table. True
     * means disable.
     */
    @JsonProperty(value = "disableBgpRoutePropagation")
    private Boolean disableBgpRoutePropagation;

    /*
     * The provisioning state of the route table resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The resource GUID property of the route table.
     */
    @JsonProperty(value = "resourceGuid", access = JsonProperty.Access.WRITE_ONLY)
    private String resourceGuid;

    /**
     * Get the routes property: Collection of routes contained within a route table.
     *
     * @return the routes value.
     */
    public List<RouteInner> routes() {
        return this.routes;
    }

    /**
     * Set the routes property: Collection of routes contained within a route table.
     *
     * @param routes the routes value to set.
     * @return the RouteTablePropertiesFormat object itself.
     */
    public RouteTablePropertiesFormat withRoutes(List<RouteInner> routes) {
        this.routes = routes;
        return this;
    }

    /**
     * Get the subnets property: A collection of references to subnets.
     *
     * @return the subnets value.
     */
    public List<SubnetInner> subnets() {
        return this.subnets;
    }

    /**
     * Get the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     *
     * @return the disableBgpRoutePropagation value.
     */
    public Boolean disableBgpRoutePropagation() {
        return this.disableBgpRoutePropagation;
    }

    /**
     * Set the disableBgpRoutePropagation property: Whether to disable the routes learned by BGP on that route table.
     * True means disable.
     *
     * @param disableBgpRoutePropagation the disableBgpRoutePropagation value to set.
     * @return the RouteTablePropertiesFormat object itself.
     */
    public RouteTablePropertiesFormat withDisableBgpRoutePropagation(Boolean disableBgpRoutePropagation) {
        this.disableBgpRoutePropagation = disableBgpRoutePropagation;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the route table resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the resourceGuid property: The resource GUID property of the route table.
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
        if (routes() != null) {
            routes().forEach(e -> e.validate());
        }
        if (subnets() != null) {
            subnets().forEach(e -> e.validate());
        }
    }
}
