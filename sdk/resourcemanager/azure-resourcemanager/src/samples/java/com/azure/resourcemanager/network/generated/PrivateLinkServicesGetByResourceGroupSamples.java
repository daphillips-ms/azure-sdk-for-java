// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PrivateLinkServices GetByResourceGroup.
 */
public final class PrivateLinkServicesGetByResourceGroupSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/PrivateLinkServiceGet.json
     */
    /**
     * Sample code: Get private link service.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getPrivateLinkService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPrivateLinkServices().getByResourceGroupWithResponse("rg1",
            "testPls", null, com.azure.core.util.Context.NONE);
    }
}
