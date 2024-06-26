// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datalakeanalytics.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datalakeanalytics.models.DebugDataAccessLevel;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallAllowAzureIpsState;
import com.azure.resourcemanager.datalakeanalytics.models.FirewallState;
import com.azure.resourcemanager.datalakeanalytics.models.HiveMetastore;
import com.azure.resourcemanager.datalakeanalytics.models.TierType;
import com.azure.resourcemanager.datalakeanalytics.models.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The account specific properties that are associated with an underlying Data Lake Analytics account. Returned only
 * when retrieving a specific account.
 */
@Fluent
public final class DataLakeAnalyticsAccountProperties extends DataLakeAnalyticsAccountPropertiesBasic {
    /*
     * The default Data Lake Store account associated with this account.
     */
    @JsonProperty(value = "defaultDataLakeStoreAccount", access = JsonProperty.Access.WRITE_ONLY)
    private String defaultDataLakeStoreAccount;

    /*
     * The list of Data Lake Store accounts associated with this account.
     */
    @JsonProperty(value = "dataLakeStoreAccounts", access = JsonProperty.Access.WRITE_ONLY)
    private List<DataLakeStoreAccountInformationInner> dataLakeStoreAccounts;

    /*
     * The list of Data Lake Store accounts associated with this account.
     */
    @JsonProperty(value = "publicDataLakeStoreAccounts")
    private List<DataLakeStoreAccountInformationInner> publicDataLakeStoreAccounts;

    /*
     * The list of Azure Blob Storage accounts associated with this account.
     */
    @JsonProperty(value = "storageAccounts", access = JsonProperty.Access.WRITE_ONLY)
    private List<StorageAccountInformationInner> storageAccounts;

