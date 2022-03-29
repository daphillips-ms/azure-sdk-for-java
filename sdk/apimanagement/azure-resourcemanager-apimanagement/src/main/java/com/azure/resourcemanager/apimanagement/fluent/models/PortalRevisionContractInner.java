// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.apimanagement.models.PortalRevisionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Portal Revision's contract details. */
@Fluent
public final class PortalRevisionContractInner extends ProxyResource {
    /*
     * Properties of the portal revisions.
     */
    @JsonProperty(value = "properties")
    private PortalRevisionContractProperties innerProperties;

    /**
     * Get the innerProperties property: Properties of the portal revisions.
     *
     * @return the innerProperties value.
     */
    private PortalRevisionContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: Portal revision description.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: Portal revision description.
     *
     * @param description the description value to set.
     * @return the PortalRevisionContractInner object itself.
     */
    public PortalRevisionContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalRevisionContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the statusDetails property: Portal revision publishing status details.
     *
     * @return the statusDetails value.
     */
    public String statusDetails() {
        return this.innerProperties() == null ? null : this.innerProperties().statusDetails();
    }

    /**
     * Get the status property: Status of the portal's revision.
     *
     * @return the status value.
     */
    public PortalRevisionStatus status() {
        return this.innerProperties() == null ? null : this.innerProperties().status();
    }

    /**
     * Get the isCurrent property: Indicates if the portal's revision is public.
     *
     * @return the isCurrent value.
     */
    public Boolean isCurrent() {
        return this.innerProperties() == null ? null : this.innerProperties().isCurrent();
    }

    /**
     * Set the isCurrent property: Indicates if the portal's revision is public.
     *
     * @param isCurrent the isCurrent value to set.
     * @return the PortalRevisionContractInner object itself.
     */
    public PortalRevisionContractInner withIsCurrent(Boolean isCurrent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PortalRevisionContractProperties();
        }
        this.innerProperties().withIsCurrent(isCurrent);
        return this;
    }

    /**
     * Get the createdDateTime property: Portal's revision creation date and time.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateTime();
    }

    /**
     * Get the updatedDateTime property: Last updated date and time.
     *
     * @return the updatedDateTime value.
     */
    public OffsetDateTime updatedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedDateTime();
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
