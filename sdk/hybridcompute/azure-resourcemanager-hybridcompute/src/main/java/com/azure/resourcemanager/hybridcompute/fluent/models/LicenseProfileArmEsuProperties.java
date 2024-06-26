// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileArmEsuPropertiesWithoutAssignedLicense;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes the properties of a License Profile ARM model. */
@Fluent
public final class LicenseProfileArmEsuProperties extends LicenseProfileArmEsuPropertiesWithoutAssignedLicense {
    /*
     * The resource id of the license.
     */
    @JsonProperty(value = "assignedLicense")
    private String assignedLicense;

    /** Creates an instance of LicenseProfileArmEsuProperties class. */
    public LicenseProfileArmEsuProperties() {
    }

    /**
     * Get the assignedLicense property: The resource id of the license.
     *
     * @return the assignedLicense value.
     */
    public String assignedLicense() {
        return this.assignedLicense;
    }

    /**
     * Set the assignedLicense property: The resource id of the license.
     *
     * @param assignedLicense the assignedLicense value to set.
     * @return the LicenseProfileArmEsuProperties object itself.
     */
    public LicenseProfileArmEsuProperties withAssignedLicense(String assignedLicense) {
        this.assignedLicense = assignedLicense;
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
