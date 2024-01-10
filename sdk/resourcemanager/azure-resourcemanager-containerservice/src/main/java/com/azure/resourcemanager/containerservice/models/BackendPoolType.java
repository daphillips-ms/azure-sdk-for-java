// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The type of the managed inbound Load Balancer BackendPool.
 */
public final class BackendPoolType extends ExpandableStringEnum<BackendPoolType> {
    /**
     * Static value NodeIPConfiguration for BackendPoolType.
     */
    public static final BackendPoolType NODE_IPCONFIGURATION = fromString("NodeIPConfiguration");

    /**
     * Static value NodeIP for BackendPoolType.
     */
    public static final BackendPoolType NODE_IP = fromString("NodeIP");

    /**
     * Creates a new instance of BackendPoolType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public BackendPoolType() {
    }

    /**
     * Creates or finds a BackendPoolType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding BackendPoolType.
     */
    @JsonCreator
    public static BackendPoolType fromString(String name) {
        return fromString(name, BackendPoolType.class);
    }

    /**
     * Gets known BackendPoolType values.
     *
     * @return known BackendPoolType values.
     */
    public static Collection<BackendPoolType> values() {
        return values(BackendPoolType.class);
    }
}
