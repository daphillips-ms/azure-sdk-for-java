// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Azure Web Category Properties. */
@Immutable
public final class AzureWebCategoryPropertiesFormat {
    /*
     * The name of the group that the category belongs to.
     */
    @JsonProperty(value = "group", access = JsonProperty.Access.WRITE_ONLY)
    private String group;

    /**
     * Get the group property: The name of the group that the category belongs to.
     *
     * @return the group value.
     */
    public String group() {
        return this.group;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
