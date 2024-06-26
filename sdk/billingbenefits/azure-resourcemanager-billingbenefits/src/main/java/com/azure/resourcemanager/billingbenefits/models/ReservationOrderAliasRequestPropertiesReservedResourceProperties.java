// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties specific to each reserved resource type. Not required if not applicable. */
@Fluent
public final class ReservationOrderAliasRequestPropertiesReservedResourceProperties {
    /*
     * Turning this on will apply the reservation discount to other VMs in the same VM size group.
     */
    @JsonProperty(value = "instanceFlexibility")
    private InstanceFlexibility instanceFlexibility;

    /** Creates an instance of ReservationOrderAliasRequestPropertiesReservedResourceProperties class. */
    public ReservationOrderAliasRequestPropertiesReservedResourceProperties() {
    }

    /**
     * Get the instanceFlexibility property: Turning this on will apply the reservation discount to other VMs in the
     * same VM size group.
     *
     * @return the instanceFlexibility value.
     */
    public InstanceFlexibility instanceFlexibility() {
        return this.instanceFlexibility;
    }

    /**
     * Set the instanceFlexibility property: Turning this on will apply the reservation discount to other VMs in the
     * same VM size group.
     *
     * @param instanceFlexibility the instanceFlexibility value to set.
     * @return the ReservationOrderAliasRequestPropertiesReservedResourceProperties object itself.
     */
    public ReservationOrderAliasRequestPropertiesReservedResourceProperties withInstanceFlexibility(
        InstanceFlexibility instanceFlexibility) {
        this.instanceFlexibility = instanceFlexibility;
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
