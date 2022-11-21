// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.fluent.models.WebPubSubProperties;
import com.azure.resourcemanager.webpubsub.models.AclAction;
import com.azure.resourcemanager.webpubsub.models.LiveTraceCategory;
import com.azure.resourcemanager.webpubsub.models.LiveTraceConfiguration;
import com.azure.resourcemanager.webpubsub.models.NetworkAcl;
import com.azure.resourcemanager.webpubsub.models.PrivateEndpointAcl;
import com.azure.resourcemanager.webpubsub.models.ResourceLogCategory;
import com.azure.resourcemanager.webpubsub.models.ResourceLogConfiguration;
import com.azure.resourcemanager.webpubsub.models.WebPubSubNetworkACLs;
import com.azure.resourcemanager.webpubsub.models.WebPubSubRequestType;
import com.azure.resourcemanager.webpubsub.models.WebPubSubTlsSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class WebPubSubPropertiesTests {
    @Test
    public void testDeserialize() {
        WebPubSubProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Canceled\",\"externalIP\":\"iwwzjuqk\",\"hostName\":\"sa\",\"publicPort\":1410521625,\"serverPort\":481973669,\"version\":\"foskghsauuimj\",\"privateEndpointConnections\":[{\"properties\":{\"provisioningState\":\"Creating\",\"groupIds\":[]},\"id\":\"dyjrrfbyaosv\",\"name\":\"xc\",\"type\":\"onpc\"},{\"properties\":{\"provisioningState\":\"Moving\",\"groupIds\":[]},\"id\":\"kevle\",\"name\":\"gz\",\"type\":\"buhfmvfaxkffeiit\"},{\"properties\":{\"provisioningState\":\"Running\",\"groupIds\":[]},\"id\":\"shxmzsbbzoggigrx\",\"name\":\"burvjxxjnspy\",\"type\":\"ptkoenkoukn\"},{\"properties\":{\"provisioningState\":\"Unknown\",\"groupIds\":[]},\"id\":\"bldngkpoc\",\"name\":\"pazyxoegukg\",\"type\":\"npiucgygevqznty\"}],\"sharedPrivateLinkResources\":[{\"properties\":{\"groupId\":\"izcdrqjsd\",\"privateLinkResourceId\":\"ydnfyhxdeoejz\",\"provisioningState\":\"Failed\",\"requestMessage\":\"fsj\",\"status\":\"Rejected\"},\"id\":\"zfbishcbkhaj\",\"name\":\"eyeam\",\"type\":\"p\"},{\"properties\":{\"groupId\":\"alpbuxwgipwhon\",\"privateLinkResourceId\":\"wkgshwa\",\"provisioningState\":\"Failed\",\"requestMessage\":\"zbinjeputtm\",\"status\":\"Timeout\"},\"id\":\"nuzo\",\"name\":\"ftiyqzrnkcq\",\"type\":\"yx\"}],\"tls\":{\"clientCertEnabled\":false},\"hostNamePrefix\":\"sicohoqqnwvlry\",\"liveTraceConfiguration\":{\"enabled\":\"hheunmmqhgyx\",\"categories\":[{\"name\":\"ocukoklyax\",\"enabled\":\"onuq\"},{\"name\":\"fkbey\",\"enabled\":\"wrmjmwvvjektc\"}]},\"resourceLogConfiguration\":{\"categories\":[{\"name\":\"wlrsffrzpwv\",\"enabled\":\"dqgbiqylihkaetc\"},{\"name\":\"vfcivfsnkymuc\",\"enabled\":\"hjfbebrjcxe\"},{\"name\":\"uwutttxfvjrbi\",\"enabled\":\"hxepcyvahfnlj\"},{\"name\":\"qxj\",\"enabled\":\"ujqgidok\"}]},\"networkACLs\":{\"defaultAction\":\"Deny\",\"publicNetwork\":{\"allow\":[\"ClientConnection\",\"RESTAPI\"],\"deny\":[\"RESTAPI\",\"Trace\",\"RESTAPI\"]},\"privateEndpoints\":[{\"name\":\"c\",\"allow\":[],\"deny\":[]},{\"name\":\"jeszzhbijhtxfv\",\"allow\":[],\"deny\":[]}]},\"publicNetworkAccess\":\"smx\",\"disableLocalAuth\":false,\"disableAadAuth\":true}")
                .toObject(WebPubSubProperties.class);
        Assertions.assertEquals(false, model.tls().clientCertEnabled());
        Assertions.assertEquals("hheunmmqhgyx", model.liveTraceConfiguration().enabled());
        Assertions.assertEquals("ocukoklyax", model.liveTraceConfiguration().categories().get(0).name());
        Assertions.assertEquals("onuq", model.liveTraceConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("wlrsffrzpwv", model.resourceLogConfiguration().categories().get(0).name());
        Assertions.assertEquals("dqgbiqylihkaetc", model.resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals(AclAction.DENY, model.networkACLs().defaultAction());
        Assertions
            .assertEquals(WebPubSubRequestType.CLIENT_CONNECTION, model.networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.RESTAPI, model.networkACLs().publicNetwork().deny().get(0));
        Assertions.assertEquals("c", model.networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("smx", model.publicNetworkAccess());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(true, model.disableAadAuth());
    }

    @Test
    public void testSerialize() {
        WebPubSubProperties model =
            new WebPubSubProperties()
                .withTls(new WebPubSubTlsSettings().withClientCertEnabled(false))
                .withLiveTraceConfiguration(
                    new LiveTraceConfiguration()
                        .withEnabled("hheunmmqhgyx")
                        .withCategories(
                            Arrays
                                .asList(
                                    new LiveTraceCategory().withName("ocukoklyax").withEnabled("onuq"),
                                    new LiveTraceCategory().withName("fkbey").withEnabled("wrmjmwvvjektc"))))
                .withResourceLogConfiguration(
                    new ResourceLogConfiguration()
                        .withCategories(
                            Arrays
                                .asList(
                                    new ResourceLogCategory().withName("wlrsffrzpwv").withEnabled("dqgbiqylihkaetc"),
                                    new ResourceLogCategory().withName("vfcivfsnkymuc").withEnabled("hjfbebrjcxe"),
                                    new ResourceLogCategory().withName("uwutttxfvjrbi").withEnabled("hxepcyvahfnlj"),
                                    new ResourceLogCategory().withName("qxj").withEnabled("ujqgidok"))))
                .withNetworkACLs(
                    new WebPubSubNetworkACLs()
                        .withDefaultAction(AclAction.DENY)
                        .withPublicNetwork(
                            new NetworkAcl()
                                .withAllow(
                                    Arrays.asList(WebPubSubRequestType.CLIENT_CONNECTION, WebPubSubRequestType.RESTAPI))
                                .withDeny(
                                    Arrays
                                        .asList(
                                            WebPubSubRequestType.RESTAPI,
                                            WebPubSubRequestType.TRACE,
                                            WebPubSubRequestType.RESTAPI)))
                        .withPrivateEndpoints(
                            Arrays
                                .asList(
                                    new PrivateEndpointAcl()
                                        .withAllow(Arrays.asList())
                                        .withDeny(Arrays.asList())
                                        .withName("c"),
                                    new PrivateEndpointAcl()
                                        .withAllow(Arrays.asList())
                                        .withDeny(Arrays.asList())
                                        .withName("jeszzhbijhtxfv"))))
                .withPublicNetworkAccess("smx")
                .withDisableLocalAuth(false)
                .withDisableAadAuth(true);
        model = BinaryData.fromObject(model).toObject(WebPubSubProperties.class);
        Assertions.assertEquals(false, model.tls().clientCertEnabled());
        Assertions.assertEquals("hheunmmqhgyx", model.liveTraceConfiguration().enabled());
        Assertions.assertEquals("ocukoklyax", model.liveTraceConfiguration().categories().get(0).name());
        Assertions.assertEquals("onuq", model.liveTraceConfiguration().categories().get(0).enabled());
        Assertions.assertEquals("wlrsffrzpwv", model.resourceLogConfiguration().categories().get(0).name());
        Assertions.assertEquals("dqgbiqylihkaetc", model.resourceLogConfiguration().categories().get(0).enabled());
        Assertions.assertEquals(AclAction.DENY, model.networkACLs().defaultAction());
        Assertions
            .assertEquals(WebPubSubRequestType.CLIENT_CONNECTION, model.networkACLs().publicNetwork().allow().get(0));
        Assertions.assertEquals(WebPubSubRequestType.RESTAPI, model.networkACLs().publicNetwork().deny().get(0));
        Assertions.assertEquals("c", model.networkACLs().privateEndpoints().get(0).name());
        Assertions.assertEquals("smx", model.publicNetworkAccess());
        Assertions.assertEquals(false, model.disableLocalAuth());
        Assertions.assertEquals(true, model.disableAadAuth());
    }
}