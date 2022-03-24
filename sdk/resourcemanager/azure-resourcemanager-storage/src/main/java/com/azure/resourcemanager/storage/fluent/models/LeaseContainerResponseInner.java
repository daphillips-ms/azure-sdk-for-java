// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Lease Container response schema. */
@Fluent
public final class LeaseContainerResponseInner {
    /*
     * Returned unique lease ID that must be included with any request to
     * delete the container, or to renew, change, or release the lease.
     */
    @JsonProperty(value = "leaseId")
    private String leaseId;

    /*
     * Approximate time remaining in the lease period, in seconds.
     */
    @JsonProperty(value = "leaseTimeSeconds")
    private String leaseTimeSeconds;

    /**
     * Get the leaseId property: Returned unique lease ID that must be included with any request to delete the
     * container, or to renew, change, or release the lease.
     *
     * @return the leaseId value.
     */
    public String leaseId() {
        return this.leaseId;
    }

    /**
     * Set the leaseId property: Returned unique lease ID that must be included with any request to delete the
     * container, or to renew, change, or release the lease.
     *
     * @param leaseId the leaseId value to set.
     * @return the LeaseContainerResponseInner object itself.
     */
    public LeaseContainerResponseInner withLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    /**
     * Get the leaseTimeSeconds property: Approximate time remaining in the lease period, in seconds.
     *
     * @return the leaseTimeSeconds value.
     */
    public String leaseTimeSeconds() {
        return this.leaseTimeSeconds;
    }

    /**
     * Set the leaseTimeSeconds property: Approximate time remaining in the lease period, in seconds.
     *
     * @param leaseTimeSeconds the leaseTimeSeconds value to set.
     * @return the LeaseContainerResponseInner object itself.
     */
    public LeaseContainerResponseInner withLeaseTimeSeconds(String leaseTimeSeconds) {
        this.leaseTimeSeconds = leaseTimeSeconds;
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
