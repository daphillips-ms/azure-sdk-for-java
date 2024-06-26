// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeNodeInner;
import com.azure.resourcemanager.datafactory.fluent.models.SelfHostedIntegrationRuntimeStatusTypeProperties;
import com.azure.resourcemanager.datafactory.models.LinkedIntegrationRuntime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public final class SelfHostedIntegrationRuntimeStatusTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model = BinaryData.fromString(
            "{\"createTime\":\"2021-11-07T15:55:44Z\",\"taskQueueId\":\"tkviptqhatfgkhhb\",\"internalChannelEncryption\":\"SslEncrypted\",\"version\":\"gkd\",\"nodes\":[{\"nodeName\":\"hhbupqo\",\"machineName\":\"whvqih\",\"hostServiceUri\":\"hqjdcbgcemjti\",\"status\":\"Limited\",\"capabilities\":{\"raxil\":\"calyqz\",\"rhiehxjou\":\"dxcmpdmdsypks\"},\"versionStatus\":\"ehs\",\"version\":\"c\",\"registerTime\":\"2021-06-14T23:46:34Z\",\"lastConnectTime\":\"2021-07-02T12:32:20Z\",\"expiryTime\":\"2021-07-05T04:08:34Z\",\"lastStartTime\":\"2021-09-18T17:50:18Z\",\"lastStopTime\":\"2021-01-07T23:07:29Z\",\"lastUpdateResult\":\"None\",\"lastStartUpdateTime\":\"2021-06-29T12:45:21Z\",\"lastEndUpdateTime\":\"2021-07-20T14:11:23Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1062834096,\"maxConcurrentJobs\":93393411,\"\":{\"fzwiztvucyackgk\":\"datapuku\",\"pcohfksixvwkp\":\"datavpmg\"}},{\"nodeName\":\"smurjab\",\"machineName\":\"xohagcojgmyzjd\",\"hostServiceUri\":\"qehrqtgdipb\",\"status\":\"Upgrading\",\"capabilities\":{\"g\":\"yu\",\"jyxyunypf\":\"zsebkbfykgmwurcx\",\"jxr\":\"vjgovbbn\",\"nk\":\"aqgmztlru\"},\"versionStatus\":\"upmqffgjsq\",\"version\":\"airoog\",\"registerTime\":\"2021-11-18T20:03:20Z\",\"lastConnectTime\":\"2021-07-02T09:43:33Z\",\"expiryTime\":\"2021-07-21T15:52:53Z\",\"lastStartTime\":\"2021-03-14T06:17:38Z\",\"lastStopTime\":\"2021-01-15T04:09:58Z\",\"lastUpdateResult\":\"Fail\",\"lastStartUpdateTime\":\"2021-07-27T22:50:59Z\",\"lastEndUpdateTime\":\"2021-07-09T19:19:44Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1576744134,\"maxConcurrentJobs\":479771092,\"\":{\"ibtrwgljfa\":\"datarvtf\",\"phgimyomje\":\"dataezdxqhj\",\"uxkepga\":\"datalgnieeqjdfxxxnn\"}},{\"nodeName\":\"ijbiterqfuterrca\",\"machineName\":\"pfqddwwpg\",\"hostServiceUri\":\"awupqkv\",\"status\":\"Online\",\"capabilities\":{\"agw\":\"efrxzwvcvtjdq\",\"rpxj\":\"jafbdvpcdzdbjz\",\"ngvgjgcwwuusjjht\":\"raupirvdonka\"},\"versionStatus\":\"znrhig\",\"version\":\"xhgmfrnktsvwqda\",\"registerTime\":\"2021-12-05T12:31:27Z\",\"lastConnectTime\":\"2021-06-02T09:55:30Z\",\"expiryTime\":\"2021-11-11T22:05:39Z\",\"lastStartTime\":\"2021-03-05T22:36:17Z\",\"lastStopTime\":\"2021-08-24T07:44Z\",\"lastUpdateResult\":\"Succeed\",\"lastStartUpdateTime\":\"2021-07-14T19:29:42Z\",\"lastEndUpdateTime\":\"2021-12-03T04:46:12Z\",\"isActiveDispatcher\":false,\"concurrentJobsLimit\":1620576978,\"maxConcurrentJobs\":2087234500,\"\":{\"ecweo\":\"dataasflg\",\"wvzapybdeea\":\"datalerpt\",\"eirjrkak\":\"dataigbpabacp\",\"bmazlxlbd\":\"datavnd\"}}],\"scheduledUpdateDate\":\"2021-05-27T01:49Z\",\"updateDelayOffset\":\"gqeyqrlg\",\"localTimeZoneOffset\":\"ypbekpardoad\",\"capabilities\":{\"bzmgzsytmp\":\"xzgy\",\"vsqsbqr\":\"slr\",\"jzijxefydck\":\"bpiqfstkdl\"},\"serviceUrls\":[\"z\"],\"autoUpdate\":\"On\",\"versionStatus\":\"kiwpadnh\",\"links\":[{\"name\":\"nit\",\"subscriptionId\":\"gotfrdlfewexbr\",\"dataFactoryName\":\"dyriy\",\"dataFactoryLocation\":\"ybigksnijclfdpr\",\"createTime\":\"2021-07-31T05:09:25Z\"},{\"name\":\"zxeigydd\",\"subscriptionId\":\"n\",\"dataFactoryName\":\"xerzypcral\",\"dataFactoryLocation\":\"cnmrbizxqldmhzb\",\"createTime\":\"2021-09-06T08:51:46Z\"},{\"name\":\"zlgyerm\",\"subscriptionId\":\"mnyuh\",\"dataFactoryName\":\"pbf\",\"dataFactoryLocation\":\"cbweab\",\"createTime\":\"2021-05-12T10:51:07Z\"}],\"pushedVersion\":\"kuquvcgvnomlcldo\",\"latestVersion\":\"huafu\",\"autoUpdateETA\":\"2020-12-26T05:11:47Z\",\"selfContainedInteractiveAuthoringEnabled\":false}")
            .toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SelfHostedIntegrationRuntimeStatusTypeProperties model
            = new SelfHostedIntegrationRuntimeStatusTypeProperties()
                .withNodes(Arrays.asList(
                    new SelfHostedIntegrationRuntimeNodeInner()
                        .withAdditionalProperties(mapOf("nodeName", "hhbupqo", "lastStartUpdateTime",
                            "2021-06-29T12:45:21Z", "lastConnectTime", "2021-07-02T12:32:20Z", "capabilities",
                            JacksonAdapter.createDefaultSerializerAdapter()
                                .deserialize(
                                    "{\"raxil\":\"calyqz\",\"rhiehxjou\":\"dxcmpdmdsypks\"}", Object.class,
                                    SerializerEncoding.JSON),
                            "hostServiceUri", "hqjdcbgcemjti", "registerTime", "2021-06-14T23:46:34Z",
                            "maxConcurrentJobs", 93393411, "lastStopTime", "2021-01-07T23:07:29Z", "version", "c",
                            "machineName", "whvqih", "versionStatus", "ehs", "concurrentJobsLimit", 1062834096,
                            "lastEndUpdateTime", "2021-07-20T14:11:23Z", "expiryTime", "2021-07-05T04:08:34Z",
                            "lastStartTime", "2021-09-18T17:50:18Z", "lastUpdateResult", "None", "isActiveDispatcher",
                            false, "status", "Limited")),
                    new SelfHostedIntegrationRuntimeNodeInner().withAdditionalProperties(mapOf("nodeName", "smurjab",
                        "lastStartUpdateTime", "2021-07-27T22:50:59Z", "lastConnectTime", "2021-07-02T09:43:33Z",
                        "capabilities",
                        JacksonAdapter.createDefaultSerializerAdapter()
                            .deserialize(
                                "{\"g\":\"yu\",\"jyxyunypf\":\"zsebkbfykgmwurcx\",\"jxr\":\"vjgovbbn\",\"nk\":\"aqgmztlru\"}",
                                Object.class, SerializerEncoding.JSON),
                        "hostServiceUri", "qehrqtgdipb", "registerTime", "2021-11-18T20:03:20Z", "maxConcurrentJobs",
                        479771092, "lastStopTime", "2021-01-15T04:09:58Z", "version", "airoog", "machineName",
                        "xohagcojgmyzjd", "versionStatus", "upmqffgjsq", "concurrentJobsLimit", 1576744134,
                        "lastEndUpdateTime", "2021-07-09T19:19:44Z", "expiryTime", "2021-07-21T15:52:53Z",
                        "lastStartTime", "2021-03-14T06:17:38Z", "lastUpdateResult", "Fail", "isActiveDispatcher",
                        false, "status", "Upgrading")),
                    new SelfHostedIntegrationRuntimeNodeInner().withAdditionalProperties(mapOf("nodeName",
                        "ijbiterqfuterrca", "lastStartUpdateTime", "2021-07-14T19:29:42Z", "lastConnectTime",
                        "2021-06-02T09:55:30Z", "capabilities",
                        JacksonAdapter.createDefaultSerializerAdapter()
                            .deserialize(
                                "{\"agw\":\"efrxzwvcvtjdq\",\"rpxj\":\"jafbdvpcdzdbjz\",\"ngvgjgcwwuusjjht\":\"raupirvdonka\"}",
                                Object.class, SerializerEncoding.JSON),
                        "hostServiceUri", "awupqkv", "registerTime", "2021-12-05T12:31:27Z", "maxConcurrentJobs",
                        2087234500, "lastStopTime", "2021-08-24T07:44Z", "version", "xhgmfrnktsvwqda", "machineName",
                        "pfqddwwpg", "versionStatus", "znrhig", "concurrentJobsLimit", 1620576978, "lastEndUpdateTime",
                        "2021-12-03T04:46:12Z", "expiryTime", "2021-11-11T22:05:39Z", "lastStartTime",
                        "2021-03-05T22:36:17Z", "lastUpdateResult", "Succeed", "isActiveDispatcher", false, "status",
                        "Online"))))
                .withLinks(Arrays.asList(new LinkedIntegrationRuntime(), new LinkedIntegrationRuntime(),
                    new LinkedIntegrationRuntime()));
        model = BinaryData.fromObject(model).toObject(SelfHostedIntegrationRuntimeStatusTypeProperties.class);
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
