// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.fluent.models.VirtualRouterInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for ListVirtualRouters API service call. */
@Fluent
public final class VirtualRouterListResult {
    /*
     * List of Virtual Routers.
     */
    @JsonProperty(value = "value")
    private List<VirtualRouterInner> value;

    /*
     * URL to get the next set of results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of Virtual Routers.
     *
     * @return the value value.
     */
    public List<VirtualRouterInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of Virtual Routers.
     *
     * @param value the value value to set.
     * @return the VirtualRouterListResult object itself.
     */
    public VirtualRouterListResult withValue(List<VirtualRouterInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: URL to get the next set of results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: URL to get the next set of results.
     *
     * @param nextLink the nextLink value to set.
     * @return the VirtualRouterListResult object itself.
     */
    public VirtualRouterListResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
