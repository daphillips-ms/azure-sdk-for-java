// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerservice.models.TrustedAccessRoleBindingProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Properties for trusted access role binding.
 */
@Fluent
public final class TrustedAccessRoleBindingProperties {
    /*
     * The current provisioning state of trusted access role binding.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private TrustedAccessRoleBindingProvisioningState provisioningState;

    /*
     * The ARM resource ID of source resource that trusted access is configured for.
     */
    @JsonProperty(value = "sourceResourceId", required = true)
    private String sourceResourceId;

    /*
     * A list of roles to bind, each item is a resource type qualified role name. For example:
     * 'Microsoft.MachineLearningServices/workspaces/reader'.
     */
    @JsonProperty(value = "roles", required = true)
    private List<String> roles;

    /**
     * Creates an instance of TrustedAccessRoleBindingProperties class.
     */
    public TrustedAccessRoleBindingProperties() {
    }

    /**
     * Get the provisioningState property: The current provisioning state of trusted access role binding.
     *
     * @return the provisioningState value.
     */
    public TrustedAccessRoleBindingProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the sourceResourceId property: The ARM resource ID of source resource that trusted access is configured for.
     *
     * @return the sourceResourceId value.
     */
    public String sourceResourceId() {
        return this.sourceResourceId;
    }

    /**
     * Set the sourceResourceId property: The ARM resource ID of source resource that trusted access is configured for.
     *
     * @param sourceResourceId the sourceResourceId value to set.
     * @return the TrustedAccessRoleBindingProperties object itself.
     */
    public TrustedAccessRoleBindingProperties withSourceResourceId(String sourceResourceId) {
        this.sourceResourceId = sourceResourceId;
        return this;
    }

    /**
     * Get the roles property: A list of roles to bind, each item is a resource type qualified role name. For example:
     * 'Microsoft.MachineLearningServices/workspaces/reader'.
     *
     * @return the roles value.
     */
    public List<String> roles() {
        return this.roles;
    }

    /**
     * Set the roles property: A list of roles to bind, each item is a resource type qualified role name. For example:
     * 'Microsoft.MachineLearningServices/workspaces/reader'.
     *
     * @param roles the roles value to set.
     * @return the TrustedAccessRoleBindingProperties object itself.
     */
    public TrustedAccessRoleBindingProperties withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sourceResourceId() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property sourceResourceId in model TrustedAccessRoleBindingProperties"));
        }
        if (roles() == null) {
            throw LOGGER.logExceptionAsError(new IllegalArgumentException(
                "Missing required property roles in model TrustedAccessRoleBindingProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(TrustedAccessRoleBindingProperties.class);
}
