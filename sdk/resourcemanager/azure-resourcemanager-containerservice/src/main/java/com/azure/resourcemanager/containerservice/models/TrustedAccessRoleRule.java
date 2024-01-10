// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Rule for trusted access role.
 */
@Immutable
public final class TrustedAccessRoleRule {
    /*
     * List of allowed verbs
     */
    @JsonProperty(value = "verbs", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> verbs;

    /*
     * List of allowed apiGroups
     */
    @JsonProperty(value = "apiGroups", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> apiGroups;

    /*
     * List of allowed resources
     */
    @JsonProperty(value = "resources", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> resources;

    /*
     * List of allowed names
     */
    @JsonProperty(value = "resourceNames", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> resourceNames;

    /*
     * List of allowed nonResourceURLs
     */
    @JsonProperty(value = "nonResourceURLs", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> nonResourceUrls;

    /**
     * Creates an instance of TrustedAccessRoleRule class.
     */
    public TrustedAccessRoleRule() {
    }

    /**
     * Get the verbs property: List of allowed verbs.
     *
     * @return the verbs value.
     */
    public List<String> verbs() {
        return this.verbs;
    }

    /**
     * Get the apiGroups property: List of allowed apiGroups.
     *
     * @return the apiGroups value.
     */
    public List<String> apiGroups() {
        return this.apiGroups;
    }

    /**
     * Get the resources property: List of allowed resources.
     *
     * @return the resources value.
     */
    public List<String> resources() {
        return this.resources;
    }

    /**
     * Get the resourceNames property: List of allowed names.
     *
     * @return the resourceNames value.
     */
    public List<String> resourceNames() {
        return this.resourceNames;
    }

    /**
     * Get the nonResourceUrls property: List of allowed nonResourceURLs.
     *
     * @return the nonResourceUrls value.
     */
    public List<String> nonResourceUrls() {
        return this.nonResourceUrls;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
