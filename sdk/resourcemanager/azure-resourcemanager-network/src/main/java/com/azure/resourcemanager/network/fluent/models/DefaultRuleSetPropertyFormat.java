// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * the default web application firewall rule set.
 */
@Fluent
public final class DefaultRuleSetPropertyFormat {
    /*
     * The type of the web application firewall rule set.
     */
    @JsonProperty(value = "ruleSetType")
    private String ruleSetType;

    /*
     * The version of the web application firewall rule set type.
     */
    @JsonProperty(value = "ruleSetVersion")
    private String ruleSetVersion;

    /**
     * Creates an instance of DefaultRuleSetPropertyFormat class.
     */
    public DefaultRuleSetPropertyFormat() {
    }

    /**
     * Get the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @return the ruleSetType value.
     */
    public String ruleSetType() {
        return this.ruleSetType;
    }

    /**
     * Set the ruleSetType property: The type of the web application firewall rule set.
     * 
     * @param ruleSetType the ruleSetType value to set.
     * @return the DefaultRuleSetPropertyFormat object itself.
     */
    public DefaultRuleSetPropertyFormat withRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
        return this;
    }

    /**
     * Get the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @return the ruleSetVersion value.
     */
    public String ruleSetVersion() {
        return this.ruleSetVersion;
    }

    /**
     * Set the ruleSetVersion property: The version of the web application firewall rule set type.
     * 
     * @param ruleSetVersion the ruleSetVersion value to set.
     * @return the DefaultRuleSetPropertyFormat object itself.
     */
    public DefaultRuleSetPropertyFormat withRuleSetVersion(String ruleSetVersion) {
        this.ruleSetVersion = ruleSetVersion;
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
