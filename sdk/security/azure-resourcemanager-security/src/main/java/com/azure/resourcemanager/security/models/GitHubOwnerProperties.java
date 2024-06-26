// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/**
 * GitHub Owner properties.
 */
@Fluent
public final class GitHubOwnerProperties {
    /*
     * Gets or sets resource status message.
     */
    @JsonProperty(value = "provisioningStatusMessage", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningStatusMessage;

    /*
     * Gets or sets time when resource was last checked.
     */
    @JsonProperty(value = "provisioningStatusUpdateTimeUtc", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime provisioningStatusUpdateTimeUtc;

    /*
     * The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     */
    @JsonProperty(value = "provisioningState")
    private DevOpsProvisioningState provisioningState;

    /*
     * Gets or sets GitHub Owner url.
     */
    @JsonProperty(value = "ownerUrl", access = JsonProperty.Access.WRITE_ONLY)
    private String ownerUrl;

    /*
     * Gets or sets internal GitHub id.
     */
    @JsonProperty(value = "gitHubInternalId", access = JsonProperty.Access.WRITE_ONLY)
    private String gitHubInternalId;

    /*
     * Details about resource onboarding status across all connectors.
     * 
     * OnboardedByOtherConnector - this resource has already been onboarded to another connector. This is only
     * applicable to top-level resources.
     * Onboarded - this resource has already been onboarded by the specified connector.
     * NotOnboarded - this resource has not been onboarded to any connector.
     * NotApplicable - the onboarding state is not applicable to the current endpoint.
     */
    @JsonProperty(value = "onboardingState")
    private OnboardingState onboardingState;

    /**
     * Creates an instance of GitHubOwnerProperties class.
     */
    public GitHubOwnerProperties() {
    }

    /**
     * Get the provisioningStatusMessage property: Gets or sets resource status message.
     * 
     * @return the provisioningStatusMessage value.
     */
    public String provisioningStatusMessage() {
        return this.provisioningStatusMessage;
    }

    /**
     * Get the provisioningStatusUpdateTimeUtc property: Gets or sets time when resource was last checked.
     * 
     * @return the provisioningStatusUpdateTimeUtc value.
     */
    public OffsetDateTime provisioningStatusUpdateTimeUtc() {
        return this.provisioningStatusUpdateTimeUtc;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     * 
     * @return the provisioningState value.
     */
    public DevOpsProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState property: The provisioning state of the resource.
     * 
     * Pending - Provisioning pending.
     * Failed - Provisioning failed.
     * Succeeded - Successful provisioning.
     * Canceled - Provisioning canceled.
     * PendingDeletion - Deletion pending.
     * DeletionSuccess - Deletion successful.
     * DeletionFailure - Deletion failure.
     * 
     * @param provisioningState the provisioningState value to set.
     * @return the GitHubOwnerProperties object itself.
     */
    public GitHubOwnerProperties withProvisioningState(DevOpsProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the ownerUrl property: Gets or sets GitHub Owner url.
     * 
     * @return the ownerUrl value.
     */
    public String ownerUrl() {
        return this.ownerUrl;
    }

    /**
     * Get the gitHubInternalId property: Gets or sets internal GitHub id.
     * 
     * @return the gitHubInternalId value.
     */
    public String gitHubInternalId() {
        return this.gitHubInternalId;
    }

    /**
     * Get the onboardingState property: Details about resource onboarding status across all connectors.
     * 
     * OnboardedByOtherConnector - this resource has already been onboarded to another connector. This is only
     * applicable to top-level resources.
     * Onboarded - this resource has already been onboarded by the specified connector.
     * NotOnboarded - this resource has not been onboarded to any connector.
     * NotApplicable - the onboarding state is not applicable to the current endpoint.
     * 
     * @return the onboardingState value.
     */
    public OnboardingState onboardingState() {
        return this.onboardingState;
    }

    /**
     * Set the onboardingState property: Details about resource onboarding status across all connectors.
     * 
     * OnboardedByOtherConnector - this resource has already been onboarded to another connector. This is only
     * applicable to top-level resources.
     * Onboarded - this resource has already been onboarded by the specified connector.
     * NotOnboarded - this resource has not been onboarded to any connector.
     * NotApplicable - the onboarding state is not applicable to the current endpoint.
     * 
     * @param onboardingState the onboardingState value to set.
     * @return the GitHubOwnerProperties object itself.
     */
    public GitHubOwnerProperties withOnboardingState(OnboardingState onboardingState) {
        this.onboardingState = onboardingState;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
