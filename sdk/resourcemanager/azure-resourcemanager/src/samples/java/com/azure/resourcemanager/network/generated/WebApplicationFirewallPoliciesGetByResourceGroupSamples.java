// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for WebApplicationFirewallPolicies GetByResourceGroup.
 */
public final class WebApplicationFirewallPoliciesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/WafPolicyGet.json
     */
    /**
     * Sample code: Gets a WAF policy within a resource group.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsAWAFPolicyWithinAResourceGroup(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getWebApplicationFirewallPolicies()
            .getByResourceGroupWithResponse("rg1", "Policy1", com.azure.core.util.Context.NONE);
    }
}
