// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

/** Samples for WebPubSub ListByResourceGroup. */
public final class WebPubSubListByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/webpubsub/resource-manager/Microsoft.SignalRService/preview/2023-06-01-preview/examples/WebPubSub_ListByResourceGroup.json
     */
    /**
     * Sample code: WebPubSub_ListByResourceGroup.
     *
     * @param manager Entry point to WebPubSubManager.
     */
    public static void webPubSubListByResourceGroup(com.azure.resourcemanager.webpubsub.WebPubSubManager manager) {
        manager.webPubSubs().listByResourceGroup("myResourceGroup", com.azure.core.util.Context.NONE);
    }
}
