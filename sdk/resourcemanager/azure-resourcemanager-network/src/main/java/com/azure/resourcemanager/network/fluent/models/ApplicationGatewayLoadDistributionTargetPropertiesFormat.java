// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ApplicationGatewayLoadDistributionTargetPropertiesFormat model.
 */
@Fluent
public final class ApplicationGatewayLoadDistributionTargetPropertiesFormat {
    /*
     * Weight per server. Range between 1 and 100.
     */
    @JsonProperty(value = "weightPerServer")
    private Integer weightPerServer;

    /*
     * Backend address pool resource of the application gateway.
     */
    @JsonProperty(value = "backendAddressPool")
    private SubResource backendAddressPool;

    /**
     * Creates an instance of ApplicationGatewayLoadDistributionTargetPropertiesFormat class.
     */
    public ApplicationGatewayLoadDistributionTargetPropertiesFormat() {
    }

    /**
     * Get the weightPerServer property: Weight per server. Range between 1 and 100.
     * 
     * @return the weightPerServer value.
     */
    public Integer weightPerServer() {
        return this.weightPerServer;
    }

    /**
     * Set the weightPerServer property: Weight per server. Range between 1 and 100.
     * 
     * @param weightPerServer the weightPerServer value to set.
     * @return the ApplicationGatewayLoadDistributionTargetPropertiesFormat object itself.
     */
    public ApplicationGatewayLoadDistributionTargetPropertiesFormat withWeightPerServer(Integer weightPerServer) {
        this.weightPerServer = weightPerServer;
        return this;
    }

    /**
     * Get the backendAddressPool property: Backend address pool resource of the application gateway.
     * 
     * @return the backendAddressPool value.
     */
    public SubResource backendAddressPool() {
        return this.backendAddressPool;
    }

    /**
     * Set the backendAddressPool property: Backend address pool resource of the application gateway.
     * 
     * @param backendAddressPool the backendAddressPool value to set.
     * @return the ApplicationGatewayLoadDistributionTargetPropertiesFormat object itself.
     */
    public ApplicationGatewayLoadDistributionTargetPropertiesFormat
        withBackendAddressPool(SubResource backendAddressPool) {
        this.backendAddressPool = backendAddressPool;
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
