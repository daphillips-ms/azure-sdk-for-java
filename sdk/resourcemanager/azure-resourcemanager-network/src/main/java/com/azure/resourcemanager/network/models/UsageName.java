// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The usage names.
 */
@Fluent
public final class UsageName {
    /*
     * A string describing the resource name.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * A localized string describing the resource name.
     */
    @JsonProperty(value = "localizedValue")
    private String localizedValue;

    /**
     * Creates an instance of UsageName class.
     */
    public UsageName() {
    }

    /**
     * Get the value property: A string describing the resource name.
     * 
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: A string describing the resource name.
     * 
     * @param value the value value to set.
     * @return the UsageName object itself.
     */
    public UsageName withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the localizedValue property: A localized string describing the resource name.
     * 
     * @return the localizedValue value.
     */
    public String localizedValue() {
        return this.localizedValue;
    }

    /**
     * Set the localizedValue property: A localized string describing the resource name.
     * 
     * @param localizedValue the localizedValue value to set.
     * @return the UsageName object itself.
     */
    public UsageName withLocalizedValue(String localizedValue) {
        this.localizedValue = localizedValue;
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
