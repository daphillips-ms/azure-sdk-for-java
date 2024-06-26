// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.avs.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The properties of a Site Recovery Manager (SRM) addon. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "addonType")
@JsonTypeName("SRM")
@Fluent
public final class AddonSrmProperties extends AddonProperties {
    /*
     * The Site Recovery Manager (SRM) license
     */
    @JsonProperty(value = "licenseKey")
    private String licenseKey;

    /** Creates an instance of AddonSrmProperties class. */
    public AddonSrmProperties() {
    }

    /**
     * Get the licenseKey property: The Site Recovery Manager (SRM) license.
     *
     * @return the licenseKey value.
     */
    public String licenseKey() {
        return this.licenseKey;
    }

    /**
     * Set the licenseKey property: The Site Recovery Manager (SRM) license.
     *
     * @param licenseKey the licenseKey value to set.
     * @return the AddonSrmProperties object itself.
     */
    public AddonSrmProperties withLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
