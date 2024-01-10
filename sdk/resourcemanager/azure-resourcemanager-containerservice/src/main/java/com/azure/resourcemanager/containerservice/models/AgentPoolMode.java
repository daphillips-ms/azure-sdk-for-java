// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * The mode of an agent pool.
 *
 * A cluster must have at least one 'System' Agent Pool at all times. For additional information on agent pool
 * restrictions and best practices, see: https://docs.microsoft.com/azure/aks/use-system-pools.
 */
public final class AgentPoolMode extends ExpandableStringEnum<AgentPoolMode> {
    /**
     * Static value System for AgentPoolMode.
     */
    public static final AgentPoolMode SYSTEM = fromString("System");

    /**
     * Static value User for AgentPoolMode.
     */
    public static final AgentPoolMode USER = fromString("User");

    /**
     * Creates a new instance of AgentPoolMode value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public AgentPoolMode() {
    }

    /**
     * Creates or finds a AgentPoolMode from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AgentPoolMode.
     */
    @JsonCreator
    public static AgentPoolMode fromString(String name) {
        return fromString(name, AgentPoolMode.class);
    }

    /**
     * Gets known AgentPoolMode values.
     *
     * @return known AgentPoolMode values.
     */
    public static Collection<AgentPoolMode> values() {
        return values(AgentPoolMode.class);
    }
}
