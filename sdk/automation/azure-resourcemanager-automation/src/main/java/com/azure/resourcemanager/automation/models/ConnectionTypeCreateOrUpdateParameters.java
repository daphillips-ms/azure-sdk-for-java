// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.automation.fluent.models.ConnectionTypeCreateOrUpdateProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The parameters supplied to the create or update connection type operation. */
@Fluent
public final class ConnectionTypeCreateOrUpdateParameters {
    /*
     * Gets or sets the name of the connection type.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /*
     * Gets or sets the value of the connection type.
     */
    @JsonProperty(value = "properties", required = true)
    private ConnectionTypeCreateOrUpdateProperties innerProperties = new ConnectionTypeCreateOrUpdateProperties();

    /**
     * Get the name property: Gets or sets the name of the connection type.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Gets or sets the name of the connection type.
     *
     * @param name the name value to set.
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the innerProperties property: Gets or sets the value of the connection type.
     *
     * @return the innerProperties value.
     */
    private ConnectionTypeCreateOrUpdateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the isGlobal property: Gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @return the isGlobal value.
     */
    public Boolean isGlobal() {
        return this.innerProperties() == null ? null : this.innerProperties().isGlobal();
    }

    /**
     * Set the isGlobal property: Gets or sets a Boolean value to indicate if the connection type is global.
     *
     * @param isGlobal the isGlobal value to set.
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withIsGlobal(Boolean isGlobal) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionTypeCreateOrUpdateProperties();
        }
        this.innerProperties().withIsGlobal(isGlobal);
        return this;
    }

    /**
     * Get the fieldDefinitions property: Gets or sets the field definitions of the connection type.
     *
     * @return the fieldDefinitions value.
     */
    public Map<String, FieldDefinition> fieldDefinitions() {
        return this.innerProperties() == null ? null : this.innerProperties().fieldDefinitions();
    }

    /**
     * Set the fieldDefinitions property: Gets or sets the field definitions of the connection type.
     *
     * @param fieldDefinitions the fieldDefinitions value to set.
     * @return the ConnectionTypeCreateOrUpdateParameters object itself.
     */
    public ConnectionTypeCreateOrUpdateParameters withFieldDefinitions(Map<String, FieldDefinition> fieldDefinitions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ConnectionTypeCreateOrUpdateProperties();
        }
        this.innerProperties().withFieldDefinitions(fieldDefinitions);
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
                    new IllegalArgumentException(
                        "Missing required property name in model ConnectionTypeCreateOrUpdateParameters"));
        }
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model ConnectionTypeCreateOrUpdateParameters"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ConnectionTypeCreateOrUpdateParameters.class);
}
