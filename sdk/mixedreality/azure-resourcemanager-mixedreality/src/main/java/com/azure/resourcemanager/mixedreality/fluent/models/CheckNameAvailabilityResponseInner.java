// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.mixedreality.models.NameUnavailableReason;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Check Name Availability Response. */
@Fluent
public final class CheckNameAvailabilityResponseInner {
    /*
     * if name Available
     */
    @JsonProperty(value = "nameAvailable", required = true)
    private boolean nameAvailable;

    /*
     * Resource Name To Verify
     */
    @JsonProperty(value = "reason")
    private NameUnavailableReason reason;

    /*
     * detail message
     */
    @JsonProperty(value = "message")
    private String message;

    /** Creates an instance of CheckNameAvailabilityResponseInner class. */
    public CheckNameAvailabilityResponseInner() {
    }

    /**
     * Get the nameAvailable property: if name Available.
     *
     * @return the nameAvailable value.
     */
    public boolean nameAvailable() {
        return this.nameAvailable;
    }

    /**
     * Set the nameAvailable property: if name Available.
     *
     * @param nameAvailable the nameAvailable value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withNameAvailable(boolean nameAvailable) {
        this.nameAvailable = nameAvailable;
        return this;
    }

    /**
     * Get the reason property: Resource Name To Verify.
     *
     * @return the reason value.
     */
    public NameUnavailableReason reason() {
        return this.reason;
    }

    /**
     * Set the reason property: Resource Name To Verify.
     *
     * @param reason the reason value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withReason(NameUnavailableReason reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the message property: detail message.
     *
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: detail message.
     *
     * @param message the message value to set.
     * @return the CheckNameAvailabilityResponseInner object itself.
     */
    public CheckNameAvailabilityResponseInner withMessage(String message) {
        this.message = message;
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
