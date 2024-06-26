// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Automation key permissions. */
public final class AutomationKeyPermissions extends ExpandableStringEnum<AutomationKeyPermissions> {
    /** Static value Read for AutomationKeyPermissions. */
    public static final AutomationKeyPermissions READ = fromString("Read");

    /** Static value Full for AutomationKeyPermissions. */
    public static final AutomationKeyPermissions FULL = fromString("Full");

    /**
     * Creates or finds a AutomationKeyPermissions from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AutomationKeyPermissions.
     */
    @JsonCreator
    public static AutomationKeyPermissions fromString(String name) {
        return fromString(name, AutomationKeyPermissions.class);
    }

    /**
     * Gets known AutomationKeyPermissions values.
     *
     * @return known AutomationKeyPermissions values.
     */
    public static Collection<AutomationKeyPermissions> values() {
        return values(AutomationKeyPermissions.class);
    }
}
