// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.resources.fluent.ResourceNamesClient;
import com.azure.resourcemanager.resources.fluent.SubscriptionClient;
import com.azure.resourcemanager.resources.fluent.SubscriptionsClient;
import com.azure.resourcemanager.resources.fluent.TenantsClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the SubscriptionClientImpl type. */
@ServiceClient(builder = SubscriptionClientBuilder.class)
public final class SubscriptionClientImpl extends AzureServiceClient implements SubscriptionClient {
    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The SubscriptionsClient object to access its operations. */
    private final SubscriptionsClient subscriptions;

    /**
     * Gets the SubscriptionsClient object to access its operations.
     *
     * @return the SubscriptionsClient object.
     */
    public SubscriptionsClient getSubscriptions() {
        return this.subscriptions;
    }

    /** The TenantsClient object to access its operations. */
    private final TenantsClient tenants;

    /**
     * Gets the TenantsClient object to access its operations.
     *
     * @return the TenantsClient object.
     */
    public TenantsClient getTenants() {
        return this.tenants;
    }

    /** The ResourceNamesClient object to access its operations. */
    private final ResourceNamesClient resourceNames;

    /**
     * Gets the ResourceNamesClient object to access its operations.
     *
     * @return the ResourceNamesClient object.
     */
    public ResourceNamesClient getResourceNames() {
        return this.resourceNames;
    }

    /**
     * Initializes an instance of SubscriptionClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param endpoint server parameter.
     */
    SubscriptionClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.endpoint = endpoint;
        this.apiVersion = "2021-01-01";
        this.subscriptions = new SubscriptionsClientImpl(this);
        this.tenants = new TenantsClientImpl(this);
        this.resourceNames = new ResourceNamesClientImpl(this);
    }
}
