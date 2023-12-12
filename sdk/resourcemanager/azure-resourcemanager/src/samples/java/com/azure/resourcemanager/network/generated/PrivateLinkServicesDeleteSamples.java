// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.generated;

/**
 * Samples for PrivateLinkServices Delete.
 */
public final class PrivateLinkServicesDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/network/resource-manager/Microsoft.Network/stable/2023-06-01/examples/PrivateLinkServiceDelete.json
     */
    /**
     * Sample code: Delete private link service.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void deletePrivateLinkService(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.networks().manager().serviceClient().getPrivateLinkServices().delete("rg1", "testPls",
            com.azure.core.util.Context.NONE);
    }
}
