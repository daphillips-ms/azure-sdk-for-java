// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** ApiRelease details. */
@Fluent
public final class ApiReleaseContractInner extends ProxyResource {
    /*
     * ApiRelease entity contract properties.
     */
    @JsonProperty(value = "properties")
    private ApiReleaseContractProperties innerProperties;

    /**
     * Get the innerProperties property: ApiRelease entity contract properties.
     *
     * @return the innerProperties value.
     */
    private ApiReleaseContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the apiId property: Identifier of the API the release belongs to.
     *
     * @return the apiId value.
     */
    public String apiId() {
        return this.innerProperties() == null ? null : this.innerProperties().apiId();
    }

    /**
     * Set the apiId property: Identifier of the API the release belongs to.
     *
     * @param apiId the apiId value to set.
     * @return the ApiReleaseContractInner object itself.
     */
    public ApiReleaseContractInner withApiId(String apiId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiReleaseContractProperties();
        }
        this.innerProperties().withApiId(apiId);
        return this;
    }

    /**
     * Get the createdDateTime property: The time the API was released. The date conforms to the following format:
     * yyyy-MM-ddTHH:mm:ssZ as specified by the ISO 8601 standard.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdDateTime();
    }

    /**
     * Get the updatedDateTime property: The time the API release was updated.
     *
     * @return the updatedDateTime value.
     */
    public OffsetDateTime updatedDateTime() {
        return this.innerProperties() == null ? null : this.innerProperties().updatedDateTime();
    }

    /**
     * Get the notes property: Release Notes.
     *
     * @return the notes value.
     */
    public String notes() {
        return this.innerProperties() == null ? null : this.innerProperties().notes();
    }

    /**
     * Set the notes property: Release Notes.
     *
     * @param notes the notes value to set.
     * @return the ApiReleaseContractInner object itself.
     */
    public ApiReleaseContractInner withNotes(String notes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApiReleaseContractProperties();
        }
        this.innerProperties().withNotes(notes);
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
