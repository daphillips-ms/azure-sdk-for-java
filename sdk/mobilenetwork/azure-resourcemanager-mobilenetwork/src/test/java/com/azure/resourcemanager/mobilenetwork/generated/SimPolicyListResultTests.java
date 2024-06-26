// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimPolicyInner;
import com.azure.resourcemanager.mobilenetwork.models.Ambr;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.DataNetworkResourceId;
import com.azure.resourcemanager.mobilenetwork.models.SimPolicyListResult;
import com.azure.resourcemanager.mobilenetwork.models.SliceConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.SliceResourceId;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SimPolicyListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SimPolicyListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"siteProvisioningState\":{\"cdm\":\"Deleting\",\"r\":\"NotApplicable\",\"lpijnkrxfrd\":\"NotApplicable\"},\"ueAmbr\":{\"uplink\":\"hcrat\",\"downlink\":\"zzronasx\"},\"defaultSlice\":{\"id\":\"ft\"},\"rfspIndex\":1206467391,\"registrationTimer\":418200584,\"sliceConfigurations\":[{\"slice\":{\"id\":\"f\"},\"defaultDataNetwork\":{\"id\":\"wesgogczh\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"nxkrlgnyhmossxkk\"},\"sessionAmbr\":{\"uplink\":\"thrrgh\",\"downlink\":\"jbdhqxvc\"},\"allowedServices\":[]}]},{\"slice\":{\"id\":\"gf\"},\"defaultDataNetwork\":{\"id\":\"pdso\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"shrnsvbuswdvz\"},\"sessionAmbr\":{\"uplink\":\"ybycnunvj\",\"downlink\":\"rtkfawnopq\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"ikyzirtxdy\"},\"sessionAmbr\":{\"uplink\":\"x\",\"downlink\":\"ejnt\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"sewgioilqukr\"},\"sessionAmbr\":{\"uplink\":\"dxtqmieoxo\",\"downlink\":\"ggufhyaomtb\"},\"allowedServices\":[]}]},{\"slice\":{\"id\":\"hhavgrvkffovjz\"},\"defaultDataNetwork\":{\"id\":\"pjbi\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"jmfxumvf\"},\"sessionAmbr\":{\"uplink\":\"luyovwxnbkfezzx\",\"downlink\":\"cy\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"wzdgirujbzbo\"},\"sessionAmbr\":{\"uplink\":\"vzzbtdcq\",\"downlink\":\"pniyujviyl\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"dshf\"},\"sessionAmbr\":{\"uplink\":\"snrbgyefrymsgao\",\"downlink\":\"fmwncotmrfh\"},\"allowedServices\":[]}]}]},\"location\":\"ctymoxoftp\",\"tags\":{\"hxacpqjlihhyu\":\"wycz\",\"x\":\"pskasdvlmfwdg\"},\"id\":\"lucvpam\",\"name\":\"sreuzvxurisjnh\",\"type\":\"ytxifqjzgxmrh\"},{\"properties\":{\"provisioningState\":\"Failed\",\"siteProvisioningState\":{\"esutrgjupauutpw\":\"Deleting\",\"hihejqgwzpnfqn\":\"NotApplicable\"},\"ueAmbr\":{\"uplink\":\"cypsxjv\",\"downlink\":\"oimwkslirc\"},\"defaultSlice\":{\"id\":\"zjxvydfcea\"},\"rfspIndex\":532238686,\"registrationTimer\":1877895410,\"sliceConfigurations\":[{\"slice\":{\"id\":\"gdyftumrtwna\"},\"defaultDataNetwork\":{\"id\":\"jslb\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"kojgcyzts\"},\"sessionAmbr\":{\"uplink\":\"mznbaeqphch\",\"downlink\":\"nrnrp\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"ehuwrykqgaifmvik\"},\"sessionAmbr\":{\"uplink\":\"bydvkhbejdz\",\"downlink\":\"xcv\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"srhnjivo\"},\"sessionAmbr\":{\"uplink\":\"v\",\"downlink\":\"novqfzge\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"jdftuljltd\"},\"sessionAmbr\":{\"uplink\":\"ceamtm\",\"downlink\":\"zuo\"},\"allowedServices\":[]}]},{\"slice\":{\"id\":\"ejwcwwqiok\"},\"defaultDataNetwork\":{\"id\":\"ssxmojms\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"kjprvk\"},\"sessionAmbr\":{\"uplink\":\"cfzq\",\"downlink\":\"jyxgtczh\"},\"allowedServices\":[]}]},{\"slice\":{\"id\":\"ydbsd\"},\"defaultDataNetwork\":{\"id\":\"hmkxmaehvbb\"},\"dataNetworkConfigurations\":[{\"dataNetwork\":{\"id\":\"ripltf\"},\"sessionAmbr\":{\"uplink\":\"htba\",\"downlink\":\"kgxywr\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"kpyklyhp\"},\"sessionAmbr\":{\"uplink\":\"uodpv\",\"downlink\":\"uudl\"},\"allowedServices\":[]},{\"dataNetwork\":{\"id\":\"zibt\"},\"sessionAmbr\":{\"uplink\":\"ostgkts\",\"downlink\":\"vdxec\"},\"allowedServices\":[]}]}]},\"location\":\"edqbc\",\"tags\":{\"dqkdlwwqfbu\":\"lhpl\"},\"id\":\"lkxt\",\"name\":\"qjfsmlmbtxhw\",\"type\":\"fwsrtawcoezbrhu\"}],\"nextLink\":\"kh\"}")
            .toObject(SimPolicyListResult.class);
        Assertions.assertEquals("ctymoxoftp", model.value().get(0).location());
        Assertions.assertEquals("wycz", model.value().get(0).tags().get("hxacpqjlihhyu"));
        Assertions.assertEquals("hcrat", model.value().get(0).ueAmbr().uplink());
        Assertions.assertEquals("zzronasx", model.value().get(0).ueAmbr().downlink());
        Assertions.assertEquals("ft", model.value().get(0).defaultSlice().id());
        Assertions.assertEquals(1206467391, model.value().get(0).rfspIndex());
        Assertions.assertEquals(418200584, model.value().get(0).registrationTimer());
        Assertions.assertEquals("f", model.value().get(0).sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("wesgogczh",
            model.value().get(0).sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions.assertEquals("nxkrlgnyhmossxkk",
            model.value().get(0).sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions.assertEquals("thrrgh", model.value().get(0).sliceConfigurations().get(0).dataNetworkConfigurations()
            .get(0).sessionAmbr().uplink());
        Assertions.assertEquals("jbdhqxvc", model.value().get(0).sliceConfigurations().get(0)
            .dataNetworkConfigurations().get(0).sessionAmbr().downlink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SimPolicyListResult model
            = new SimPolicyListResult()
                .withValue(
                    Arrays
                        .asList(
                            new SimPolicyInner().withLocation("ctymoxoftp")
                                .withTags(mapOf("hxacpqjlihhyu", "wycz", "x", "pskasdvlmfwdg"))
                                .withUeAmbr(new Ambr().withUplink("hcrat").withDownlink("zzronasx"))
                                .withDefaultSlice(new SliceResourceId().withId("ft")).withRfspIndex(
                                    1206467391)
                                .withRegistrationTimer(418200584).withSliceConfigurations(
                                    Arrays.asList(
                                        new SliceConfiguration().withSlice(new SliceResourceId().withId("f"))
                                            .withDefaultDataNetwork(new DataNetworkResourceId().withId("wesgogczh"))
                                            .withDataNetworkConfigurations(Arrays.asList(new DataNetworkConfiguration()
                                                .withDataNetwork(new DataNetworkResourceId().withId("nxkrlgnyhmossxkk"))
                                                .withSessionAmbr(
                                                    new Ambr().withUplink("thrrgh").withDownlink("jbdhqxvc"))
                                                .withAllowedServices(Arrays.asList()))),
                                        new SliceConfiguration().withSlice(new SliceResourceId().withId("gf"))
                                            .withDefaultDataNetwork(new DataNetworkResourceId().withId("pdso"))
                                            .withDataNetworkConfigurations(Arrays.asList(
                                                new DataNetworkConfiguration()
                                                    .withDataNetwork(
                                                        new DataNetworkResourceId().withId("shrnsvbuswdvz"))
                                                    .withSessionAmbr(
                                                        new Ambr().withUplink("ybycnunvj").withDownlink("rtkfawnopq"))
                                                    .withAllowedServices(Arrays.asList()),
                                                new DataNetworkConfiguration()
                                                    .withDataNetwork(new DataNetworkResourceId().withId("ikyzirtxdy"))
                                                    .withSessionAmbr(new Ambr().withUplink("x").withDownlink("ejnt"))
                                                    .withAllowedServices(Arrays.asList()),
                                                new DataNetworkConfiguration()
                                                    .withDataNetwork(new DataNetworkResourceId().withId("sewgioilqukr"))
                                                    .withSessionAmbr(
                                                        new Ambr().withUplink("dxtqmieoxo").withDownlink("ggufhyaomtb"))
                                                    .withAllowedServices(Arrays.asList()))),
                                        new SliceConfiguration()
                                            .withSlice(new SliceResourceId().withId("hhavgrvkffovjz"))
                                            .withDefaultDataNetwork(new DataNetworkResourceId().withId("pjbi"))
                                            .withDataNetworkConfigurations(Arrays.asList(
                                                new DataNetworkConfiguration()
                                                    .withDataNetwork(new DataNetworkResourceId().withId("jmfxumvf"))
                                                    .withSessionAmbr(
                                                        new Ambr().withUplink("luyovwxnbkfezzx").withDownlink("cy"))
                                                    .withAllowedServices(Arrays.asList()),
                                                new DataNetworkConfiguration()
                                                    .withDataNetwork(new DataNetworkResourceId().withId("wzdgirujbzbo"))
                                                    .withSessionAmbr(
                                                        new Ambr().withUplink("vzzbtdcq").withDownlink("pniyujviyl"))
                                                    .withAllowedServices(Arrays.asList()),
                                                new DataNetworkConfiguration()
                                                    .withDataNetwork(new DataNetworkResourceId().withId("dshf"))
                                                    .withSessionAmbr(new Ambr().withUplink("snrbgyefrymsgao")
                                                        .withDownlink("fmwncotmrfh"))
                                                    .withAllowedServices(Arrays.asList()))))),
                            new SimPolicyInner().withLocation("edqbc").withTags(mapOf("dqkdlwwqfbu", "lhpl"))
                                .withUeAmbr(new Ambr().withUplink("cypsxjv").withDownlink("oimwkslirc"))
                                .withDefaultSlice(new SliceResourceId().withId("zjxvydfcea")).withRfspIndex(532238686)
                                .withRegistrationTimer(
                                    1877895410)
                                .withSliceConfigurations(
                                    Arrays
                                        .asList(
                                            new SliceConfiguration()
                                                .withSlice(new SliceResourceId().withId("gdyftumrtwna"))
                                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("jslb"))
                                                .withDataNetworkConfigurations(Arrays.asList(
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(
                                                            new DataNetworkResourceId().withId("kojgcyzts"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("mznbaeqphch").withDownlink("nrnrp"))
                                                        .withAllowedServices(Arrays.asList()),
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(
                                                            new DataNetworkResourceId().withId("ehuwrykqgaifmvik"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("bydvkhbejdz").withDownlink("xcv"))
                                                        .withAllowedServices(Arrays.asList()),
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(new DataNetworkResourceId().withId("srhnjivo"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("v").withDownlink("novqfzge"))
                                                        .withAllowedServices(Arrays.asList()),
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(
                                                            new DataNetworkResourceId().withId("jdftuljltd"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("ceamtm").withDownlink("zuo"))
                                                        .withAllowedServices(Arrays.asList()))),
                                            new SliceConfiguration()
                                                .withSlice(new SliceResourceId().withId("ejwcwwqiok"))
                                                .withDefaultDataNetwork(new DataNetworkResourceId().withId("ssxmojms"))
                                                .withDataNetworkConfigurations(
                                                    Arrays.asList(new DataNetworkConfiguration()
                                                        .withDataNetwork(new DataNetworkResourceId().withId("kjprvk"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("cfzq").withDownlink("jyxgtczh"))
                                                        .withAllowedServices(Arrays.asList()))),
                                            new SliceConfiguration().withSlice(new SliceResourceId().withId("ydbsd"))
                                                .withDefaultDataNetwork(
                                                    new DataNetworkResourceId().withId("hmkxmaehvbb"))
                                                .withDataNetworkConfigurations(Arrays.asList(
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(new DataNetworkResourceId().withId("ripltf"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("htba").withDownlink("kgxywr"))
                                                        .withAllowedServices(Arrays.asList()),
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(new DataNetworkResourceId().withId("kpyklyhp"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("uodpv").withDownlink("uudl"))
                                                        .withAllowedServices(Arrays.asList()),
                                                    new DataNetworkConfiguration()
                                                        .withDataNetwork(new DataNetworkResourceId().withId("zibt"))
                                                        .withSessionAmbr(
                                                            new Ambr().withUplink("ostgkts").withDownlink("vdxec"))
                                                        .withAllowedServices(Arrays.asList())))))));
        model = BinaryData.fromObject(model).toObject(SimPolicyListResult.class);
        Assertions.assertEquals("ctymoxoftp", model.value().get(0).location());
        Assertions.assertEquals("wycz", model.value().get(0).tags().get("hxacpqjlihhyu"));
        Assertions.assertEquals("hcrat", model.value().get(0).ueAmbr().uplink());
        Assertions.assertEquals("zzronasx", model.value().get(0).ueAmbr().downlink());
        Assertions.assertEquals("ft", model.value().get(0).defaultSlice().id());
        Assertions.assertEquals(1206467391, model.value().get(0).rfspIndex());
        Assertions.assertEquals(418200584, model.value().get(0).registrationTimer());
        Assertions.assertEquals("f", model.value().get(0).sliceConfigurations().get(0).slice().id());
        Assertions.assertEquals("wesgogczh",
            model.value().get(0).sliceConfigurations().get(0).defaultDataNetwork().id());
        Assertions.assertEquals("nxkrlgnyhmossxkk",
            model.value().get(0).sliceConfigurations().get(0).dataNetworkConfigurations().get(0).dataNetwork().id());
        Assertions.assertEquals("thrrgh", model.value().get(0).sliceConfigurations().get(0).dataNetworkConfigurations()
            .get(0).sessionAmbr().uplink());
        Assertions.assertEquals("jbdhqxvc", model.value().get(0).sliceConfigurations().get(0)
            .dataNetworkConfigurations().get(0).sessionAmbr().downlink());
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
