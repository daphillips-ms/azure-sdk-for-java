// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.resourcemanager.kusto.models.Language;
import com.azure.resourcemanager.kusto.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Class representing a Kusto sandbox custom image. */
@Fluent
public final class SandboxCustomImageInner extends ProxyResource {
    /*
     * A sandbox custom image.
     */
    @JsonProperty(value = "properties")
    private SandboxCustomImageProperties innerProperties;

    /** Creates an instance of SandboxCustomImageInner class. */
    public SandboxCustomImageInner() {
    }

    /**
     * Get the innerProperties property: A sandbox custom image.
     *
     * @return the innerProperties value.
     */
    private SandboxCustomImageProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the language property: The language name, for example Python.
     *
     * @return the language value.
     */
    public Language language() {
        return this.innerProperties() == null ? null : this.innerProperties().language();
    }

    /**
     * Set the language property: The language name, for example Python.
     *
     * @param language the language value to set.
     * @return the SandboxCustomImageInner object itself.
     */
    public SandboxCustomImageInner withLanguage(Language language) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SandboxCustomImageProperties();
        }
        this.innerProperties().withLanguage(language);
        return this;
    }

    /**
     * Get the languageVersion property: The version of the language.
     *
     * @return the languageVersion value.
     */
    public String languageVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().languageVersion();
    }

    /**
     * Set the languageVersion property: The version of the language.
     *
     * @param languageVersion the languageVersion value to set.
     * @return the SandboxCustomImageInner object itself.
     */
    public SandboxCustomImageInner withLanguageVersion(String languageVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SandboxCustomImageProperties();
        }
        this.innerProperties().withLanguageVersion(languageVersion);
        return this;
    }

    /**
     * Get the requirementsFileContent property: The requirements file content.
     *
     * @return the requirementsFileContent value.
     */
    public String requirementsFileContent() {
        return this.innerProperties() == null ? null : this.innerProperties().requirementsFileContent();
    }

    /**
     * Set the requirementsFileContent property: The requirements file content.
     *
     * @param requirementsFileContent the requirementsFileContent value to set.
     * @return the SandboxCustomImageInner object itself.
     */
    public SandboxCustomImageInner withRequirementsFileContent(String requirementsFileContent) {
        if (this.innerProperties() == null) {
            this.innerProperties = new SandboxCustomImageProperties();
        }
        this.innerProperties().withRequirementsFileContent(requirementsFileContent);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioned state of the resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
