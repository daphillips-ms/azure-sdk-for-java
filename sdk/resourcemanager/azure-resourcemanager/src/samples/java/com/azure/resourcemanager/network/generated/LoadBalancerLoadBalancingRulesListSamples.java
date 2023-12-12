// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for LoadBalancerLoadBalancingRules List.
 */
public final class LoadBalancerLoadBalancingRulesListSamples {
    /*
     * x-ms-original-file: specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/
     * LoadBalancerLoadBalancingRuleList.json
     */
    /**
     * Sample code: LoadBalancerLoadBalancingRuleList.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void loadBalancerLoadBalancingRuleList(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getLoadBalancerLoadBalancingRules().list("testrg", "lb1",
            com.azure.core.util.Context.NONE);
    }
}
