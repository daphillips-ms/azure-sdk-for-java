// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.IpsecPolicy;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RoutingConfiguration;
import com.azure.resourcemanager.network.models.TrafficSelectorPolicy;
import com.azure.resourcemanager.network.models.VirtualNetworkGatewayConnectionProtocol;
import com.azure.resourcemanager.network.models.VpnConnectionStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * VpnConnection Resource.
 */
@Fluent
public final class VpnConnectionInner extends SubResource {
    /*
     * Properties of the VPN connection.
     */
    @JsonProperty(value = "properties")
    private VpnConnectionProperties innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Creates an instance of VpnConnectionInner class.
     */
    public VpnConnectionInner() {
    }

    /**
     * Get the innerProperties property: Properties of the VPN connection.
     * 
     * @return the innerProperties value.
     */
    private VpnConnectionProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     * 
     * @param name the name value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     * 
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public VpnConnectionInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the remoteVpnSite property: Id of the connected vpn site.
     * 
     * @return the remoteVpnSite value.
     */
    public SubResource remoteVpnSite() {
        return this.innerProperties() == null ? null : this.innerProperties().remoteVpnSite();
    }

    /**
     * Set the remoteVpnSite property: Id of the connected vpn site.
     * 
     * @param remoteVpnSite the remoteVpnSite value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRemoteVpnSite(SubResource remoteVpnSite) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withRemoteVpnSite(remoteVpnSite);
        return this;
    }

    /**
     * Get the routingWeight property: Routing weight for vpn connection.
     * 
     * @return the routingWeight value.
     */
    public Integer routingWeight() {
        return this.innerProperties() == null ? null : this.innerProperties().routingWeight();
    }

    /**
     * Set the routingWeight property: Routing weight for vpn connection.
     * 
     * @param routingWeight the routingWeight value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRoutingWeight(Integer routingWeight) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withRoutingWeight(routingWeight);
        return this;
    }

    /**
     * Get the dpdTimeoutSeconds property: DPD timeout in seconds for vpn connection.
     * 
     * @return the dpdTimeoutSeconds value.
     */
    public Integer dpdTimeoutSeconds() {
        return this.innerProperties() == null ? null : this.innerProperties().dpdTimeoutSeconds();
    }