    /*
     * The list of compute policies associated with this account.
     */
    @JsonProperty(value = "computePolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<ComputePolicyInner> computePolicies;

    /*
     * The list of hiveMetastores associated with this account.
     */
    @JsonProperty(value = "hiveMetastores", access = JsonProperty.Access.WRITE_ONLY)
    private List<HiveMetastore> hiveMetastores;

    /*
     * The list of virtualNetwork rules associated with this account.
     */
    @JsonProperty(value = "virtualNetworkRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * The list of firewall rules associated with this account.
     */
    @JsonProperty(value = "firewallRules", access = JsonProperty.Access.WRITE_ONLY)
    private List<FirewallRuleInner> firewallRules;

    /*
     * The current state of the IP address firewall for this account.
     */
    @JsonProperty(value = "firewallState")
    private FirewallState firewallState;

    /*
     * The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall
     * is disabled, this is not enforced.
     */
    @JsonProperty(value = "firewallAllowAzureIps")
    private FirewallAllowAzureIpsState firewallAllowAzureIps;

    /*
     * The commitment tier for the next month.
     */
    @JsonProperty(value = "newTier")
    private TierType newTier;

    /*
     * The commitment tier in use for the current month.
     */
    @JsonProperty(value = "currentTier", access = JsonProperty.Access.WRITE_ONLY)
    private TierType currentTier;

    /*
     * The maximum supported jobs running under the account at the same time.
     */
    @JsonProperty(value = "maxJobCount")
    private Integer maxJobCount;

    /*
     * The maximum supported active jobs under the account at the same time.
     */
    @JsonProperty(value = "maxActiveJobCountPerUser", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxActiveJobCountPerUser;

    /*
     * The maximum supported jobs queued under the account at the same time.
     */
    @JsonProperty(value = "maxQueuedJobCountPerUser", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxQueuedJobCountPerUser;

    /*
     * The maximum supported active jobs under the account at the same time.
     */
    @JsonProperty(value = "maxJobRunningTimeInMin", access = JsonProperty.Access.WRITE_ONLY)
    private Integer maxJobRunningTimeInMin;

    /*
     * The system defined maximum supported jobs running under the account at the same time, which restricts the
     * maximum number of running jobs the user can set for the account.
     */
    @JsonProperty(value = "systemMaxJobCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer systemMaxJobCount;

    /*
     * The maximum supported degree of parallelism for this account.
     */
    @JsonProperty(value = "maxDegreeOfParallelism")
    private Integer maxDegreeOfParallelism;

    /*
     * The system defined maximum supported degree of parallelism for this account, which restricts the maximum value
     * of parallelism the user can set for the account.
     */
    @JsonProperty(value = "systemMaxDegreeOfParallelism", access = JsonProperty.Access.WRITE_ONLY)
    private Integer systemMaxDegreeOfParallelism;

    /*
     * The maximum supported degree of parallelism per job for this account.
     */
    @JsonProperty(value = "maxDegreeOfParallelismPerJob")
    private Integer maxDegreeOfParallelismPerJob;

    /*
     * The minimum supported priority per job for this account.
     */
    @JsonProperty(value = "minPriorityPerJob", access = JsonProperty.Access.WRITE_ONLY)
    private Integer minPriorityPerJob;

    /*
     * The number of days that job metadata is retained.
     */
    @JsonProperty(value = "queryStoreRetention")
    private Integer queryStoreRetention;

    /*
     * The current state of the DebugDataAccessLevel for this account.
     */
    @JsonProperty(value = "debugDataAccessLevel", access = JsonProperty.Access.WRITE_ONLY)
    private DebugDataAccessLevel debugDataAccessLevel;

    /** Creates an instance of DataLakeAnalyticsAccountProperties class. */
    public DataLakeAnalyticsAccountProperties() {
    }

    /**
     * Get the defaultDataLakeStoreAccount property: The default Data Lake Store account associated with this account.
     *
     * @return the defaultDataLakeStoreAccount value.
     */
    public String defaultDataLakeStoreAccount() {
        return this.defaultDataLakeStoreAccount;
    }

    /**
     * Get the dataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     *
     * @return the dataLakeStoreAccounts value.
     */
    public List<DataLakeStoreAccountInformationInner> dataLakeStoreAccounts() {
        return this.dataLakeStoreAccounts;
    }

    /**
     * Get the publicDataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     *
     * @return the publicDataLakeStoreAccounts value.
     */
    public List<DataLakeStoreAccountInformationInner> publicDataLakeStoreAccounts() {
        return this.publicDataLakeStoreAccounts;
    }

    /**
     * Set the publicDataLakeStoreAccounts property: The list of Data Lake Store accounts associated with this account.
     *
     * @param publicDataLakeStoreAccounts the publicDataLakeStoreAccounts value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withPublicDataLakeStoreAccounts(
        List<DataLakeStoreAccountInformationInner> publicDataLakeStoreAccounts) {
        this.publicDataLakeStoreAccounts = publicDataLakeStoreAccounts;
        return this;
    }

    /**
     * Get the storageAccounts property: The list of Azure Blob Storage accounts associated with this account.
     *
     * @return the storageAccounts value.
     */
    public List<StorageAccountInformationInner> storageAccounts() {
        return this.storageAccounts;
    }

    /**
     * Get the computePolicies property: The list of compute policies associated with this account.
     *
     * @return the computePolicies value.
     */
    public List<ComputePolicyInner> computePolicies() {
        return this.computePolicies;
    }

    /**
     * Get the hiveMetastores property: The list of hiveMetastores associated with this account.
     *
     * @return the hiveMetastores value.
     */
    public List<HiveMetastore> hiveMetastores() {
        return this.hiveMetastores;
    }

    /**
     * Get the virtualNetworkRules property: The list of virtualNetwork rules associated with this account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Get the firewallRules property: The list of firewall rules associated with this account.
     *
     * @return the firewallRules value.
     */
    public List<FirewallRuleInner> firewallRules() {
        return this.firewallRules;
    }

    /**
     * Get the firewallState property: The current state of the IP address firewall for this account.
     *
     * @return the firewallState value.
     */
    public FirewallState firewallState() {
        return this.firewallState;
    }

    /**
     * Set the firewallState property: The current state of the IP address firewall for this account.
     *
     * @param firewallState the firewallState value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withFirewallState(FirewallState firewallState) {
        this.firewallState = firewallState;
        return this;
    }

    /**
     * Get the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @return the firewallAllowAzureIps value.
     */
    public FirewallAllowAzureIpsState firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }

    /**
     * Set the firewallAllowAzureIps property: The current state of allowing or disallowing IPs originating within Azure
     * through the firewall. If the firewall is disabled, this is not enforced.
     *
     * @param firewallAllowAzureIps the firewallAllowAzureIps value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withFirewallAllowAzureIps(
        FirewallAllowAzureIpsState firewallAllowAzureIps) {
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        return this;
    }

    /**
     * Get the newTier property: The commitment tier for the next month.
     *
     * @return the newTier value.
     */
    public TierType newTier() {
        return this.newTier;
    }

    /**
     * Set the newTier property: The commitment tier for the next month.
     *
     * @param newTier the newTier value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withNewTier(TierType newTier) {
        this.newTier = newTier;
        return this;
    }

    /**
     * Get the currentTier property: The commitment tier in use for the current month.
     *
     * @return the currentTier value.
     */
    public TierType currentTier() {
        return this.currentTier;
    }

    /**
     * Get the maxJobCount property: The maximum supported jobs running under the account at the same time.
     *
     * @return the maxJobCount value.
     */
    public Integer maxJobCount() {
        return this.maxJobCount;
    }

    /**
     * Set the maxJobCount property: The maximum supported jobs running under the account at the same time.
     *
     * @param maxJobCount the maxJobCount value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withMaxJobCount(Integer maxJobCount) {
        this.maxJobCount = maxJobCount;
        return this;
    }

    /**
     * Get the maxActiveJobCountPerUser property: The maximum supported active jobs under the account at the same time.
     *
     * @return the maxActiveJobCountPerUser value.
     */
    public Integer maxActiveJobCountPerUser() {
        return this.maxActiveJobCountPerUser;
    }

    /**
     * Get the maxQueuedJobCountPerUser property: The maximum supported jobs queued under the account at the same time.
     *
     * @return the maxQueuedJobCountPerUser value.
     */
    public Integer maxQueuedJobCountPerUser() {
        return this.maxQueuedJobCountPerUser;
    }

    /**
     * Get the maxJobRunningTimeInMin property: The maximum supported active jobs under the account at the same time.
     *
     * @return the maxJobRunningTimeInMin value.
     */
    public Integer maxJobRunningTimeInMin() {
        return this.maxJobRunningTimeInMin;
    }

    /**
     * Get the systemMaxJobCount property: The system defined maximum supported jobs running under the account at the
     * same time, which restricts the maximum number of running jobs the user can set for the account.
     *
     * @return the systemMaxJobCount value.
     */
    public Integer systemMaxJobCount() {
        return this.systemMaxJobCount;
    }

    /**
     * Get the maxDegreeOfParallelism property: The maximum supported degree of parallelism for this account.
     *
     * @return the maxDegreeOfParallelism value.
     */
    public Integer maxDegreeOfParallelism() {
        return this.maxDegreeOfParallelism;
    }

    /**
     * Set the maxDegreeOfParallelism property: The maximum supported degree of parallelism for this account.
     *
     * @param maxDegreeOfParallelism the maxDegreeOfParallelism value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withMaxDegreeOfParallelism(Integer maxDegreeOfParallelism) {
        this.maxDegreeOfParallelism = maxDegreeOfParallelism;
        return this;
    }

    /**
     * Get the systemMaxDegreeOfParallelism property: The system defined maximum supported degree of parallelism for
     * this account, which restricts the maximum value of parallelism the user can set for the account.
     *
     * @return the systemMaxDegreeOfParallelism value.
     */
    public Integer systemMaxDegreeOfParallelism() {
        return this.systemMaxDegreeOfParallelism;
    }

    /**
     * Get the maxDegreeOfParallelismPerJob property: The maximum supported degree of parallelism per job for this
     * account.
     *
     * @return the maxDegreeOfParallelismPerJob value.
     */
    public Integer maxDegreeOfParallelismPerJob() {
        return this.maxDegreeOfParallelismPerJob;
    }

    /**
     * Set the maxDegreeOfParallelismPerJob property: The maximum supported degree of parallelism per job for this
     * account.
     *
     * @param maxDegreeOfParallelismPerJob the maxDegreeOfParallelismPerJob value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        this.maxDegreeOfParallelismPerJob = maxDegreeOfParallelismPerJob;
        return this;
    }

    /**
     * Get the minPriorityPerJob property: The minimum supported priority per job for this account.
     *
     * @return the minPriorityPerJob value.
     */
    public Integer minPriorityPerJob() {
        return this.minPriorityPerJob;
    }

    /**
     * Get the queryStoreRetention property: The number of days that job metadata is retained.
     *
     * @return the queryStoreRetention value.
     */
    public Integer queryStoreRetention() {
        return this.queryStoreRetention;
    }

    /**
     * Set the queryStoreRetention property: The number of days that job metadata is retained.
     *
     * @param queryStoreRetention the queryStoreRetention value to set.
     * @return the DataLakeAnalyticsAccountProperties object itself.
     */
    public DataLakeAnalyticsAccountProperties withQueryStoreRetention(Integer queryStoreRetention) {
        this.queryStoreRetention = queryStoreRetention;
        return this;
    }

    /**
     * Get the debugDataAccessLevel property: The current state of the DebugDataAccessLevel for this account.
     *
     * @return the debugDataAccessLevel value.
     */
    public DebugDataAccessLevel debugDataAccessLevel() {
        return this.debugDataAccessLevel;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (dataLakeStoreAccounts() != null) {
            dataLakeStoreAccounts().forEach(e -> e.validate());
        }
        if (publicDataLakeStoreAccounts() != null) {
            publicDataLakeStoreAccounts().forEach(e -> e.validate());
        }
        if (storageAccounts() != null) {
            storageAccounts().forEach(e -> e.validate());
        }
        if (computePolicies() != null) {
            computePolicies().forEach(e -> e.validate());
        }
        if (hiveMetastores() != null) {
            hiveMetastores().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
        if (firewallRules() != null) {
            firewallRules().forEach(e -> e.validate());
        }
    }
}
