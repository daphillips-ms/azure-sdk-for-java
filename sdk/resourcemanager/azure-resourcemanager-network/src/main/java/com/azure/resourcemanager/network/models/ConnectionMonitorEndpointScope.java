// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Describes the connection monitor endpoint scope. */
@Fluent
public final class ConnectionMonitorEndpointScope {
    /*
     * List of items which needs to be included to the endpoint scope.
     */
    @JsonProperty(value = "include")
    private List<ConnectionMonitorEndpointScopeItem> include;

    /*
     * List of items which needs to be excluded from the endpoint scope.
     */
    @JsonProperty(value = "exclude")
    private List<ConnectionMonitorEndpointScopeItem> exclude;

    /**
     * Get the include property: List of items which needs to be included to the endpoint scope.
     *
     * @return the include value.
     */
    public List<ConnectionMonitorEndpointScopeItem> include() {
        return this.include;
    }

    /**
     * Set the include property: List of items which needs to be included to the endpoint scope.
     *
     * @param include the include value to set.
     * @return the ConnectionMonitorEndpointScope object itself.
     */
    public ConnectionMonitorEndpointScope withInclude(List<ConnectionMonitorEndpointScopeItem> include) {
        this.include = include;
        return this;
    }

    /**
     * Get the exclude property: List of items which needs to be excluded from the endpoint scope.
     *
     * @return the exclude value.
     */
    public List<ConnectionMonitorEndpointScopeItem> exclude() {
        return this.exclude;
    }

    /**
     * Set the exclude property: List of items which needs to be excluded from the endpoint scope.
     *
     * @param exclude the exclude value to set.
     * @return the ConnectionMonitorEndpointScope object itself.
     */
    public ConnectionMonitorEndpointScope withExclude(List<ConnectionMonitorEndpointScopeItem> exclude) {
        this.exclude = exclude;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (include() != null) {
            include().forEach(e -> e.validate());
        }
        if (exclude() != null) {
            exclude().forEach(e -> e.validate());
        }
    }
}
