// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerinstance.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerinstance.fluent.models.DeploymentExtensionSpecProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Extension sidecars to be added to the deployment. */
@Fluent
public final class DeploymentExtensionSpec {
    /*
     * Name of the extension.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Extension specific properties
     */
    @JsonProperty(value = "properties")
    private DeploymentExtensionSpecProperties innerProperties;

    /** Creates an instance of DeploymentExtensionSpec class. */
    public DeploymentExtensionSpec() {
    }

    /**
     * Get the name property: Name of the extension.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the extension.
     *
     * @param name the name value to set.
     * @return the DeploymentExtensionSpec object itself.
     */
    public DeploymentExtensionSpec withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Extension specific properties.
     *
     * @return the innerProperties value.
     */
    private DeploymentExtensionSpecProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the extensionType property: Type of extension to be added.
     *
     * @return the extensionType value.
     */
    public String extensionType() {
        return this.innerProperties() == null ? null : this.innerProperties().extensionType();
    }

    /**
     * Set the extensionType property: Type of extension to be added.
     *
     * @param extensionType the extensionType value to set.
     * @return the DeploymentExtensionSpec object itself.
     */
    public DeploymentExtensionSpec withExtensionType(String extensionType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentExtensionSpecProperties();
        }
        this.innerProperties().withExtensionType(extensionType);
        return this;
    }

    /**
     * Get the version property: Version of the extension being used.
     *
     * @return the version value.
     */
    public String version() {
        return this.innerProperties() == null ? null : this.innerProperties().version();
    }

    /**
     * Set the version property: Version of the extension being used.
     *
     * @param version the version value to set.
     * @return the DeploymentExtensionSpec object itself.
     */
    public DeploymentExtensionSpec withVersion(String version) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentExtensionSpecProperties();
        }
        this.innerProperties().withVersion(version);
        return this;
    }

    /**
     * Get the settings property: Settings for the extension.
     *
     * @return the settings value.
     */
    public Object settings() {
        return this.innerProperties() == null ? null : this.innerProperties().settings();
    }

    /**
     * Set the settings property: Settings for the extension.
     *
     * @param settings the settings value to set.
     * @return the DeploymentExtensionSpec object itself.
     */
    public DeploymentExtensionSpec withSettings(Object settings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentExtensionSpecProperties();
        }
        this.innerProperties().withSettings(settings);
        return this;
    }

    /**
     * Get the protectedSettings property: Protected settings for the extension.
     *
     * @return the protectedSettings value.
     */
    public Object protectedSettings() {
        return this.innerProperties() == null ? null : this.innerProperties().protectedSettings();
    }

    /**
     * Set the protectedSettings property: Protected settings for the extension.
     *
     * @param protectedSettings the protectedSettings value to set.
     * @return the DeploymentExtensionSpec object itself.
     */
    public DeploymentExtensionSpec withProtectedSettings(Object protectedSettings) {
        if (this.innerProperties() == null) {
            this.innerProperties = new DeploymentExtensionSpecProperties();
        }
        this.innerProperties().withProtectedSettings(protectedSettings);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (name() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property name in model DeploymentExtensionSpec"));
        }
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DeploymentExtensionSpec.class);
}
