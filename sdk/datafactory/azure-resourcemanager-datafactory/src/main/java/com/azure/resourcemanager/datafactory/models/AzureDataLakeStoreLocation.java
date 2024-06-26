// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The location of azure data lake store dataset.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "type",
    defaultImpl = AzureDataLakeStoreLocation.class,
    visible = true)
@JsonTypeName("AzureDataLakeStoreLocation")
@Fluent
public final class AzureDataLakeStoreLocation extends DatasetLocation {
    /*
     * Type of dataset storage location.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "AzureDataLakeStoreLocation";

    /**
     * Creates an instance of AzureDataLakeStoreLocation class.
     */
    public AzureDataLakeStoreLocation() {
    }

    /**
     * Get the type property: Type of dataset storage location.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreLocation withFolderPath(Object folderPath) {
        super.withFolderPath(folderPath);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AzureDataLakeStoreLocation withFileName(Object fileName) {
        super.withFileName(fileName);
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