    /**
     * Set the dpdTimeoutSeconds property: DPD timeout in seconds for vpn connection.
     * 
     * @param dpdTimeoutSeconds the dpdTimeoutSeconds value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withDpdTimeoutSeconds(Integer dpdTimeoutSeconds) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withDpdTimeoutSeconds(dpdTimeoutSeconds);
        return this;
    }

    /**
     * Get the connectionStatus property: The connection status.
     * 
     * @return the connectionStatus value.
     */
    public VpnConnectionStatus connectionStatus() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionStatus();
    }

    /**
     * Get the vpnConnectionProtocolType property: Connection protocol used for this connection.
     * 
     * @return the vpnConnectionProtocolType value.
     */
    public VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnConnectionProtocolType();
    }

    /**
     * Set the vpnConnectionProtocolType property: Connection protocol used for this connection.
     * 
     * @param vpnConnectionProtocolType the vpnConnectionProtocolType value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner
        withVpnConnectionProtocolType(VirtualNetworkGatewayConnectionProtocol vpnConnectionProtocolType) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withVpnConnectionProtocolType(vpnConnectionProtocolType);
        return this;
    }

    /**
     * Get the ingressBytesTransferred property: Ingress bytes transferred.
     * 
     * @return the ingressBytesTransferred value.
     */
    public Long ingressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().ingressBytesTransferred();
    }

    /**
     * Get the egressBytesTransferred property: Egress bytes transferred.
     * 
     * @return the egressBytesTransferred value.
     */
    public Long egressBytesTransferred() {
        return this.innerProperties() == null ? null : this.innerProperties().egressBytesTransferred();
    }

    /**
     * Get the connectionBandwidth property: Expected bandwidth in MBPS.
     * 
     * @return the connectionBandwidth value.
     */
    public Integer connectionBandwidth() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionBandwidth();
    }

    /**
     * Set the connectionBandwidth property: Expected bandwidth in MBPS.
     * 
     * @param connectionBandwidth the connectionBandwidth value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withConnectionBandwidth(Integer connectionBandwidth) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withConnectionBandwidth(connectionBandwidth);
        return this;
    }

    /**
     * Get the sharedKey property: SharedKey for the vpn connection.
     * 
     * @return the sharedKey value.
     */
    public String sharedKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedKey();
    }

    /**
     * Set the sharedKey property: SharedKey for the vpn connection.
     * 
     * @param sharedKey the sharedKey value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withSharedKey(String sharedKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withSharedKey(sharedKey);
        return this;
    }

    /**
     * Get the enableBgp property: EnableBgp flag.
     * 
     * @return the enableBgp value.
     */
    public Boolean enableBgp() {
        return this.innerProperties() == null ? null : this.innerProperties().enableBgp();
    }

    /**
     * Set the enableBgp property: EnableBgp flag.
     * 
     * @param enableBgp the enableBgp value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableBgp(Boolean enableBgp) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withEnableBgp(enableBgp);
        return this;
    }

    /**
     * Get the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     * 
     * @return the usePolicyBasedTrafficSelectors value.
     */
    public Boolean usePolicyBasedTrafficSelectors() {
        return this.innerProperties() == null ? null : this.innerProperties().usePolicyBasedTrafficSelectors();
    }

    /**
     * Set the usePolicyBasedTrafficSelectors property: Enable policy-based traffic selectors.
     * 
     * @param usePolicyBasedTrafficSelectors the usePolicyBasedTrafficSelectors value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withUsePolicyBasedTrafficSelectors(Boolean usePolicyBasedTrafficSelectors) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withUsePolicyBasedTrafficSelectors(usePolicyBasedTrafficSelectors);
        return this;
    }

    /**
     * Get the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     * 
     * @return the ipsecPolicies value.
     */
    public List<IpsecPolicy> ipsecPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().ipsecPolicies();
    }

    /**
     * Set the ipsecPolicies property: The IPSec Policies to be considered by this connection.
     * 
     * @param ipsecPolicies the ipsecPolicies value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withIpsecPolicies(List<IpsecPolicy> ipsecPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withIpsecPolicies(ipsecPolicies);
        return this;
    }

    /**
     * Get the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     * 
     * @return the trafficSelectorPolicies value.
     */
    public List<TrafficSelectorPolicy> trafficSelectorPolicies() {
        return this.innerProperties() == null ? null : this.innerProperties().trafficSelectorPolicies();
    }

    /**
     * Set the trafficSelectorPolicies property: The Traffic Selector Policies to be considered by this connection.
     * 
     * @param trafficSelectorPolicies the trafficSelectorPolicies value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withTrafficSelectorPolicies(List<TrafficSelectorPolicy> trafficSelectorPolicies) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withTrafficSelectorPolicies(trafficSelectorPolicies);
        return this;
    }

    /**
     * Get the enableRateLimiting property: EnableBgp flag.
     * 
     * @return the enableRateLimiting value.
     */
    public Boolean enableRateLimiting() {
        return this.innerProperties() == null ? null : this.innerProperties().enableRateLimiting();
    }

    /**
     * Set the enableRateLimiting property: EnableBgp flag.
     * 
     * @param enableRateLimiting the enableRateLimiting value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableRateLimiting(Boolean enableRateLimiting) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withEnableRateLimiting(enableRateLimiting);
        return this;
    }

    /**
     * Get the enableInternetSecurity property: Enable internet security.
     * 
     * @return the enableInternetSecurity value.
     */
    public Boolean enableInternetSecurity() {
        return this.innerProperties() == null ? null : this.innerProperties().enableInternetSecurity();
    }

    /**
     * Set the enableInternetSecurity property: Enable internet security.
     * 
     * @param enableInternetSecurity the enableInternetSecurity value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withEnableInternetSecurity(Boolean enableInternetSecurity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withEnableInternetSecurity(enableInternetSecurity);
        return this;
    }

    /**
     * Get the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     * 
     * @return the useLocalAzureIpAddress value.
     */
    public Boolean useLocalAzureIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().useLocalAzureIpAddress();
    }

    /**
     * Set the useLocalAzureIpAddress property: Use local azure ip to initiate connection.
     * 
     * @param useLocalAzureIpAddress the useLocalAzureIpAddress value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withUseLocalAzureIpAddress(Boolean useLocalAzureIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withUseLocalAzureIpAddress(useLocalAzureIpAddress);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the VPN connection resource.
     * 
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     * 
     * @return the vpnLinkConnections value.
     */
    public List<VpnSiteLinkConnectionInner> vpnLinkConnections() {
        return this.innerProperties() == null ? null : this.innerProperties().vpnLinkConnections();
    }

    /**
     * Set the vpnLinkConnections property: List of all vpn site link connections to the gateway.
     * 
     * @param vpnLinkConnections the vpnLinkConnections value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withVpnLinkConnections(List<VpnSiteLinkConnectionInner> vpnLinkConnections) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withVpnLinkConnections(vpnLinkConnections);
        return this;
    }

    /**
     * Get the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     * 
     * @return the routingConfiguration value.
     */
    public RoutingConfiguration routingConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().routingConfiguration();
    }

    /**
     * Set the routingConfiguration property: The Routing Configuration indicating the associated and propagated route
     * tables on this connection.
     * 
     * @param routingConfiguration the routingConfiguration value to set.
     * @return the VpnConnectionInner object itself.
     */
    public VpnConnectionInner withRoutingConfiguration(RoutingConfiguration routingConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VpnConnectionProperties();
        }
        this.innerProperties().withRoutingConfiguration(routingConfiguration);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
