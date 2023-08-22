// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.maintenance.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.maintenance.MaintenanceManager;
import com.azure.resourcemanager.maintenance.fluent.models.ConfigurationAssignmentInner;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignmentFilterProperties;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import com.azure.resourcemanager.maintenance.models.TagSettingsProperties;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsCreateOrUpdateWithResponseMockTests {
    @Test
    public void testCreateOrUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"uhhziuiefozbhdm\",\"properties\":{\"maintenanceConfigurationId\":\"mzqhoftrmaequi\",\"resourceId\":\"xicslfao\",\"filter\":{\"resourceTypes\":[\"yylhalnswhccsp\",\"kaivwit\",\"scywuggwoluhc\",\"bwemhairs\"],\"resourceGroups\":[\"z\"],\"osTypes\":[\"swe\",\"pqwd\",\"ggicccnxqhue\",\"mkttlstvlzywem\"],\"locations\":[\"ncsdtclusiyp\",\"sfgytguslfead\",\"ygqukyhejh\"],\"tagSettings\":{\"tags\":{\"bhshfwpracstwity\":[\"fpel\",\"lppvksrpq\",\"ujzra\",\"htwdwrftswibyrcd\"],\"odn\":[\"evxccedcp\",\"md\"],\"xqi\":[\"xltjcvnhltiu\",\"cxnavv\"]},\"filterOperator\":\"Any\"}}},\"id\":\"nyowxwlmdjrkvfg\",\"name\":\"vfvpdbodaciz\",\"type\":\"j\"}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        MaintenanceManager manager =
            MaintenanceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ConfigurationAssignment response =
            manager
                .configurationAssignments()
                .createOrUpdateWithResponse(
                    "rvtp",
                    "qujmqlgkf",
                    "tndoaongbjc",
                    "tujitcjedft",
                    "waezkojvd",
                    new ConfigurationAssignmentInner()
                        .withLocation("zfoqouicybxar")
                        .withMaintenanceConfigurationId("zuf")
                        .withResourceId("ciqopidoa")
                        .withFilter(
                            new ConfigurationAssignmentFilterProperties()
                                .withResourceTypes(Arrays.asList("dhkha", "xkhnzbonlwnto"))
                                .withResourceGroups(Arrays.asList("kdwbwhkszz", "mrv"))
                                .withOsTypes(Arrays.asList("tvb", "qgsfraoyzkoow", "lmnguxaw"))
                                .withLocations(Arrays.asList("dsyuuximerqfob", "yznkby", "utwpfhp", "gmhrskdsnfdsdoak"))
                                .withTagSettings(
                                    new TagSettingsProperties()
                                        .withTags(mapOf("bbejdcngqqm", Arrays.asList("kkze", "dlhewp", "sdsttwvog")))
                                        .withFilterOperator(TagOperators.ALL))),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("uhhziuiefozbhdm", response.location());
        Assertions.assertEquals("mzqhoftrmaequi", response.maintenanceConfigurationId());
        Assertions.assertEquals("xicslfao", response.resourceId());
        Assertions.assertEquals("yylhalnswhccsp", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("z", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("swe", response.filter().osTypes().get(0));
        Assertions.assertEquals("ncsdtclusiyp", response.filter().locations().get(0));
        Assertions.assertEquals("fpel", response.filter().tagSettings().tags().get("bhshfwpracstwity").get(0));
        Assertions.assertEquals(TagOperators.ANY, response.filter().tagSettings().filterOperator());
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
