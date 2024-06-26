// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * A list of Library resources.
 */
@Fluent
public final class LibraryListResponse {
    /*
     * List of Library.
     */
    @JsonProperty(value = "value", required = true)
    private List<LibraryResource> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of LibraryListResponse class.
     */
    public LibraryListResponse() {
    }

    /**
     * Get the value property: List of Library.
     * 
     * @return the value value.
     */
    public List<LibraryResource> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of Library.
     * 
     * @param value the value value to set.
     * @return the LibraryListResponse object itself.
     */
    public LibraryListResponse setValue(List<LibraryResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     * 
     * @param nextLink the nextLink value to set.
     * @return the LibraryListResponse object itself.
     */
    public LibraryListResponse setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
