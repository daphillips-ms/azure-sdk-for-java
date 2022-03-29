// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.resourcemanager.apimanagement.fluent.QuotaByPeriodKeysClient;
import com.azure.resourcemanager.apimanagement.fluent.models.QuotaCounterContractInner;
import com.azure.resourcemanager.apimanagement.models.QuotaCounterValueUpdateContract;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in QuotaByPeriodKeysClient. */
public final class QuotaByPeriodKeysClientImpl implements QuotaByPeriodKeysClient {
    /** The proxy service used to perform REST calls. */
    private final QuotaByPeriodKeysService service;

    /** The service client containing this operation class. */
    private final ApiManagementClientImpl client;

    /**
     * Initializes an instance of QuotaByPeriodKeysClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    QuotaByPeriodKeysClientImpl(ApiManagementClientImpl client) {
        this.service =
            RestProxy.create(QuotaByPeriodKeysService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ApiManagementClientQuotaByPeriodKeys to be used by the proxy service
     * to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ApiManagementClientQ")
    private interface QuotaByPeriodKeysService {
        @Headers({"Content-Type: application/json"})
        @Get(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/quotas/{quotaCounterKey}/periods/{quotaPeriodKey}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QuotaCounterContractInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("quotaCounterKey") String quotaCounterKey,
            @PathParam("quotaPeriodKey") String quotaPeriodKey,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @HeaderParam("Accept") String accept,
            Context context);

        @Headers({"Content-Type: application/json"})
        @Patch(
            "/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ApiManagement"
                + "/service/{serviceName}/quotas/{quotaCounterKey}/periods/{quotaPeriodKey}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<QuotaCounterContractInner>> update(
            @HostParam("$host") String endpoint,
            @PathParam("resourceGroupName") String resourceGroupName,
            @PathParam("serviceName") String serviceName,
            @PathParam("quotaCounterKey") String quotaCounterKey,
            @PathParam("quotaPeriodKey") String quotaPeriodKey,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            @BodyParam("application/json") QuotaCounterValueUpdateContract parameters,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterContractInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
        }
        if (quotaPeriodKey == null) {
            return Mono.error(new IllegalArgumentException("Parameter quotaPeriodKey is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            quotaCounterKey,
                            quotaPeriodKey,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterContractInner>> getWithResponseAsync(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
        }
        if (quotaPeriodKey == null) {
            return Mono.error(new IllegalArgumentException("Parameter quotaPeriodKey is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .get(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                quotaCounterKey,
                quotaPeriodKey,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                accept,
                context);
    }

    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QuotaCounterContractInner> getAsync(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey) {
        return getWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey)
            .flatMap(
                (Response<QuotaCounterContractInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QuotaCounterContractInner get(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey) {
        return getAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey).block();
    }

    /**
     * Gets the value of the quota counter associated with the counter-key in the policy for the specific period in
     * service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the value of the quota counter associated with the counter-key in the policy for the specific period in
     *     service instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QuotaCounterContractInner> getWithResponse(
        String resourceGroupName, String serviceName, String quotaCounterKey, String quotaPeriodKey, Context context) {
        return getWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, context).block();
    }

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterContractInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
        }
        if (quotaPeriodKey == null) {
            return Mono.error(new IllegalArgumentException("Parameter quotaPeriodKey is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .update(
                            this.client.getEndpoint(),
                            resourceGroupName,
                            serviceName,
                            quotaCounterKey,
                            quotaPeriodKey,
                            this.client.getApiVersion(),
                            this.client.getSubscriptionId(),
                            parameters,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<QuotaCounterContractInner>> updateWithResponseAsync(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters,
        Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceGroupName == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null."));
        }
        if (serviceName == null) {
            return Mono.error(new IllegalArgumentException("Parameter serviceName is required and cannot be null."));
        }
        if (quotaCounterKey == null) {
            return Mono
                .error(new IllegalArgumentException("Parameter quotaCounterKey is required and cannot be null."));
        }
        if (quotaPeriodKey == null) {
            return Mono.error(new IllegalArgumentException("Parameter quotaPeriodKey is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (parameters == null) {
            return Mono.error(new IllegalArgumentException("Parameter parameters is required and cannot be null."));
        } else {
            parameters.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .update(
                this.client.getEndpoint(),
                resourceGroupName,
                serviceName,
                quotaCounterKey,
                quotaPeriodKey,
                this.client.getApiVersion(),
                this.client.getSubscriptionId(),
                parameters,
                accept,
                context);
    }

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<QuotaCounterContractInner> updateAsync(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters) {
        return updateWithResponseAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, parameters)
            .flatMap(
                (Response<QuotaCounterContractInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public QuotaCounterContractInner update(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters) {
        return updateAsync(resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, parameters).block();
    }

    /**
     * Updates an existing quota counter value in the specified service instance.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param quotaCounterKey Quota counter key identifier.This is the result of expression defined in counter-key
     *     attribute of the quota-by-key policy.For Example, if you specify counter-key="boo" in the policy, then it’s
     *     accessible by "boo" counter key. But if it’s defined as counter-key="@("b"+"a")" then it will be accessible
     *     by "ba" key.
     * @param quotaPeriodKey Quota period key identifier.
     * @param parameters The value of the Quota counter to be applied on the specified period.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return quota counter details along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<QuotaCounterContractInner> updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String quotaCounterKey,
        String quotaPeriodKey,
        QuotaCounterValueUpdateContract parameters,
        Context context) {
        return updateWithResponseAsync(
                resourceGroupName, serviceName, quotaCounterKey, quotaPeriodKey, parameters, context)
            .block();
    }
}
