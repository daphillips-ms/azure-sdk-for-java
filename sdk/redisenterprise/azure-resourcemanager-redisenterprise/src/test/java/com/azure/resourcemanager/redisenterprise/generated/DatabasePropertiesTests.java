// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.redisenterprise.fluent.models.DatabaseProperties;
import com.azure.resourcemanager.redisenterprise.models.AofFrequency;
import com.azure.resourcemanager.redisenterprise.models.ClusteringPolicy;
import com.azure.resourcemanager.redisenterprise.models.DatabasePropertiesGeoReplication;
import com.azure.resourcemanager.redisenterprise.models.EvictionPolicy;
import com.azure.resourcemanager.redisenterprise.models.LinkedDatabase;
import com.azure.resourcemanager.redisenterprise.models.Module;
import com.azure.resourcemanager.redisenterprise.models.Persistence;
import com.azure.resourcemanager.redisenterprise.models.Protocol;
import com.azure.resourcemanager.redisenterprise.models.RdbFrequency;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseProperties model = BinaryData.fromString(
            "{\"clientProtocol\":\"Plaintext\",\"port\":1860899173,\"provisioningState\":\"Deleting\",\"resourceState\":\"CreateFailed\",\"clusteringPolicy\":\"EnterpriseCluster\",\"evictionPolicy\":\"NoEviction\",\"persistence\":{\"aofEnabled\":true,\"rdbEnabled\":false,\"aofFrequency\":\"always\",\"rdbFrequency\":\"6h\"},\"modules\":[{\"name\":\"coejctbzaqs\",\"args\":\"y\",\"version\":\"kbfkg\"}],\"geoReplication\":{\"groupNickname\":\"kexxppof\",\"linkedDatabases\":[{\"id\":\"c\",\"state\":\"Unlinking\"},{\"id\":\"ddtocjjxhvp\",\"state\":\"Unlinking\"},{\"id\":\"xhdzxibqeojnx\",\"state\":\"Unlinking\"},{\"id\":\"ddntwndei\",\"state\":\"Unlinking\"}]}}")
            .toObject(DatabaseProperties.class);
        Assertions.assertEquals(Protocol.PLAINTEXT, model.clientProtocol());
        Assertions.assertEquals(1860899173, model.port());
        Assertions.assertEquals(ClusteringPolicy.ENTERPRISE_CLUSTER, model.clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.NO_EVICTION, model.evictionPolicy());
        Assertions.assertEquals(true, model.persistence().aofEnabled());
        Assertions.assertEquals(false, model.persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ALWAYS, model.persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.SIXH, model.persistence().rdbFrequency());
        Assertions.assertEquals("coejctbzaqs", model.modules().get(0).name());
        Assertions.assertEquals("y", model.modules().get(0).args());
        Assertions.assertEquals("kexxppof", model.geoReplication().groupNickname());
        Assertions.assertEquals("c", model.geoReplication().linkedDatabases().get(0).id());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseProperties model = new DatabaseProperties().withClientProtocol(Protocol.PLAINTEXT).withPort(1860899173)
            .withClusteringPolicy(ClusteringPolicy.ENTERPRISE_CLUSTER).withEvictionPolicy(EvictionPolicy.NO_EVICTION)
            .withPersistence(new Persistence().withAofEnabled(true).withRdbEnabled(false)
                .withAofFrequency(AofFrequency.ALWAYS).withRdbFrequency(RdbFrequency.SIXH))
            .withModules(Arrays.asList(new Module().withName("coejctbzaqs").withArgs("y"))).withGeoReplication(
                new DatabasePropertiesGeoReplication().withGroupNickname("kexxppof").withLinkedDatabases(
                    Arrays.asList(new LinkedDatabase().withId("c"), new LinkedDatabase().withId("ddtocjjxhvp"),
                        new LinkedDatabase().withId("xhdzxibqeojnx"), new LinkedDatabase().withId("ddntwndei"))));
        model = BinaryData.fromObject(model).toObject(DatabaseProperties.class);
        Assertions.assertEquals(Protocol.PLAINTEXT, model.clientProtocol());
        Assertions.assertEquals(1860899173, model.port());
        Assertions.assertEquals(ClusteringPolicy.ENTERPRISE_CLUSTER, model.clusteringPolicy());
        Assertions.assertEquals(EvictionPolicy.NO_EVICTION, model.evictionPolicy());
        Assertions.assertEquals(true, model.persistence().aofEnabled());
        Assertions.assertEquals(false, model.persistence().rdbEnabled());
        Assertions.assertEquals(AofFrequency.ALWAYS, model.persistence().aofFrequency());
        Assertions.assertEquals(RdbFrequency.SIXH, model.persistence().rdbFrequency());
        Assertions.assertEquals("coejctbzaqs", model.modules().get(0).name());
        Assertions.assertEquals("y", model.modules().get(0).args());
        Assertions.assertEquals("kexxppof", model.geoReplication().groupNickname());
        Assertions.assertEquals("c", model.geoReplication().linkedDatabases().get(0).id());
    }
}
