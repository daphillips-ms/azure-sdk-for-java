// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ExpressRouteLinkAdminState;
import com.azure.resourcemanager.network.models.ExpressRouteLinkConnectorType;
import com.azure.resourcemanager.network.models.ExpressRouteLinkMacSecConfig;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** ExpressRouteLink ExpressRouteLink child resource definition. */
@Fluent
public final class ExpressRouteLinkInner extends SubResource {
    /*
     * ExpressRouteLink Resource Properties ExpressRouteLink properties.
     */
    @JsonProperty(value = "properties")
    private ExpressRouteLinkPropertiesFormat innerProperties;

    /*
     * Name of child port resource that is unique among child port resources of
     * the parent.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Get the innerProperties property: ExpressRouteLink Resource Properties ExpressRouteLink properties.
     *
     * @return the innerProperties value.
     */
    private ExpressRouteLinkPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of child port resource that is unique among child port resources of the parent.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of child port resource that is unique among child port resources of the parent.
     *
     * @param name the name value to set.
     * @return the ExpressRouteLinkInner object itself.
     */
    public ExpressRouteLinkInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /** {@inheritDoc} */
    @Override
    public ExpressRouteLinkInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the routerName property: Name of Azure router associated with physical port.
     *
     * @return the routerName value.
     */
    public String routerName() {
        return this.innerProperties() == null ? null : this.innerProperties().routerName();
    }

    /**
     * Get the interfaceName property: Name of Azure router interface.
     *
     * @return the interfaceName value.
     */
    public String interfaceName() {
        return this.innerProperties() == null ? null : this.innerProperties().interfaceName();
    }

    /**
     * Get the patchPanelId property: Mapping between physical port to patch panel port.
     *
     * @return the patchPanelId value.
     */
    public String patchPanelId() {
        return this.innerProperties() == null ? null : this.innerProperties().patchPanelId();
    }

    /**
     * Get the rackId property: Mapping of physical patch panel to rack.
     *
     * @return the rackId value.
     */
    public String rackId() {
        return this.innerProperties() == null ? null : this.innerProperties().rackId();
    }

    /**
     * Get the connectorType property: Physical fiber port type.
     *
     * @return the connectorType value.
     */
    public ExpressRouteLinkConnectorType connectorType() {
        return this.innerProperties() == null ? null : this.innerProperties().connectorType();
    }

    /**
     * Get the adminState property: Administrative state of the physical port.
     *
     * @return the adminState value.
     */
    public ExpressRouteLinkAdminState adminState() {
        return this.innerProperties() == null ? null : this.innerProperties().adminState();
    }

    /**
     * Set the adminState property: Administrative state of the physical port.
     *
     * @param adminState the adminState value to set.
     * @return the ExpressRouteLinkInner object itself.
     */
    public ExpressRouteLinkInner withAdminState(ExpressRouteLinkAdminState adminState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteLinkPropertiesFormat();
        }
        this.innerProperties().withAdminState(adminState);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the express route link resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the macSecConfig property: Definition of ExpressRouteLink Mac Security configuration. MacSec configuration.
     *
     * @return the macSecConfig value.
     */
    public ExpressRouteLinkMacSecConfig macSecConfig() {
        return this.innerProperties() == null ? null : this.innerProperties().macSecConfig();
    }

    /**
     * Set the macSecConfig property: Definition of ExpressRouteLink Mac Security configuration. MacSec configuration.
     *
     * @param macSecConfig the macSecConfig value to set.
     * @return the ExpressRouteLinkInner object itself.
     */
    public ExpressRouteLinkInner withMacSecConfig(ExpressRouteLinkMacSecConfig macSecConfig) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ExpressRouteLinkPropertiesFormat();
        }
        this.innerProperties().withMacSecConfig(macSecConfig);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
