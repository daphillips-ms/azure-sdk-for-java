// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Properties of a database query. */
@Fluent
public final class QueryProperties {
    /*
     * Query text.
     */
    @JsonProperty(value = "queryText")
    private String queryText;

    /** Creates an instance of QueryProperties class. */
    public QueryProperties() {
    }

    /**
     * Get the queryText property: Query text.
     *
     * @return the queryText value.
     */
    public String queryText() {
        return this.queryText;
    }

    /**
     * Set the queryText property: Query text.
     *
     * @param queryText the queryText value to set.
     * @return the QueryProperties object itself.
     */
    public QueryProperties withQueryText(String queryText) {
        this.queryText = queryText;
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
