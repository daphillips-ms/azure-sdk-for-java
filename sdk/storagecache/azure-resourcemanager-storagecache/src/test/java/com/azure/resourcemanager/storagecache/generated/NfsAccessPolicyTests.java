// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.NfsAccessPolicy;
import com.azure.resourcemanager.storagecache.models.NfsAccessRule;
import com.azure.resourcemanager.storagecache.models.NfsAccessRuleAccess;
import com.azure.resourcemanager.storagecache.models.NfsAccessRuleScope;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class NfsAccessPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NfsAccessPolicy model = BinaryData.fromString(
            "{\"name\":\"gpfqbuace\",\"accessRules\":[{\"scope\":\"network\",\"filter\":\"qrhhu\",\"access\":\"no\",\"suid\":true,\"submountAccess\":false,\"rootSquash\":false,\"anonymousUID\":\"xolzdahzx\",\"anonymousGID\":\"obgbkdmoizp\"},{\"scope\":\"default\",\"filter\":\"mgrcfbu\",\"access\":\"no\",\"suid\":true,\"submountAccess\":false,\"rootSquash\":false,\"anonymousUID\":\"xbpvjymjhx\",\"anonymousGID\":\"yngudivk\"},{\"scope\":\"host\",\"filter\":\"wbxqzvszjfau\",\"access\":\"ro\",\"suid\":false,\"submountAccess\":false,\"rootSquash\":false,\"anonymousUID\":\"tvtc\",\"anonymousGID\":\"qtdo\"},{\"scope\":\"host\",\"filter\":\"bxvwv\",\"access\":\"no\",\"suid\":false,\"submountAccess\":false,\"rootSquash\":false,\"anonymousUID\":\"xoblytkbl\",\"anonymousGID\":\"ewwwfbkrvrnsv\"}]}")
            .toObject(NfsAccessPolicy.class);
        Assertions.assertEquals("gpfqbuace", model.name());
        Assertions.assertEquals(NfsAccessRuleScope.NETWORK, model.accessRules().get(0).scope());
        Assertions.assertEquals("qrhhu", model.accessRules().get(0).filter());
        Assertions.assertEquals(NfsAccessRuleAccess.NO, model.accessRules().get(0).access());
        Assertions.assertEquals(true, model.accessRules().get(0).suid());
        Assertions.assertEquals(false, model.accessRules().get(0).submountAccess());
        Assertions.assertEquals(false, model.accessRules().get(0).rootSquash());
        Assertions.assertEquals("xolzdahzx", model.accessRules().get(0).anonymousUid());
        Assertions.assertEquals("obgbkdmoizp", model.accessRules().get(0).anonymousGid());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NfsAccessPolicy model = new NfsAccessPolicy().withName("gpfqbuace")
            .withAccessRules(Arrays.asList(
                new NfsAccessRule().withScope(NfsAccessRuleScope.NETWORK).withFilter("qrhhu")
                    .withAccess(NfsAccessRuleAccess.NO).withSuid(true).withSubmountAccess(false).withRootSquash(false)
                    .withAnonymousUid("xolzdahzx").withAnonymousGid("obgbkdmoizp"),
                new NfsAccessRule().withScope(NfsAccessRuleScope.DEFAULT).withFilter("mgrcfbu")
                    .withAccess(NfsAccessRuleAccess.NO).withSuid(true).withSubmountAccess(false).withRootSquash(false)
                    .withAnonymousUid("xbpvjymjhx").withAnonymousGid("yngudivk"),
                new NfsAccessRule().withScope(NfsAccessRuleScope.HOST).withFilter("wbxqzvszjfau")
                    .withAccess(NfsAccessRuleAccess.RO).withSuid(false).withSubmountAccess(false).withRootSquash(false)
                    .withAnonymousUid("tvtc").withAnonymousGid("qtdo"),
                new NfsAccessRule().withScope(NfsAccessRuleScope.HOST).withFilter("bxvwv")
                    .withAccess(NfsAccessRuleAccess.NO).withSuid(false).withSubmountAccess(false).withRootSquash(false)
                    .withAnonymousUid("xoblytkbl").withAnonymousGid("ewwwfbkrvrnsv")));
        model = BinaryData.fromObject(model).toObject(NfsAccessPolicy.class);
        Assertions.assertEquals("gpfqbuace", model.name());
        Assertions.assertEquals(NfsAccessRuleScope.NETWORK, model.accessRules().get(0).scope());
        Assertions.assertEquals("qrhhu", model.accessRules().get(0).filter());
        Assertions.assertEquals(NfsAccessRuleAccess.NO, model.accessRules().get(0).access());
        Assertions.assertEquals(true, model.accessRules().get(0).suid());
        Assertions.assertEquals(false, model.accessRules().get(0).submountAccess());
        Assertions.assertEquals(false, model.accessRules().get(0).rootSquash());
        Assertions.assertEquals("xolzdahzx", model.accessRules().get(0).anonymousUid());
        Assertions.assertEquals("obgbkdmoizp", model.accessRules().get(0).anonymousGid());
    }
}
