// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.apimanagement.fluent.models.ApiReleaseContractInner;
import com.azure.resourcemanager.apimanagement.models.ApiReleasesCreateOrUpdateResponse;
import com.azure.resourcemanager.apimanagement.models.ApiReleasesGetEntityTagResponse;
import com.azure.resourcemanager.apimanagement.models.ApiReleasesGetResponse;
import com.azure.resourcemanager.apimanagement.models.ApiReleasesUpdateResponse;

/** An instance of this class provides access to all the operations defined in ApiReleasesClient. */
public interface ApiReleasesClient {
    /**
     * Lists all releases of an API. An API release is created when making an API Revision current. Releases are also
     * used to rollback to previous revisions. Results will be paged and can be constrained by the $top and $skip
     * parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged ApiRelease list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiReleaseContractInner> listByService(String resourceGroupName, String serviceName, String apiId);

    /**
     * Lists all releases of an API. An API release is created when making an API Revision current. Releases are also
     * used to rollback to previous revisions. Results will be paged and can be constrained by the $top and $skip
     * parameters.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param filter | Field | Usage | Supported operators | Supported functions
     *     |&lt;/br&gt;|-------------|-------------|-------------|-------------|&lt;/br&gt;| notes | filter | ge, le,
     *     eq, ne, gt, lt | substringof, contains, startswith, endswith |&lt;/br&gt;.
     * @param top Number of records to return.
     * @param skip Number of records to skip.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return paged ApiRelease list representation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ApiReleaseContractInner> listByService(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String filter,
        Integer top,
        Integer skip,
        Context context);

    /**
     * Returns the etag of an API release.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void getEntityTag(String resourceGroupName, String serviceName, String apiId, String releaseId);

    /**
     * Returns the etag of an API release.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleasesGetEntityTagResponse getEntityTagWithResponse(
        String resourceGroupName, String serviceName, String apiId, String releaseId, Context context);

    /**
     * Returns the details of an API release.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apiRelease details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleaseContractInner get(String resourceGroupName, String serviceName, String apiId, String releaseId);

    /**
     * Returns the details of an API release.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apiRelease details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleasesGetResponse getWithResponse(
        String resourceGroupName, String serviceName, String apiId, String releaseId, Context context);

    /**
     * Creates a new Release for the API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apiRelease details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleaseContractInner createOrUpdate(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String releaseId,
        ApiReleaseContractInner parameters);

    /**
     * Creates a new Release for the API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param parameters Create parameters.
     * @param ifMatch ETag of the Entity. Not required when creating an entity, but required when updating an entity.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apiRelease details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleasesCreateOrUpdateResponse createOrUpdateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String releaseId,
        ApiReleaseContractInner parameters,
        String ifMatch,
        Context context);

    /**
     * Updates the details of the release of the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters API Release Update parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apiRelease details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleaseContractInner update(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String releaseId,
        String ifMatch,
        ApiReleaseContractInner parameters);

    /**
     * Updates the details of the release of the API specified by its identifier.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param parameters API Release Update parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return apiRelease details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    ApiReleasesUpdateResponse updateWithResponse(
        String resourceGroupName,
        String serviceName,
        String apiId,
        String releaseId,
        String ifMatch,
        ApiReleaseContractInner parameters,
        Context context);

    /**
     * Deletes the specified release in the API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serviceName, String apiId, String releaseId, String ifMatch);

    /**
     * Deletes the specified release in the API.
     *
     * @param resourceGroupName The name of the resource group.
     * @param serviceName The name of the API Management service.
     * @param apiId API identifier. Must be unique in the current API Management service instance.
     * @param releaseId Release identifier within an API. Must be unique in the current API Management service instance.
     * @param ifMatch ETag of the Entity. ETag should match the current entity state from the header response of the GET
     *     request or it should be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(
        String resourceGroupName, String serviceName, String apiId, String releaseId, String ifMatch, Context context);
}
