// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Definition of the properties for a TagRules resource. */
@Fluent
public final class MonitoringTagRulesProperties {
    /*
     * ProvisioningState
     *
     * Provisioning state of the monitoring tag rules.
     */
    @JsonProperty(value = "provisioningState")
    private ProvisioningState provisioningState;

    /*
     * Rules for sending logs.
     */
    @JsonProperty(value = "logRules")
    private LogRules logRules;

    /** Creates an instance of MonitoringTagRulesProperties class. */
    public MonitoringTagRulesProperties() {
    }

    /**
     * Get the provisioningState property: ProvisioningState
     *
     * <p>Provisioning state of the monitoring tag rules.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: ProvisioningState
     *
     * <p>Provisioning state of the monitoring tag rules.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the MonitoringTagRulesProperties object itself.
     */
    public MonitoringTagRulesProperties withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the logRules property: Rules for sending logs.
     *
     * @return the logRules value.
     */
    public LogRules logRules() {
        return this.logRules;
    }

    /**
     * Set the logRules property: Rules for sending logs.
     *
     * @param logRules the logRules value to set.
     * @return the MonitoringTagRulesProperties object itself.
     */
    public MonitoringTagRulesProperties withLogRules(LogRules logRules) {
        this.logRules = logRules;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logRules() != null) {
            logRules().validate();
        }
    }
}
