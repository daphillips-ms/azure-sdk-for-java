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
import com.azure.resourcemanager.maintenance.models.ConfigurationAssignment;
import com.azure.resourcemanager.maintenance.models.TagOperators;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ConfigurationAssignmentsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"location\":\"k\",\"properties\":{\"maintenanceConfigurationId\":\"sjervti\",\"resourceId\":\"xsdszuempsb\",\"filter\":{\"resourceTypes\":[\"beyvpnqicvinvkjj\"],\"resourceGroups\":[\"rbuukzclewyhmlwp\",\"ztzp\",\"fn\"],\"osTypes\":[\"wyfzqwhxxbuyqa\",\"zfeqztppri\",\"lxorjaltolmncws\",\"bqwcsdbnwdcf\"],\"locations\":[\"qdpfuvglsbjjca\",\"vxb\"],\"tagSettings\":{\"tags\":{\"lxqtvcofudfl\":[\"utncorm\"],\"uwjuetaeburuvdmo\":[\"gj\",\"bgdknnqv\",\"aznqntoru\",\"sgsahmkycgr\"]},\"filterOperator\":\"All\"}}},\"id\":\"l\",\"name\":\"wabm\",\"type\":\"oefki\"}";

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
                .getWithResponse(
                    "msbvdkcrodtjinf",
                    "jlfltkacjvefkdlf",
                    "akggkfpag",
                    "owpulpq",
                    "lyls",
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("k", response.location());
        Assertions.assertEquals("sjervti", response.maintenanceConfigurationId());
        Assertions.assertEquals("xsdszuempsb", response.resourceId());
        Assertions.assertEquals("beyvpnqicvinvkjj", response.filter().resourceTypes().get(0));
        Assertions.assertEquals("rbuukzclewyhmlwp", response.filter().resourceGroups().get(0));
        Assertions.assertEquals("wyfzqwhxxbuyqa", response.filter().osTypes().get(0));
        Assertions.assertEquals("qdpfuvglsbjjca", response.filter().locations().get(0));
        Assertions.assertEquals("utncorm", response.filter().tagSettings().tags().get("lxqtvcofudfl").get(0));
        Assertions.assertEquals(TagOperators.ALL, response.filter().tagSettings().filterOperator());
    }
}
