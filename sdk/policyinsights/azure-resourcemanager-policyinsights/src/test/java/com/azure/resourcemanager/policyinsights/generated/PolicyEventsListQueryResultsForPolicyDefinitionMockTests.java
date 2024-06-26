// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.policyinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Context;
import com.azure.resourcemanager.policyinsights.PolicyInsightsManager;
import com.azure.resourcemanager.policyinsights.models.PolicyEvent;
import com.azure.resourcemanager.policyinsights.models.PolicyEventsResourceType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PolicyEventsListQueryResultsForPolicyDefinitionMockTests {
    @Test
    public void testListQueryResultsForPolicyDefinition() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"@odata.id\":\"glecdmdqbwpypq\",\"@odata.context\":\"sfj\",\"timestamp\":\"2021-04-17T00:58:42Z\",\"resourceId\":\"lhhxudbxvodhtnsi\",\"policyAssignmentId\":\"dhzmmesckdlp\",\"policyDefinitionId\":\"zrcxfailcfxwmdbo\",\"effectiveParameters\":\"fgsftufqob\",\"isCompliant\":false,\"subscriptionId\":\"acgcckknhx\",\"resourceType\":\"zvytnrzvuljraaer\",\"resourceLocation\":\"okqgukkjq\",\"resourceGroup\":\"broyla\",\"resourceTags\":\"ulcdisdosf\",\"policyAssignmentName\":\"jsvg\",\"policyAssignmentOwner\":\"whryvycytdcl\",\"policyAssignmentParameters\":\"ccknfnwmbtmvp\",\"policyAssignmentScope\":\"jdhttzaefedxi\",\"policyDefinitionName\":\"hrphkmcrjdqn\",\"policyDefinitionAction\":\"fzpbgtgkyl\",\"policyDefinitionCategory\":\"ghrjeuutl\",\"policySetDefinitionId\":\"ez\",\"policySetDefinitionName\":\"hokvbwnh\",\"policySetDefinitionOwner\":\"qlgehg\",\"policySetDefinitionCategory\":\"ipifhpfeoajvg\",\"policySetDefinitionParameters\":\"txjcsheafidlt\",\"managementGroupIds\":\"sr\",\"policyDefinitionReferenceId\":\"mks\",\"complianceState\":\"h\",\"tenantId\":\"ftxfkf\",\"principalOid\":\"gpr\",\"components\":[{\"id\":\"llu\",\"type\":\"iqtgdqoh\",\"name\":\"wsldrizetpwbr\",\"timestamp\":\"2021-10-22T09:50:07Z\",\"tenantId\":\"ibph\",\"principalOid\":\"zmizakakan\",\"policyDefinitionAction\":\"p\",\"\":{}},{\"id\":\"ha\",\"type\":\"ylhjlm\",\"name\":\"y\",\"timestamp\":\"2021-01-19T18:48:39Z\",\"tenantId\":\"mrsopte\",\"principalOid\":\"jme\",\"policyDefinitionAction\":\"ls\",\"\":{}},{\"id\":\"ylw\",\"type\":\"zaum\",\"name\":\"oohgu\",\"timestamp\":\"2021-11-18T13:48:43Z\",\"tenantId\":\"boyjathwt\",\"principalOid\":\"lbaemwmdxmeb\",\"policyDefinitionAction\":\"scjpahlxv\",\"\":{}}],\"\":{}}]}";

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

        PolicyInsightsManager manager =
            PolicyInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<PolicyEvent> response =
            manager
                .policyEvents()
                .listQueryResultsForPolicyDefinition(
                    PolicyEventsResourceType.DEFAULT,
                    "xv",
                    "vrefdeesv",
                    1645748788,
                    "uij",
                    "xtxsuwprtujw",
                    OffsetDateTime.parse("2021-10-31T12:27:52Z"),
                    OffsetDateTime.parse("2021-07-30T10:19:24Z"),
                    "ddjib",
                    "bxv",
                    "titvtzeexavox",
                    Context.NONE);

        Assertions.assertEquals(OffsetDateTime.parse("2021-04-17T00:58:42Z"), response.iterator().next().timestamp());
        Assertions.assertEquals("lhhxudbxvodhtnsi", response.iterator().next().resourceId());
        Assertions.assertEquals("dhzmmesckdlp", response.iterator().next().policyAssignmentId());
        Assertions.assertEquals("zrcxfailcfxwmdbo", response.iterator().next().policyDefinitionId());
        Assertions.assertEquals("fgsftufqob", response.iterator().next().effectiveParameters());
        Assertions.assertEquals(false, response.iterator().next().isCompliant());
        Assertions.assertEquals("acgcckknhx", response.iterator().next().subscriptionId());
        Assertions.assertEquals("zvytnrzvuljraaer", response.iterator().next().resourceType());
        Assertions.assertEquals("okqgukkjq", response.iterator().next().resourceLocation());
        Assertions.assertEquals("broyla", response.iterator().next().resourceGroup());
        Assertions.assertEquals("ulcdisdosf", response.iterator().next().resourceTags());
        Assertions.assertEquals("jsvg", response.iterator().next().policyAssignmentName());
        Assertions.assertEquals("whryvycytdcl", response.iterator().next().policyAssignmentOwner());
        Assertions.assertEquals("ccknfnwmbtmvp", response.iterator().next().policyAssignmentParameters());
        Assertions.assertEquals("jdhttzaefedxi", response.iterator().next().policyAssignmentScope());
        Assertions.assertEquals("hrphkmcrjdqn", response.iterator().next().policyDefinitionName());
        Assertions.assertEquals("fzpbgtgkyl", response.iterator().next().policyDefinitionAction());
        Assertions.assertEquals("ghrjeuutl", response.iterator().next().policyDefinitionCategory());
        Assertions.assertEquals("ez", response.iterator().next().policySetDefinitionId());
        Assertions.assertEquals("hokvbwnh", response.iterator().next().policySetDefinitionName());
        Assertions.assertEquals("qlgehg", response.iterator().next().policySetDefinitionOwner());
        Assertions.assertEquals("ipifhpfeoajvg", response.iterator().next().policySetDefinitionCategory());
        Assertions.assertEquals("txjcsheafidlt", response.iterator().next().policySetDefinitionParameters());
        Assertions.assertEquals("sr", response.iterator().next().managementGroupIds());
        Assertions.assertEquals("mks", response.iterator().next().policyDefinitionReferenceId());
        Assertions.assertEquals("h", response.iterator().next().complianceState());
        Assertions.assertEquals("ftxfkf", response.iterator().next().tenantId());
        Assertions.assertEquals("gpr", response.iterator().next().principalOid());
        Assertions.assertEquals("llu", response.iterator().next().components().get(0).id());
        Assertions.assertEquals("iqtgdqoh", response.iterator().next().components().get(0).type());
        Assertions.assertEquals("wsldrizetpwbr", response.iterator().next().components().get(0).name());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-10-22T09:50:07Z"),
                response.iterator().next().components().get(0).timestamp());
        Assertions.assertEquals("ibph", response.iterator().next().components().get(0).tenantId());
        Assertions.assertEquals("zmizakakan", response.iterator().next().components().get(0).principalOid());
        Assertions.assertEquals("p", response.iterator().next().components().get(0).policyDefinitionAction());
    }
}
