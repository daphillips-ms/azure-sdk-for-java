// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datamigration.models.MigrateSqlServerSqlDbSyncTaskOutputError;

public final class MigrateSqlServerSqlDbSyncTaskOutputErrorTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MigrateSqlServerSqlDbSyncTaskOutputError model =
            BinaryData
                .fromString(
                    "{\"resultType\":\"ErrorOutput\",\"error\":{\"message\":\"udfdlwgg\",\"actionableMessage\":\"sb\",\"filePath\":\"ovvtgseinqfiu\",\"lineNumber\":\"qknp\",\"hResult\":1065605226,\"stackTrace\":\"epttwqmsniff\"},\"id\":\"mqnrojlpijnkr\"}")
                .toObject(MigrateSqlServerSqlDbSyncTaskOutputError.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MigrateSqlServerSqlDbSyncTaskOutputError model = new MigrateSqlServerSqlDbSyncTaskOutputError();
        model = BinaryData.fromObject(model).toObject(MigrateSqlServerSqlDbSyncTaskOutputError.class);
    }
}
