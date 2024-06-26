// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.logic.models.PartnerContent;
import com.azure.resourcemanager.logic.models.PartnerType;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The integration account partner. */
@Fluent
public final class IntegrationAccountPartnerInner extends Resource {
    /*
     * The integration account partner properties.
     */
    @JsonProperty(value = "properties", required = true)
    private IntegrationAccountPartnerProperties innerProperties = new IntegrationAccountPartnerProperties();

    /** Creates an instance of IntegrationAccountPartnerInner class. */
    public IntegrationAccountPartnerInner() {
    }

    /**
     * Get the innerProperties property: The integration account partner properties.
     *
     * @return the innerProperties value.
     */
    private IntegrationAccountPartnerProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public IntegrationAccountPartnerInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public IntegrationAccountPartnerInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the partnerType property: The partner type.
     *
     * @return the partnerType value.
     */
    public PartnerType partnerType() {
        return this.innerProperties() == null ? null : this.innerProperties().partnerType();
    }

    /**
     * Set the partnerType property: The partner type.
     *
     * @param partnerType the partnerType value to set.
     * @return the IntegrationAccountPartnerInner object itself.
     */
    public IntegrationAccountPartnerInner withPartnerType(PartnerType partnerType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IntegrationAccountPartnerProperties();
        }
        this.innerProperties().withPartnerType(partnerType);
        return this;
    }

    /**
     * Get the createdTime property: The created time.
     *
     * @return the createdTime value.
     */
    public OffsetDateTime createdTime() {
        return this.innerProperties() == null ? null : this.innerProperties().createdTime();
    }

    /**
     * Get the changedTime property: The changed time.
     *
     * @return the changedTime value.
     */
    public OffsetDateTime changedTime() {
        return this.innerProperties() == null ? null : this.innerProperties().changedTime();
    }

    /**
     * Get the metadata property: The metadata.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The metadata.
     *
     * @param metadata the metadata value to set.
     * @return the IntegrationAccountPartnerInner object itself.
     */
    public IntegrationAccountPartnerInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IntegrationAccountPartnerProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the content property: The partner content.
     *
     * @return the content value.
     */
    public PartnerContent content() {
        return this.innerProperties() == null ? null : this.innerProperties().content();
    }

    /**
     * Set the content property: The partner content.
     *
     * @param content the content value to set.
     * @return the IntegrationAccountPartnerInner object itself.
     */
    public IntegrationAccountPartnerInner withContent(PartnerContent content) {
        if (this.innerProperties() == null) {
            this.innerProperties = new IntegrationAccountPartnerProperties();
        }
        this.innerProperties().withContent(content);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model IntegrationAccountPartnerInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(IntegrationAccountPartnerInner.class);
}
