// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcompute.HybridComputeManager;
import com.azure.resourcemanager.hybridcompute.models.License;
import com.azure.resourcemanager.hybridcompute.models.LicenseCoreType;
import com.azure.resourcemanager.hybridcompute.models.LicenseEdition;
import com.azure.resourcemanager.hybridcompute.models.LicenseState;
import com.azure.resourcemanager.hybridcompute.models.LicenseTarget;
import com.azure.resourcemanager.hybridcompute.models.LicenseType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class LicensesListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"tenantId\":\"nu\",\"licenseType\":\"ESU\",\"licenseDetails\":{\"state\":\"Activated\",\"target\":\"Windows"
                + " Server"
                + " 2012\",\"edition\":\"Datacenter\",\"type\":\"vCore\",\"processors\":406416899,\"assignedLicenses\":286586913,\"immutableId\":\"yzirtxdyuxzejn\"}},\"location\":\"sewgioilqukr\",\"tags\":{\"rgguf\":\"tqmieox\",\"hhavgrvkffovjz\":\"yaomtb\",\"gjmfxumvfcl\":\"pjbi\"},\"id\":\"yo\",\"name\":\"wxnb\",\"type\":\"fezzxscyhwzdg\"}]}";

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

        HybridComputeManager manager =
            HybridComputeManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<License> response = manager.licenses().list(com.azure.core.util.Context.NONE);

        Assertions.assertEquals("sewgioilqukr", response.iterator().next().location());
        Assertions.assertEquals("tqmieox", response.iterator().next().tags().get("rgguf"));
        Assertions.assertEquals("nu", response.iterator().next().tenantId());
        Assertions.assertEquals(LicenseType.ESU, response.iterator().next().licenseType());
        Assertions.assertEquals(LicenseState.ACTIVATED, response.iterator().next().licenseDetails().state());
        Assertions
            .assertEquals(LicenseTarget.WINDOWS_SERVER_2012, response.iterator().next().licenseDetails().target());
        Assertions.assertEquals(LicenseEdition.DATACENTER, response.iterator().next().licenseDetails().edition());
        Assertions.assertEquals(LicenseCoreType.V_CORE, response.iterator().next().licenseDetails().type());
        Assertions.assertEquals(406416899, response.iterator().next().licenseDetails().processors());
    }
}
