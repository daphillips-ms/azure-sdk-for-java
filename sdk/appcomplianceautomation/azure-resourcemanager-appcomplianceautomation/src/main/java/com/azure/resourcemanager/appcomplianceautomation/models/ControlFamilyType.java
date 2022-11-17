// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcomplianceautomation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Indicates the control family type. */
public final class ControlFamilyType extends ExpandableStringEnum<ControlFamilyType> {
    /** Static value FullyAutomated for ControlFamilyType. */
    public static final ControlFamilyType FULLY_AUTOMATED = fromString("FullyAutomated");

    /** Static value PartiallyAutomated for ControlFamilyType. */
    public static final ControlFamilyType PARTIALLY_AUTOMATED = fromString("PartiallyAutomated");

    /** Static value Manual for ControlFamilyType. */
    public static final ControlFamilyType MANUAL = fromString("Manual");

    /**
     * Creates or finds a ControlFamilyType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ControlFamilyType.
     */
    @JsonCreator
    public static ControlFamilyType fromString(String name) {
        return fromString(name, ControlFamilyType.class);
    }

    /**
     * Gets known ControlFamilyType values.
     *
     * @return known ControlFamilyType values.
     */
    public static Collection<ControlFamilyType> values() {
        return values(ControlFamilyType.class);
    }
}