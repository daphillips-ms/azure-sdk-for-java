// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.fasterxml.jackson.annotation.JsonProperty;

/** OpenId Connect Provider details. */
@Fluent
public final class OpenidConnectProviderContractInner extends ProxyResource {
    /*
     * OpenId Connect Provider contract properties.
     */
    @JsonProperty(value = "properties")
    private OpenidConnectProviderContractProperties innerProperties;

    /** Creates an instance of OpenidConnectProviderContractInner class. */
    public OpenidConnectProviderContractInner() {
    }

    /**
     * Get the innerProperties property: OpenId Connect Provider contract properties.
     *
     * @return the innerProperties value.
     */
    private OpenidConnectProviderContractProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the displayName property: User-friendly OpenID Connect Provider name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: User-friendly OpenID Connect Provider name.
     *
     * @param displayName the displayName value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the description property: User-friendly description of OpenID Connect Provider.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: User-friendly description of OpenID Connect Provider.
     *
     * @param description the description value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the metadataEndpoint property: Metadata endpoint URI.
     *
     * @return the metadataEndpoint value.
     */
    public String metadataEndpoint() {
        return this.innerProperties() == null ? null : this.innerProperties().metadataEndpoint();
    }

    /**
     * Set the metadataEndpoint property: Metadata endpoint URI.
     *
     * @param metadataEndpoint the metadataEndpoint value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withMetadataEndpoint(String metadataEndpoint) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withMetadataEndpoint(metadataEndpoint);
        return this;
    }

    /**
     * Get the clientId property: Client ID of developer console which is the client application.
     *
     * @return the clientId value.
     */
    public String clientId() {
        return this.innerProperties() == null ? null : this.innerProperties().clientId();
    }

    /**
     * Set the clientId property: Client ID of developer console which is the client application.
     *
     * @param clientId the clientId value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withClientId(String clientId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withClientId(clientId);
        return this;
    }

    /**
     * Get the clientSecret property: Client Secret of developer console which is the client application.
     *
     * @return the clientSecret value.
     */
    public String clientSecret() {
        return this.innerProperties() == null ? null : this.innerProperties().clientSecret();
    }

    /**
     * Set the clientSecret property: Client Secret of developer console which is the client application.
     *
     * @param clientSecret the clientSecret value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withClientSecret(String clientSecret) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withClientSecret(clientSecret);
        return this;
    }

    /**
     * Get the useInTestConsole property: If true, the Open ID Connect provider may be used in the developer portal test
     * console. True by default if no value is provided.
     *
     * @return the useInTestConsole value.
     */
    public Boolean useInTestConsole() {
        return this.innerProperties() == null ? null : this.innerProperties().useInTestConsole();
    }

    /**
     * Set the useInTestConsole property: If true, the Open ID Connect provider may be used in the developer portal test
     * console. True by default if no value is provided.
     *
     * @param useInTestConsole the useInTestConsole value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withUseInTestConsole(Boolean useInTestConsole) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withUseInTestConsole(useInTestConsole);
        return this;
    }

    /**
     * Get the useInApiDocumentation property: If true, the Open ID Connect provider will be used in the API
     * documentation in the developer portal. False by default if no value is provided.
     *
     * @return the useInApiDocumentation value.
     */
    public Boolean useInApiDocumentation() {
        return this.innerProperties() == null ? null : this.innerProperties().useInApiDocumentation();
    }

    /**
     * Set the useInApiDocumentation property: If true, the Open ID Connect provider will be used in the API
     * documentation in the developer portal. False by default if no value is provided.
     *
     * @param useInApiDocumentation the useInApiDocumentation value to set.
     * @return the OpenidConnectProviderContractInner object itself.
     */
    public OpenidConnectProviderContractInner withUseInApiDocumentation(Boolean useInApiDocumentation) {
        if (this.innerProperties() == null) {
            this.innerProperties = new OpenidConnectProviderContractProperties();
        }
        this.innerProperties().withUseInApiDocumentation(useInApiDocumentation);
        return this;
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
