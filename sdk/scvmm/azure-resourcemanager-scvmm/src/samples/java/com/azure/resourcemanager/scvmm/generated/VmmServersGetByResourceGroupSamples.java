// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.generated;

import com.azure.core.util.Context;

/** Samples for VmmServers GetByResourceGroup. */
public final class VmmServersGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/scvmm/resource-manager/Microsoft.ScVmm/preview/2020-06-05-preview/examples/GetVMMServer.json
     */
    /**
     * Sample code: GetVMMServer.
     *
     * @param manager Entry point to ScvmmManager.
     */
    public static void getVMMServer(com.azure.resourcemanager.scvmm.ScvmmManager manager) {
        manager.vmmServers().getByResourceGroupWithResponse("testrg", "ContosoVMMServer", Context.NONE);
    }
}
