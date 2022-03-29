// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Quota counter value details. */
@Fluent
public final class QuotaCounterValueContractProperties {
    /*
     * Number of times Counter was called.
     */
    @JsonProperty(value = "callsCount")
    private Integer callsCount;

    /*
     * Data Transferred in KiloBytes.
     */
    @JsonProperty(value = "kbTransferred")
    private Double kbTransferred;

    /**
     * Get the callsCount property: Number of times Counter was called.
     *
     * @return the callsCount value.
     */
    public Integer callsCount() {
        return this.callsCount;
    }

    /**
     * Set the callsCount property: Number of times Counter was called.
     *
     * @param callsCount the callsCount value to set.
     * @return the QuotaCounterValueContractProperties object itself.
     */
    public QuotaCounterValueContractProperties withCallsCount(Integer callsCount) {
        this.callsCount = callsCount;
        return this;
    }

    /**
     * Get the kbTransferred property: Data Transferred in KiloBytes.
     *
     * @return the kbTransferred value.
     */
    public Double kbTransferred() {
        return this.kbTransferred;
    }

    /**
     * Set the kbTransferred property: Data Transferred in KiloBytes.
     *
     * @param kbTransferred the kbTransferred value to set.
     * @return the QuotaCounterValueContractProperties object itself.
     */
    public QuotaCounterValueContractProperties withKbTransferred(Double kbTransferred) {
        this.kbTransferred = kbTransferred;
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
