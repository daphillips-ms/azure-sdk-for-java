// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the status of a service of a HDInsight on AKS cluster.
 */
@Fluent
public final class ServiceStatus {
    /*
     * Kind of the service. E.g. "Zookeeper".
     */
    @JsonProperty(value = "kind", required = true)
    private String kind;

    /*
     * Indicates if the service is ready / healthy. Values can be "true", "false", "unknown" or anything else.
     */
    @JsonProperty(value = "ready", required = true)
    private String ready;

    /*
     * A message describing the error if any.
     */
    @JsonProperty(value = "message")
    private String message;

    /**
     * Creates an instance of ServiceStatus class.
     */
    public ServiceStatus() {
    }

    /**
     * Get the kind property: Kind of the service. E.g. "Zookeeper".
     * 
     * @return the kind value.
     */
    public String kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Kind of the service. E.g. "Zookeeper".
     * 
     * @param kind the kind value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the ready property: Indicates if the service is ready / healthy. Values can be "true", "false", "unknown" or
     * anything else.
     * 
     * @return the ready value.
     */
    public String ready() {
        return this.ready;
    }

    /**
     * Set the ready property: Indicates if the service is ready / healthy. Values can be "true", "false", "unknown" or
     * anything else.
     * 
     * @param ready the ready value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus withReady(String ready) {
        this.ready = ready;
        return this;
    }

    /**
     * Get the message property: A message describing the error if any.
     * 
     * @return the message value.
     */
    public String message() {
        return this.message;
    }

    /**
     * Set the message property: A message describing the error if any.
     * 
     * @param message the message value to set.
     * @return the ServiceStatus object itself.
     */
    public ServiceStatus withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (kind() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property kind in model ServiceStatus"));
        }
        if (ready() == null) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("Missing required property ready in model ServiceStatus"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ServiceStatus.class);
}
