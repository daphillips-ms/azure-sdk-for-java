// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.ApiContactInformation;
import com.azure.resourcemanager.apimanagement.models.ApiEntityBaseContract;
import com.azure.resourcemanager.apimanagement.models.ApiLicenseInformation;
import com.azure.resourcemanager.apimanagement.models.ApiType;
import com.azure.resourcemanager.apimanagement.models.AuthenticationSettingsContract;
import com.azure.resourcemanager.apimanagement.models.Protocol;
import com.azure.resourcemanager.apimanagement.models.SubscriptionKeyParameterNamesContract;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** API update contract properties. */
@Fluent
public final class ApiContractUpdateProperties extends ApiEntityBaseContract {
    /*
     * API name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Absolute URL of the backend service implementing this API.
     */
    @JsonProperty(value = "serviceUrl")
    private String serviceUrl;

    /*
     * Relative URL uniquely identifying this API and all of its resource paths
     * within the API Management service instance. It is appended to the API
     * endpoint base URL specified during the service instance creation to form
     * a public URL for this API.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Describes on which protocols the operations in this API can be invoked.
     */
    @JsonProperty(value = "protocols")
    private List<Protocol> protocols;

    /**
     * Get the displayName property: API name.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: API name.
     *
     * @param displayName the displayName value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the serviceUrl property: Absolute URL of the backend service implementing this API.
     *
     * @return the serviceUrl value.
     */
    public String serviceUrl() {
        return this.serviceUrl;
    }

    /**
     * Set the serviceUrl property: Absolute URL of the backend service implementing this API.
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withServiceUrl(String serviceUrl) {
        this.serviceUrl = serviceUrl;
        return this;
    }

    /**
     * Get the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: Relative URL uniquely identifying this API and all of its resource paths within the API
     * Management service instance. It is appended to the API endpoint base URL specified during the service instance
     * creation to form a public URL for this API.
     *
     * @param path the path value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the protocols property: Describes on which protocols the operations in this API can be invoked.
     *
     * @return the protocols value.
     */
    public List<Protocol> protocols() {
        return this.protocols;
    }

    /**
     * Set the protocols property: Describes on which protocols the operations in this API can be invoked.
     *
     * @param protocols the protocols value to set.
     * @return the ApiContractUpdateProperties object itself.
     */
    public ApiContractUpdateProperties withProtocols(List<Protocol> protocols) {
        this.protocols = protocols;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withAuthenticationSettings(
        AuthenticationSettingsContract authenticationSettings) {
        super.withAuthenticationSettings(authenticationSettings);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withSubscriptionKeyParameterNames(
        SubscriptionKeyParameterNamesContract subscriptionKeyParameterNames) {
        super.withSubscriptionKeyParameterNames(subscriptionKeyParameterNames);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withApiType(ApiType apiType) {
        super.withApiType(apiType);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withApiRevision(String apiRevision) {
        super.withApiRevision(apiRevision);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withApiVersion(String apiVersion) {
        super.withApiVersion(apiVersion);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withIsCurrent(Boolean isCurrent) {
        super.withIsCurrent(isCurrent);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withApiRevisionDescription(String apiRevisionDescription) {
        super.withApiRevisionDescription(apiRevisionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withApiVersionDescription(String apiVersionDescription) {
        super.withApiVersionDescription(apiVersionDescription);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withApiVersionSetId(String apiVersionSetId) {
        super.withApiVersionSetId(apiVersionSetId);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withSubscriptionRequired(Boolean subscriptionRequired) {
        super.withSubscriptionRequired(subscriptionRequired);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withTermsOfServiceUrl(String termsOfServiceUrl) {
        super.withTermsOfServiceUrl(termsOfServiceUrl);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withContact(ApiContactInformation contact) {
        super.withContact(contact);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ApiContractUpdateProperties withLicense(ApiLicenseInformation license) {
        super.withLicense(license);
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
    }
}
