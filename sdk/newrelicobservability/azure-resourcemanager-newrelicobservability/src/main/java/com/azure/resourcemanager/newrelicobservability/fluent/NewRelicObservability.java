// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.newrelicobservability.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for NewRelicObservability class.
 */
public interface NewRelicObservability {
    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the AccountsClient object to access its operations.
     * 
     * @return the AccountsClient object.
     */
    AccountsClient getAccounts();

    /**
     * Gets the MonitorsClient object to access its operations.
     * 
     * @return the MonitorsClient object.
     */
    MonitorsClient getMonitors();

    /**
     * Gets the OrganizationsClient object to access its operations.
     * 
     * @return the OrganizationsClient object.
     */
    OrganizationsClient getOrganizations();

    /**
     * Gets the PlansClient object to access its operations.
     * 
     * @return the PlansClient object.
     */
    PlansClient getPlans();

    /**
     * Gets the BillingInfoesClient object to access its operations.
     * 
     * @return the BillingInfoesClient object.
     */
    BillingInfoesClient getBillingInfoes();

    /**
     * Gets the ConnectedPartnerResourcesClient object to access its operations.
     * 
     * @return the ConnectedPartnerResourcesClient object.
     */
    ConnectedPartnerResourcesClient getConnectedPartnerResources();

    /**
     * Gets the TagRulesClient object to access its operations.
     * 
     * @return the TagRulesClient object.
     */
    TagRulesClient getTagRules();

    /**
     * Gets the MonitoredSubscriptionsClient object to access its operations.
     * 
     * @return the MonitoredSubscriptionsClient object.
     */
    MonitoredSubscriptionsClient getMonitoredSubscriptions();
}
