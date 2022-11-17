// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The WorkspaceConnectionPropertiesV2 model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "authType",
    defaultImpl = WorkspaceConnectionPropertiesV2.class)
@JsonTypeName("WorkspaceConnectionPropertiesV2")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "PAT", value = PatAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "SAS", value = SasAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "UsernamePassword", value = UsernamePasswordAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "None", value = NoneAuthTypeWorkspaceConnectionProperties.class),
    @JsonSubTypes.Type(name = "ManagedIdentity", value = ManagedIdentityAuthTypeWorkspaceConnectionProperties.class)
})
@Fluent
public class WorkspaceConnectionPropertiesV2 {
    /*
     * Category of the connection
     */
    @JsonProperty(value = "category")
    private ConnectionCategory category;

    /*
     * The target property.
     */
    @JsonProperty(value = "target")
    private String target;

    /*
     * Value details of the workspace connection.
     */
    @JsonProperty(value = "value")
    private String value;

    /*
     * format for the workspace connection value
     */
    @JsonProperty(value = "valueFormat")
    private ValueFormat valueFormat;

    /** Creates an instance of WorkspaceConnectionPropertiesV2 class. */
    public WorkspaceConnectionPropertiesV2() {
    }

    /**
     * Get the category property: Category of the connection.
     *
     * @return the category value.
     */
    public ConnectionCategory category() {
        return this.category;
    }

    /**
     * Set the category property: Category of the connection.
     *
     * @param category the category value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withCategory(ConnectionCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get the target property: The target property.
     *
     * @return the target value.
     */
    public String target() {
        return this.target;
    }

    /**
     * Set the target property: The target property.
     *
     * @param target the target value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get the value property: Value details of the workspace connection.
     *
     * @return the value value.
     */
    public String value() {
        return this.value;
    }

    /**
     * Set the value property: Value details of the workspace connection.
     *
     * @param value the value value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withValue(String value) {
        this.value = value;
        return this;
    }

    /**
     * Get the valueFormat property: format for the workspace connection value.
     *
     * @return the valueFormat value.
     */
    public ValueFormat valueFormat() {
        return this.valueFormat;
    }

    /**
     * Set the valueFormat property: format for the workspace connection value.
     *
     * @param valueFormat the valueFormat value to set.
     * @return the WorkspaceConnectionPropertiesV2 object itself.
     */
    public WorkspaceConnectionPropertiesV2 withValueFormat(ValueFormat valueFormat) {
        this.valueFormat = valueFormat;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}