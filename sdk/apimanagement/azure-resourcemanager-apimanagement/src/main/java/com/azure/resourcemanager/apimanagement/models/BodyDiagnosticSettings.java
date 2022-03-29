// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Body logging settings. */
@Fluent
public final class BodyDiagnosticSettings {
    /*
     * Number of request body bytes to log.
     */
    @JsonProperty(value = "bytes")
    private Integer bytes;

    /**
     * Get the bytes property: Number of request body bytes to log.
     *
     * @return the bytes value.
     */
    public Integer bytes() {
        return this.bytes;
    }

    /**
     * Set the bytes property: Number of request body bytes to log.
     *
     * @param bytes the bytes value to set.
     * @return the BodyDiagnosticSettings object itself.
     */
    public BodyDiagnosticSettings withBytes(Integer bytes) {
        this.bytes = bytes;
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
