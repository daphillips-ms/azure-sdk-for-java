// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.hybridcompute.models.LicenseAssignmentState;
import com.azure.resourcemanager.hybridcompute.models.LicenseProfileArmEsuPropertiesWithoutAssignedLicense;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties for the Machine ESU profile. */
@Fluent
public final class LicenseProfileMachineInstanceViewEsuPropertiesInner
    extends LicenseProfileArmEsuPropertiesWithoutAssignedLicense {
    /*
     * The assigned license resource.
     */
    @JsonProperty(value = "assignedLicense")
    private LicenseInner assignedLicense;

    /*
     * Describes the license assignment state (Assigned or NotAssigned).
     */
    @JsonProperty(value = "licenseAssignmentState")
    private LicenseAssignmentState licenseAssignmentState;

    /** Creates an instance of LicenseProfileMachineInstanceViewEsuPropertiesInner class. */
    public LicenseProfileMachineInstanceViewEsuPropertiesInner() {
    }

    /**
     * Get the assignedLicense property: The assigned license resource.
     *
     * @return the assignedLicense value.
     */
    public LicenseInner assignedLicense() {
        return this.assignedLicense;
    }

    /**
     * Set the assignedLicense property: The assigned license resource.
     *
     * @param assignedLicense the assignedLicense value to set.
     * @return the LicenseProfileMachineInstanceViewEsuPropertiesInner object itself.
     */
    public LicenseProfileMachineInstanceViewEsuPropertiesInner withAssignedLicense(LicenseInner assignedLicense) {
        this.assignedLicense = assignedLicense;
        return this;
    }

    /**
     * Get the licenseAssignmentState property: Describes the license assignment state (Assigned or NotAssigned).
     *
     * @return the licenseAssignmentState value.
     */
    public LicenseAssignmentState licenseAssignmentState() {
        return this.licenseAssignmentState;
    }

    /**
     * Set the licenseAssignmentState property: Describes the license assignment state (Assigned or NotAssigned).
     *
     * @param licenseAssignmentState the licenseAssignmentState value to set.
     * @return the LicenseProfileMachineInstanceViewEsuPropertiesInner object itself.
     */
    public LicenseProfileMachineInstanceViewEsuPropertiesInner withLicenseAssignmentState(
        LicenseAssignmentState licenseAssignmentState) {
        this.licenseAssignmentState = licenseAssignmentState;
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
        if (assignedLicense() != null) {
            assignedLicense().validate();
        }
    }
}
