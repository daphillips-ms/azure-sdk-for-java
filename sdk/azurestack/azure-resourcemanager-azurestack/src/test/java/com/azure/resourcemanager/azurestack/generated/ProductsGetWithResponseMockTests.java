// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestack.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.azurestack.AzureStackManager;
import com.azure.resourcemanager.azurestack.models.Product;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProductsGetWithResponseMockTests {
    @Test
    public void testGetWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"displayName\":\"jawgqwg\",\"description\":\"ni\",\"publisherDisplayName\":\"x\",\"publisherIdentifier\":\"kpycgklwndnhjd\",\"offer\":\"whvylw\",\"offerVersion\":\"tdhxujznbmpowuwp\",\"sku\":\"qlveualupjmkh\",\"billingPartNumber\":\"obbc\",\"vmExtensionType\":\"s\",\"galleryItemIdentity\":\"jriplrbpbewtghf\",\"iconUris\":{\"large\":\"c\",\"wide\":\"xzvlvqhjkbegib\",\"medium\":\"mxiebw\",\"small\":\"loayqcgw\",\"hero\":\"zjuzgwyz\"},\"links\":[],\"legalTerms\":\"ongmtsa\",\"privacyPolicy\":\"cbpwxqpsrknft\",\"payloadLength\":5398442768208830839,\"productKind\":\"uhprwmdyvxqt\",\"productProperties\":{\"version\":\"iwwroyqbexrmc\"},\"compatibility\":{\"isCompatible\":true,\"message\":\"nojvknmefqsg\",\"description\":\"ah\",\"issues\":[]}},\"etag\":\"y\",\"id\":\"hpvgqz\",\"name\":\"j\",\"type\":\"vxdjzlmwlxkvugf\"}";

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

        AzureStackManager manager =
            AzureStackManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        Product response =
            manager.products().getWithResponse("otwmcdyt", "x", "it", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals("y", response.etag());
        Assertions.assertEquals("jawgqwg", response.displayName());
        Assertions.assertEquals("ni", response.description());
        Assertions.assertEquals("x", response.publisherDisplayName());
        Assertions.assertEquals("kpycgklwndnhjd", response.publisherIdentifier());
        Assertions.assertEquals("whvylw", response.offer());
        Assertions.assertEquals("tdhxujznbmpowuwp", response.offerVersion());
        Assertions.assertEquals("qlveualupjmkh", response.sku());
        Assertions.assertEquals("obbc", response.billingPartNumber());
        Assertions.assertEquals("s", response.vmExtensionType());
        Assertions.assertEquals("jriplrbpbewtghf", response.galleryItemIdentity());
        Assertions.assertEquals("c", response.iconUris().large());
        Assertions.assertEquals("xzvlvqhjkbegib", response.iconUris().wide());
        Assertions.assertEquals("mxiebw", response.iconUris().medium());
        Assertions.assertEquals("loayqcgw", response.iconUris().small());
        Assertions.assertEquals("zjuzgwyz", response.iconUris().hero());
        Assertions.assertEquals("ongmtsa", response.legalTerms());
        Assertions.assertEquals("cbpwxqpsrknft", response.privacyPolicy());
        Assertions.assertEquals(5398442768208830839L, response.payloadLength());
        Assertions.assertEquals("uhprwmdyvxqt", response.productKind());
        Assertions.assertEquals("iwwroyqbexrmc", response.productProperties().version());
        Assertions.assertEquals(true, response.compatibility().isCompatible());
        Assertions.assertEquals("nojvknmefqsg", response.compatibility().message());
        Assertions.assertEquals("ah", response.compatibility().description());
    }
}
