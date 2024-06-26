// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Strictly used in update requests. */
@Fluent
public class PartialMinimalTrackedResourceWithIdentity extends PartialMinimalTrackedResource {
    /*
     * Managed service identity (system assigned and/or user assigned identities)
     */
    @JsonProperty(value = "identity")
    private PartialManagedServiceIdentity identity;

    /** Creates an instance of PartialMinimalTrackedResourceWithIdentity class. */
    public PartialMinimalTrackedResourceWithIdentity() {
    }

    /**
     * Get the identity property: Managed service identity (system assigned and/or user assigned identities).
     *
     * @return the identity value.
     */
    public PartialManagedServiceIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Managed service identity (system assigned and/or user assigned identities).
     *
     * @param identity the identity value to set.
     * @return the PartialMinimalTrackedResourceWithIdentity object itself.
     */
    public PartialMinimalTrackedResourceWithIdentity withIdentity(PartialManagedServiceIdentity identity) {
        this.identity = identity;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PartialMinimalTrackedResourceWithIdentity withTags(Map<String, String> tags) {
        super.withTags(tags);
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
