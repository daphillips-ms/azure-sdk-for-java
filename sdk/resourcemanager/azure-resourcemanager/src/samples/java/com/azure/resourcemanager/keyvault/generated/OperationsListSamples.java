// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.keyvault.generated;

/** Samples for Operations List. */
public final class OperationsListSamples {
    /*
     * x-ms-original-file: specification/keyvault/resource-manager/Microsoft.KeyVault/stable/2023-02-01/examples/listOperations.json
     */
    /**
     * Sample code: Lists available Rest API operations.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void listsAvailableRestAPIOperations(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.vaults().manager().serviceClient().getOperations().list(com.azure.core.util.Context.NONE);
    }
}
