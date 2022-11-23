// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.CompanyInfo;
import com.azure.resourcemanager.elastic.models.UserInfo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class UserInfoTests {
    @Test
    public void testDeserialize() {
        UserInfo model =
            BinaryData
                .fromString(
                    "{\"firstName\":\"wbxgjvt\",\"lastName\":\"p\",\"companyName\":\"szdnr\",\"emailAddress\":\"qguhmuo\",\"companyInfo\":{\"domain\":\"prwzwbnguitnwui\",\"business\":\"a\",\"employeesNumber\":\"ufizuckyf\",\"state\":\"rfidfvzwdz\",\"country\":\"tymw\"}}")
                .toObject(UserInfo.class);
        Assertions.assertEquals("wbxgjvt", model.firstName());
        Assertions.assertEquals("p", model.lastName());
        Assertions.assertEquals("szdnr", model.companyName());
        Assertions.assertEquals("qguhmuo", model.emailAddress());
        Assertions.assertEquals("prwzwbnguitnwui", model.companyInfo().domain());
        Assertions.assertEquals("a", model.companyInfo().business());
        Assertions.assertEquals("ufizuckyf", model.companyInfo().employeesNumber());
        Assertions.assertEquals("rfidfvzwdz", model.companyInfo().state());
        Assertions.assertEquals("tymw", model.companyInfo().country());
    }

    @Test
    public void testSerialize() {
        UserInfo model =
            new UserInfo()
                .withFirstName("wbxgjvt")
                .withLastName("p")
                .withCompanyName("szdnr")
                .withEmailAddress("qguhmuo")
                .withCompanyInfo(
                    new CompanyInfo()
                        .withDomain("prwzwbnguitnwui")
                        .withBusiness("a")
                        .withEmployeesNumber("ufizuckyf")
                        .withState("rfidfvzwdz")
                        .withCountry("tymw"));
        model = BinaryData.fromObject(model).toObject(UserInfo.class);
        Assertions.assertEquals("wbxgjvt", model.firstName());
        Assertions.assertEquals("p", model.lastName());
        Assertions.assertEquals("szdnr", model.companyName());
        Assertions.assertEquals("qguhmuo", model.emailAddress());
        Assertions.assertEquals("prwzwbnguitnwui", model.companyInfo().domain());
        Assertions.assertEquals("a", model.companyInfo().business());
        Assertions.assertEquals("ufizuckyf", model.companyInfo().employeesNumber());
        Assertions.assertEquals("rfidfvzwdz", model.companyInfo().state());
        Assertions.assertEquals("tymw", model.companyInfo().country());
    }
}