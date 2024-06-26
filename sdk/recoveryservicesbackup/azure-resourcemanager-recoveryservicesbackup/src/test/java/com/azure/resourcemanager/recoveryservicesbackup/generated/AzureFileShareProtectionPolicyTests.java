// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureFileShareProtectionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.RetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.SchedulePolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.VaultRetentionPolicy;
import com.azure.resourcemanager.recoveryservicesbackup.models.WorkloadType;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AzureFileShareProtectionPolicyTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileShareProtectionPolicy model = BinaryData.fromString(
            "{\"backupManagementType\":\"AzureStorage\",\"workLoadType\":\"SAPAseDatabase\",\"schedulePolicy\":{\"schedulePolicyType\":\"SchedulePolicy\"},\"retentionPolicy\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"vaultRetentionPolicy\":{\"vaultRetention\":{\"retentionPolicyType\":\"RetentionPolicy\"},\"snapshotRetentionInDays\":1861002535},\"timeZone\":\"tstvdxeclzedq\",\"protectedItemsCount\":368021737,\"resourceGuardOperationRequests\":[\"lhpl\"]}")
            .toObject(AzureFileShareProtectionPolicy.class);
        Assertions.assertEquals(368021737, model.protectedItemsCount());
        Assertions.assertEquals("lhpl", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(WorkloadType.SAPASE_DATABASE, model.workLoadType());
        Assertions.assertEquals(1861002535, model.vaultRetentionPolicy().snapshotRetentionInDays());
        Assertions.assertEquals("tstvdxeclzedq", model.timeZone());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileShareProtectionPolicy model = new AzureFileShareProtectionPolicy()
            .withProtectedItemsCount(368021737).withResourceGuardOperationRequests(Arrays.asList("lhpl"))
            .withWorkLoadType(WorkloadType.SAPASE_DATABASE).withSchedulePolicy(new SchedulePolicy())
            .withRetentionPolicy(new RetentionPolicy()).withVaultRetentionPolicy(new VaultRetentionPolicy()
                .withVaultRetention(new RetentionPolicy()).withSnapshotRetentionInDays(1861002535))
            .withTimeZone("tstvdxeclzedq");
        model = BinaryData.fromObject(model).toObject(AzureFileShareProtectionPolicy.class);
        Assertions.assertEquals(368021737, model.protectedItemsCount());
        Assertions.assertEquals("lhpl", model.resourceGuardOperationRequests().get(0));
        Assertions.assertEquals(WorkloadType.SAPASE_DATABASE, model.workLoadType());
        Assertions.assertEquals(1861002535, model.vaultRetentionPolicy().snapshotRetentionInDays());
        Assertions.assertEquals("tstvdxeclzedq", model.timeZone());
    }
}
