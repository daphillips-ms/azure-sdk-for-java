// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.fluent.models;

import com.azure.core.annotation.Immutable;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.appcomplianceautomation.models.SnapshotProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** A class represent a AppComplianceAutomation snapshot resource. */
@Immutable
public final class SnapshotResourceInner extends ProxyResource {
    /*
     * Snapshot's property'.
     */
    @JsonProperty(value = "properties", access = JsonProperty.Access.WRITE_ONLY)
    private SnapshotProperties properties;

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of SnapshotResourceInner class. */
    public SnapshotResourceInner() {
    }

    /**
     * Get the properties property: Snapshot's property'.
     *
     * @return the properties value.
     */
    public SnapshotProperties properties() {
        return this.properties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (properties() != null) {
            properties().validate();
        }
    }
}